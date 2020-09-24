package com.yeonji.sanggoe.plastic.controller;

import com.yeonji.sanggoe.plastic.domain.UserInformation;
import com.yeonji.sanggoe.plastic.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    CalculateService calculateService;
    UserInformation info = new UserInformation();

    @Autowired
    public CalculatorController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(value = "/calculator/survey1")
    public String confirmSurvey(@RequestParam("name") String name, Model model) {
        info.setName(name);
        info.setPage(1);
        model.addAttribute("name", name);
        model.addAttribute("page", info.getPage());
        return "/calculator/survey1";
    }

    @PostMapping("/survey2")
    public String confirmSurvey2(@RequestParam("pet1") int pet1, @RequestParam("pet2") int pet2,
                                 @RequestParam("contain") int contain, @RequestParam("eggPlt") int eggPlt,
                                 @RequestParam("glove") int glove, @RequestParam("clean1") int clean1, Model model) {
        info.setPage(2);
        info.setPlasticPetBigBottle(pet1);
        info.setPlasticPetSmallBottle(pet2);
        info.setPlasticContainer(contain);
        info.setPlasticEggPlate(eggPlt);
        info.setPlasticGlove(glove);
        info.setPlasticCleanner(clean1);
        model.addAttribute("name", info.getName());
        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);
        return "/calculator/survey2";
    }

    @PostMapping("/waiting")
    public String waitingPage(Model model) {
        info.setPage(4);
        model.addAttribute("name", info.getName());
        model.addAttribute("page", info.getPage());
        return "/calculator/waiting";
    }

    @PostMapping("/result1")
    public String showResult1() {
        return "/calculator/result1";
    }
}
