package com.Manioudaki.Manioudaki_app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String home() {
        return "EnglishPages/mainMenu";
    }

    @GetMapping("/mainGR")
    public String greek() {
        return "GreekPages/mainMenuGR";
    }

    @GetMapping("/about")
    public String about() {
        return "EnglishPages/aboutMe";
    }

    @GetMapping("/aboutGR")
    public String aboutGR() {
        return "GreekPages/aboutMeGR";
    }

    @GetMapping("/news")
    public String news() {
        return "EnglishPages/news";
    }

    @GetMapping("/newsGR")
    public String newsGR() {
        return "GreekPages/newsGR";
    }

    @GetMapping("/projects")
    public String projects() {
        return "EnglishPages/projects";
    }

    @GetMapping("/projectsGR")
    public String projectsGR() {
        return "GreekPages/projectsGR";
    }

    @GetMapping("/exhibitions")
    public String exhibitions() {
        return "EnglishPages/exhibitions";
    }

    @GetMapping("/exhibitionsGR")
    public String exhibitionsGR() {
        return "GreekPages/exhibitionsGR";
    }

    @GetMapping("/project1")
    public String project1() {
        return "EnglishPages/project1.html";
    }

}
