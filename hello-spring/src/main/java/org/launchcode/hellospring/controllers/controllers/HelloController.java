package org.launchcode.hellospring.controllers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";

    }
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model)  {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello")
    @ResponseBody
    public String sayHello(@RequestParam String name, @RequestParam String language) {
        return createMessage(name, language);
    }
    public static String createMessage(String name, String language) {
        String result = "";
        if(language.equals("english")) {
            result = "Hello, " + name;
        } else if(language.equals("spanish")) {
            result = "Hola, " + name;
        } else if(language.equals("dutch")) {
            result = "Hallo, " + name;
        } else if(language.equals("ukrainian")) {
            result = "Pryvit, " + name;
        } else if(language.equals("latin")) {
            result = "Salve, " + name;
        }
        return result;
    }
    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return"hello-lists";


    }
}