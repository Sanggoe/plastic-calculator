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
    UserInformation information = new UserInformation();

    @Autowired
    public CalculatorController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(value = "/calculator/survey1")
    public String confirmSurvey(@RequestParam("name") String name, Model model) {
        information.setName(name);
        information.setPage(1);
        model.addAttribute("name", name);
        model.addAttribute("page", information.getPage());
        return "/calculator/survey1";
    }

    @PostMapping("/survey2")
    public String confirmSurvey2(@RequestParam("pet1") int pet1, @RequestParam("pet2") int pet2,
                                 @RequestParam("contain") int contain, @RequestParam("eggPlt") int eggPlt,
                                 @RequestParam("glove") int glove, @RequestParam("clean1") int clean1, Model model) {
        information.setPlasticPetBigBottle(pet1);
        information.setPlasticPetSmallBottle(pet2);
        information.setPlasticContainer(contain);
        information.setPlasticEggPlate(eggPlt);
        information.setPlasticGlove(glove);
        information.setPlasticCleanner(clean1);
        model.addAttribute("name", information.getName());
        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);
        return "test2";
    }

//    @GetMapping("/calculator/survey")
//    @ResponseBody
//    public Inform informApi(@RequestParam("name") String name) {
//        Inform inform = new Inform();
//        inform.setName(name);
//        return inform;
//    }
}
