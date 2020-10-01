package com.yeonji.sanggoe.plastic.controller;

import com.yeonji.sanggoe.plastic.service.CalculateService;
import com.yeonji.sanggoe.plastic.service.DateObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    CalculateService calculateService;

    @Autowired
    public CalculatorController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(value = "/survey1")
    public String confirmSurvey(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "/calculator/survey1";
    }

    @PostMapping("/survey2")
    public String confirmSurvey2(@RequestParam("name") String name, // before data
                                 @RequestParam("pet1") int pet1,
                                 @RequestParam("pet2") int pet2,
                                 @RequestParam("contain") int contain,
                                 @RequestParam("eggPlt") int eggPlt,
                                 @RequestParam("glove") int glove,
                                 @RequestParam("bagSmall") int bagSmall,
                                 Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        return "/calculator/survey2";
    }

    @PostMapping("/survey3")
    public String confirmSurvey3(@RequestParam("name") String name,
                                 @RequestParam("pet1") int pet1,
                                 @RequestParam("pet2") int pet2,
                                 @RequestParam("contain") int contain,
                                 @RequestParam("eggPlt") int eggPlt,
                                 @RequestParam("glove") int glove,
                                 @RequestParam("bagSmall") int bagSmall, // before data

                                 @RequestParam("bagMiddle") int bagMiddle,
                                 @RequestParam("bagBig") int bagBig,
                                 @RequestParam("deliveFood") int deliveFood,
                                 @RequestParam("spoon") int spoon,
                                 @RequestParam("straw") int straw,
                                 @RequestParam("cup") int cup,
                                 Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("deliveFood", deliveFood);
        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);

        return "/calculator/survey3";
    }

    @PostMapping("/waiting")
    public String waitingPage(@RequestParam("name") String name,
                              @RequestParam("pet1") int pet1,
                              @RequestParam("pet2") int pet2,
                              @RequestParam("contain") int contain,
                              @RequestParam("eggPlt") int eggPlt,
                              @RequestParam("glove") int glove,
                              @RequestParam("bagSmall") int bagSmall, // before data

                              @RequestParam("bagMiddle") int bagMiddle,
                              @RequestParam("bagBig") int bagBig,
                              @RequestParam("deliveFood") int deliveFood,
                              @RequestParam("spoon") int spoon,
                              @RequestParam("straw") int straw,
                              @RequestParam("cup") int cup,

                              @RequestParam("clean1") int clean1,
                              @RequestParam("shampoo") int shampoo,
                              @RequestParam("toothBrush") int toothBrush,
                              @RequestParam("toothPaste") int toothPaste,
                              @RequestParam("clean2") int clean2,
                              @RequestParam("cosmetic") int cosmetic,
                              Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("deliveFood", deliveFood);
        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);

        model.addAttribute("clean1", clean1);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);

        return "/result/waiting";
    }

    @PostMapping("/scores")
    public String showScores(@RequestParam("name") String name,
                             @RequestParam("pet1") int pet1,
                             @RequestParam("pet2") int pet2,
                             @RequestParam("contain") int contain,
                             @RequestParam("eggPlt") int eggPlt,
                             @RequestParam("glove") int glove,
                             @RequestParam("bagSmall") int bagSmall, // before data

                             @RequestParam("bagMiddle") int bagMiddle,
                             @RequestParam("bagBig") int bagBig,
                             @RequestParam("deliveFood") int deliveFood,
                             @RequestParam("spoon") int spoon,
                             @RequestParam("straw") int straw,
                             @RequestParam("cup") int cup,

                             @RequestParam("clean1") int clean1,
                             @RequestParam("shampoo") int shampoo,
                             @RequestParam("toothBrush") int toothBrush,
                             @RequestParam("toothPaste") int toothPaste,
                             @RequestParam("clean2") int clean2,
                             @RequestParam("cosmetic") int cosmetic,
                             Model model) {

        model.addAttribute("name", name);
        model.addAttribute("today", DateObj.getInstance().toString());

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("deliveFood", deliveFood);
        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);

        model.addAttribute("clean1", clean1);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);

        return "/result/scores";
    }

    @PostMapping("/result1")
    public String showResult1(@RequestParam("name") String name,
                              @RequestParam("pet1") int pet1,
                              @RequestParam("pet2") int pet2,
                              @RequestParam("contain") int contain,
                              @RequestParam("eggPlt") int eggPlt,
                              @RequestParam("glove") int glove,
                              @RequestParam("bagSmall") int bagSmall, // before data

                              @RequestParam("bagMiddle") int bagMiddle,
                              @RequestParam("bagBig") int bagBig,
                              @RequestParam("deliveFood") int deliveFood,
                              @RequestParam("spoon") int spoon,
                              @RequestParam("straw") int straw,
                              @RequestParam("cup") int cup,

                              @RequestParam("clean1") int clean1,
                              @RequestParam("shampoo") int shampoo,
                              @RequestParam("toothBrush") int toothBrush,
                              @RequestParam("toothPaste") int toothPaste,
                              @RequestParam("clean2") int clean2,
                              @RequestParam("cosmetic") int cosmetic,
                              Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("deliveFood", deliveFood);
        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);

        model.addAttribute("clean1", clean1);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);

        return "/result/result1";
    }

    @PostMapping("/result2")
    public String showResult2(@RequestParam("name") String name,
                              @RequestParam("pet1") int pet1,
                              @RequestParam("pet2") int pet2,
                              @RequestParam("contain") int contain,
                              @RequestParam("eggPlt") int eggPlt,
                              @RequestParam("glove") int glove,
                              @RequestParam("bagSmall") int bagSmall, // before data

                              @RequestParam("bagMiddle") int bagMiddle,
                              @RequestParam("bagBig") int bagBig,
                              @RequestParam("deliveFood") int deliveFood,
                              @RequestParam("spoon") int spoon,
                              @RequestParam("straw") int straw,
                              @RequestParam("cup") int cup,

                              @RequestParam("clean1") int clean1,
                              @RequestParam("shampoo") int shampoo,
                              @RequestParam("toothBrush") int toothBrush,
                              @RequestParam("toothPaste") int toothPaste,
                              @RequestParam("clean2") int clean2,
                              @RequestParam("cosmetic") int cosmetic,
                              Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("deliveFood", deliveFood);
        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);

        model.addAttribute("clean1", clean1);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);

        return "/result/result2";
    }

    @PostMapping("/replace")
    public String showReport(@RequestParam("name") String name,
                             @RequestParam("pet1") int pet1,
                             @RequestParam("pet2") int pet2,
                             @RequestParam("contain") int contain,
                             @RequestParam("eggPlt") int eggPlt,
                             @RequestParam("glove") int glove,
                             @RequestParam("bagSmall") int bagSmall, // before data

                             @RequestParam("bagMiddle") int bagMiddle,
                             @RequestParam("bagBig") int bagBig,
                             @RequestParam("deliveFood") int deliveFood,
                             @RequestParam("spoon") int spoon,
                             @RequestParam("straw") int straw,
                             @RequestParam("cup") int cup,

                             @RequestParam("clean1") int clean1,
                             @RequestParam("shampoo") int shampoo,
                             @RequestParam("toothBrush") int toothBrush,
                             @RequestParam("toothPaste") int toothPaste,
                             @RequestParam("clean2") int clean2,
                             @RequestParam("cosmetic") int cosmetic,
                             Model model) {

        model.addAttribute("name", name);
        model.addAttribute("today", DateObj.getInstance().toString());

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("deliveFood", deliveFood);
        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);

        model.addAttribute("clean1", clean1);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);

        return "/result/replace";
    }

    @PostMapping("/determination")
    public String showDetermination(@RequestParam("name") String name,
                                    @RequestParam("pet1") int pet1,
                                    @RequestParam("pet2") int pet2,
                                    @RequestParam("contain") int contain,
                                    @RequestParam("eggPlt") int eggPlt,
                                    @RequestParam("glove") int glove,
                                    @RequestParam("bagSmall") int bagSmall, // before data

                                    @RequestParam("bagMiddle") int bagMiddle,
                                    @RequestParam("bagBig") int bagBig,
                                    @RequestParam("deliveFood") int deliveFood,
                                    @RequestParam("spoon") int spoon,
                                    @RequestParam("straw") int straw,
                                    @RequestParam("cup") int cup,

                                    @RequestParam("clean1") int clean1,
                                    @RequestParam("shampoo") int shampoo,
                                    @RequestParam("toothBrush") int toothBrush,
                                    @RequestParam("toothPaste") int toothPaste,
                                    @RequestParam("clean2") int clean2,
                                    @RequestParam("cosmetic") int cosmetic,
                                    Model model) {

        model.addAttribute("name", name);
        model.addAttribute("today", DateObj.getInstance().toString());

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("deliveFood", deliveFood);
        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);

        model.addAttribute("clean1", clean1);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);

        return "/result/determination";
    }
}
