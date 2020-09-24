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
        model.addAttribute("page", info.getPage());

        return "/calculator/survey2";
    }

    @PostMapping("/survey3")
    public String confirmSurvey3(@RequestParam("shampoo") int shampoo, @RequestParam("toothBrush") int toothBrush,
                                 @RequestParam("toothPaste") int toothPaste, @RequestParam("clean2") int clean2,
                                 @RequestParam("cosmetic") int cosmetic, @RequestParam("deliveFood") int deliveFood, Model model) {
        info.setPage(3);
        info.setPlasticShampoo(shampoo);
        info.setPlasticToothbrush(toothBrush);
        info.setPlasticToothpaste(toothPaste);
        info.setPlasticCleansing(clean2);
        info.setPlasticCosmetics(cosmetic);
        info.setPlasticOrderFood(deliveFood);

        model.addAttribute("name", info.getName());
        model.addAttribute("page", info.getPage());

        return "/calculator/survey3";
    }

    @PostMapping("/waiting")
    public String waitingPage(@RequestParam("spoon") int spoon, @RequestParam("straw") int straw,
                              @RequestParam("cup") int cup, @RequestParam("bagBig") int bagBig,
                              @RequestParam("bagMiddle") int bagMiddle, @RequestParam("bagSmall") int bagSmall, Model model) {
        info.setPage(4);
        info.setPlasticSpoon(spoon);
        info.setPlasticStraw(straw);
        info.setPlasticTakeoutCup(cup);
        info.setPlasticBagBig(bagBig);
        info.setPlasticBagMiddle(bagMiddle);
        info.setPlasticBagSmall(bagSmall);

        model.addAttribute("name", info.getName());
        model.addAttribute("page", info.getPage());

        return "/calculator/waiting";
    }

    @PostMapping("/result1")
    public String showResult1() {
        return "/calculator/result1";
    }
}
