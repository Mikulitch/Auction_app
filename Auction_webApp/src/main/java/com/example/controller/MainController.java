package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Главная страница");
        return "home";
    }
  /*  @GetMapping("/news")
    public String news(Model model) {
        model.addAttribute("name", "Главная страница");
        return "home";
    }*/

/*    @GetMapping("/auction")
    public String auctions(Model model) {
        model.addAttribute("name", "Главная страница");
        return "auction";
    }*/

    @GetMapping("/contacts")
    public String contact(Model model) {
        model.addAttribute("name", "Главная страница");
        return "contacts";
    }

/*
    @GetMapping("/freepont")
    public String freePont(Model model) {
        model.addAttribute("name", "Свободные участки");
        return "freepont";
    }
*/


    @GetMapping("/search")
    public String pontSearch(Model model) {
        model.addAttribute("name", "Поиск");
        return "search";
    }



}
