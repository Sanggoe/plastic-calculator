package com.yeonji.sanggoe.plastic.controller;

import com.yeonji.sanggoe.plastic.domain.UserInformation;
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
    UserInformation info = new UserInformation();

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
                                 @RequestParam("clean1") int clean1, Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);

        return "/calculator/survey2";
    }

    @PostMapping("/survey3")
    public String confirmSurvey3(@RequestParam("name") String name,
                                 @RequestParam("pet1") int pet1,
                                 @RequestParam("pet2") int pet2,
                                 @RequestParam("contain") int contain,
                                 @RequestParam("eggPlt") int eggPlt,
                                 @RequestParam("glove") int glove,
                                 @RequestParam("clean1") int clean1, // before data
                                 @RequestParam("toothBrush") int toothBrush,
                                 @RequestParam("toothPaste") int toothPaste,
                                 @RequestParam("shampoo") int shampoo,
                                 @RequestParam("clean2") int clean2,
                                 @RequestParam("cosmetic") int cosmetic,
                                 @RequestParam("deliveFood") int deliveFood, Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);

        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);
        model.addAttribute("deliveFood", deliveFood);

        return "/calculator/survey3";
    }

    @PostMapping("/waiting")
    public String waitingPage(@RequestParam("name") String name,
                              @RequestParam("pet1") int pet1,
                              @RequestParam("pet2") int pet2,
                              @RequestParam("contain") int contain,
                              @RequestParam("eggPlt") int eggPlt,
                              @RequestParam("glove") int glove,
                              @RequestParam("clean1") int clean1,
                              @RequestParam("toothBrush") int toothBrush,
                              @RequestParam("toothPaste") int toothPaste,
                              @RequestParam("shampoo") int shampoo,
                              @RequestParam("clean2") int clean2,
                              @RequestParam("cosmetic") int cosmetic,
                              @RequestParam("deliveFood") int deliveFood, // before data
                              @RequestParam("spoon") int spoon,
                              @RequestParam("straw") int straw,
                              @RequestParam("cup") int cup,
                              @RequestParam("bagBig") int bagBig,
                              @RequestParam("bagMiddle") int bagMiddle,
                              @RequestParam("bagSmall") int bagSmall, Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);

        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);
        model.addAttribute("deliveFood", deliveFood);

        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagSmall", bagSmall);

        return "/result/waiting";
    }

    @PostMapping("/result1")
    public String showResult1(@RequestParam("name") String name,
                              @RequestParam("pet1") int pet1,
                              @RequestParam("pet2") int pet2,
                              @RequestParam("contain") int contain,
                              @RequestParam("eggPlt") int eggPlt,
                              @RequestParam("glove") int glove,
                              @RequestParam("clean1") int clean1,
                              @RequestParam("toothBrush") int toothBrush,
                              @RequestParam("toothPaste") int toothPaste,
                              @RequestParam("shampoo") int shampoo,
                              @RequestParam("clean2") int clean2,
                              @RequestParam("cosmetic") int cosmetic,
                              @RequestParam("deliveFood") int deliveFood, // before data
                              @RequestParam("spoon") int spoon,
                              @RequestParam("straw") int straw,
                              @RequestParam("cup") int cup,
                              @RequestParam("bagBig") int bagBig,
                              @RequestParam("bagMiddle") int bagMiddle,
                              @RequestParam("bagSmall") int bagSmall, Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);

        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);
        model.addAttribute("deliveFood", deliveFood);

        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagSmall", bagSmall);

        return "/result/result1";
    }

    @PostMapping("/result2")
    public String showResult2(@RequestParam("name") String name,
                              @RequestParam("pet1") int pet1,
                              @RequestParam("pet2") int pet2,
                              @RequestParam("contain") int contain,
                              @RequestParam("eggPlt") int eggPlt,
                              @RequestParam("glove") int glove,
                              @RequestParam("clean1") int clean1,
                              @RequestParam("toothBrush") int toothBrush,
                              @RequestParam("toothPaste") int toothPaste,
                              @RequestParam("shampoo") int shampoo,
                              @RequestParam("clean2") int clean2,
                              @RequestParam("cosmetic") int cosmetic,
                              @RequestParam("deliveFood") int deliveFood, // before data
                              @RequestParam("spoon") int spoon,
                              @RequestParam("straw") int straw,
                              @RequestParam("cup") int cup,
                              @RequestParam("bagBig") int bagBig,
                              @RequestParam("bagMiddle") int bagMiddle,
                              @RequestParam("bagSmall") int bagSmall, Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);

        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);
        model.addAttribute("deliveFood", deliveFood);

        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagSmall", bagSmall);

        return "/result/result2";
    }

    @PostMapping("/result3")
    public String showResult3(@RequestParam("name") String name,
                              @RequestParam("pet1") int pet1,
                              @RequestParam("pet2") int pet2,
                              @RequestParam("contain") int contain,
                              @RequestParam("eggPlt") int eggPlt,
                              @RequestParam("glove") int glove,
                              @RequestParam("clean1") int clean1,
                              @RequestParam("toothBrush") int toothBrush,
                              @RequestParam("toothPaste") int toothPaste,
                              @RequestParam("shampoo") int shampoo,
                              @RequestParam("clean2") int clean2,
                              @RequestParam("cosmetic") int cosmetic,
                              @RequestParam("deliveFood") int deliveFood, // before data
                              @RequestParam("spoon") int spoon,
                              @RequestParam("straw") int straw,
                              @RequestParam("cup") int cup,
                              @RequestParam("bagBig") int bagBig,
                              @RequestParam("bagMiddle") int bagMiddle,
                              @RequestParam("bagSmall") int bagSmall, Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);

        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);
        model.addAttribute("deliveFood", deliveFood);

        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagSmall", bagSmall);

        return "/result/result3";
    }

    @PostMapping("/report")
    public String showReport(@RequestParam("name") String name,
                             @RequestParam("pet1") int pet1,
                             @RequestParam("pet2") int pet2,
                             @RequestParam("contain") int contain,
                             @RequestParam("eggPlt") int eggPlt,
                             @RequestParam("glove") int glove,
                             @RequestParam("clean1") int clean1,
                             @RequestParam("toothBrush") int toothBrush,
                             @RequestParam("toothPaste") int toothPaste,
                             @RequestParam("shampoo") int shampoo,
                             @RequestParam("clean2") int clean2,
                             @RequestParam("cosmetic") int cosmetic,
                             @RequestParam("deliveFood") int deliveFood, // before data
                             @RequestParam("spoon") int spoon,
                             @RequestParam("straw") int straw,
                             @RequestParam("cup") int cup,
                             @RequestParam("bagBig") int bagBig,
                             @RequestParam("bagMiddle") int bagMiddle,
                             @RequestParam("bagSmall") int bagSmall, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("today", DateObj.getInstance().toString());

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("clean1", clean1);

        model.addAttribute("toothBrush", toothBrush);
        model.addAttribute("toothPaste", toothPaste);
        model.addAttribute("shampoo", shampoo);
        model.addAttribute("clean2", clean2);
        model.addAttribute("cosmetic", cosmetic);
        model.addAttribute("deliveFood", deliveFood);

        model.addAttribute("spoon", spoon);
        model.addAttribute("straw", straw);
        model.addAttribute("cup", cup);
        model.addAttribute("bagBig", bagBig);
        model.addAttribute("bagMiddle", bagMiddle);
        model.addAttribute("bagSmall", bagSmall);

        return "/result/report";
    }

    @PostMapping("/determination")
    public String showDetermination(@RequestParam("name") String name,
                                    @RequestParam("pet1") int pet1,
                                    @RequestParam("pet2") int pet2,
                                    @RequestParam("contain") int contain,
                                    @RequestParam("eggPlt") int eggPlt,
                                    @RequestParam("glove") int glove,
                                    @RequestParam("clean1") int clean1,
                                    @RequestParam("toothBrush") int toothBrush,
                                    @RequestParam("toothPaste") int toothPaste,
                                    @RequestParam("shampoo") int shampoo,
                                    @RequestParam("clean2") int clean2,
                                    @RequestParam("cosmetic") int cosmetic,
                                    @RequestParam("deliveFood") int deliveFood, // before data
                                    @RequestParam("spoon") int spoon,
                                    @RequestParam("straw") int straw,
                                    @RequestParam("cup") int cup,
                                    @RequestParam("bagBig") int bagBig,
                                    @RequestParam("bagMiddle") int bagMiddle,
                                    @RequestParam("bagSmall") int bagSmall, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("today", DateObj.getInstance().toString());

        return "/result/determination";
    }
}
