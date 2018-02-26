package com.jonaszwiacek.Controllers;

import com.jonaszwiacek.Coursify.Course;
import com.jonaszwiacek.Coursify.Timetable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@SessionAttributes("timetable")
public class TimetableController {

    @RequestMapping(value = {"/timetable", "timetable/*"}, method = GET)
    public String getTimetableController(Model model) {
        addSessionAttributes(model);
        return "timetable";
    }

    private void addSessionAttributes(Model model) {
        if(!model.containsAttribute("timetable")) {
            model.addAttribute("timetable", new Timetable());
            model.addAttribute("groups", new Object());
        }
        if(!model.containsAttribute("course")) model.addAttribute("course", new Course());

        if(!model.containsAttribute("days")) {
            String[] days = {"MONDAY", "TUESDAY", "WEDNESDAY",
                    "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
            model.addAttribute("days", days);
        }
    }

    @RequestMapping(value = "/timetable", method = POST)
    public String timetableController(@ModelAttribute("course") Course course, BindingResult result, ModelMap modelMap, Model model) {
        if(course != null && course.getName() != null){
            course.code();
            ((Timetable)modelMap.get("timetable")).add(course);
            System.out.println(modelMap.get("groups"));
        }
        return "redirect:timetable";
    }

    @RequestMapping(value = "/timetable/{code}", method = DELETE)
    public String remove(@ModelAttribute("course") Course course, BindingResult result, ModelMap model, @PathVariable String code) {
        ((Timetable)model.get("timetable")).remove(code);
        return "redirect:";
    }
}
