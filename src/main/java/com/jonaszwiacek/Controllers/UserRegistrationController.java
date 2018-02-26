package com.jonaszwiacek.Controllers;

import com.jonaszwiacek.Model.User;
import com.jonaszwiacek.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @GetMapping
    public String showregisterForm() {
        return "register";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
        User emailExists = userService.getUserByEmail(user.getEmail());
        User userExists = userService.getUserByUsername(user.getUsername());
        if (emailExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the email provided");
        }
        if (userExists != null) {
            bindingResult
                    .rejectValue("username", "error.user",
                            "There is already a user registered with that username");
        }
        if (bindingResult.hasErrors()) {
            return "register";
        }
        userService.addUser(user);
        return "redirect:/register?success";
    }
}
