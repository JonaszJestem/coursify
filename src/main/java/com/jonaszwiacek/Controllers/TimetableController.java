package com.jonaszwiacek.Controllers;

import com.jonaszwiacek.Coursify.Course;
import com.jonaszwiacek.Coursify.Timetable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@SessionAttributes("timetable")
public class TimetableController {

    @RequestMapping(value = "/timetable", method = GET)
    public String getTimetableController(Model model) {
        if(!model.containsAttribute("timetable")) model.addAttribute("timetable", new Timetable());
        if(!model.containsAttribute("course")) model.addAttribute("course", new Course());
        return "timetable";
    }

    @RequestMapping(value = "/timetable", method = POST)
    public String timetableController(@ModelAttribute("course") Course course, BindingResult result, ModelMap model) {
        System.out.println(model.get("timetable"));
        System.out.println(course);
        ((Timetable)model.get("timetable")).add(course);
        return "timetable";
    }
}
