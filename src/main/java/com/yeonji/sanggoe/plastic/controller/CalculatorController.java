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
    int count = 0;

    @Autowired
    public CalculatorController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @PostMapping(value = "/survey1")
    public String confirmSurvey(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "calculator/survey1";
    }

    @PostMapping("/survey2")
    public String confirmSurvey2(@RequestParam(value = "name") String name, // before data
                                 @RequestParam(value = "pet1") int pet1,
                                 @RequestParam(value = "pet2") int pet2,
                                 @RequestParam(value = "contain") int contain,
                                 @RequestParam(value = "eggPlt") int eggPlt,
                                 @RequestParam(value = "glove") int glove,
                                 @RequestParam(value = "bagSmall") int bagSmall,
                                 Model model) {

        model.addAttribute("name", name);

        model.addAttribute("pet1", pet1);
        model.addAttribute("pet2", pet2);
        model.addAttribute("contain", contain);
        model.addAttribute("eggPlt", eggPlt);
        model.addAttribute("glove", glove);
        model.addAttribute("bagSmall", bagSmall);

        return "calculator/survey2";
    }

    @PostMapping("/survey3")
    public String confirmSurvey3(@RequestParam(value = "name") String name,
                                 @RequestParam(value = "pet1") int pet1,
                                 @RequestParam(value = "pet2") int pet2,
                                 @RequestParam(value = "contain") int contain,
                                 @RequestParam(value = "eggPlt") int eggPlt,
                                 @RequestParam(value = "glove") int glove,
                                 @RequestParam(value = "bagSmall") int bagSmall, // before data

                                 @RequestParam(value = "bagMiddle") int bagMiddle,
                                 @RequestParam(value = "bagBig") int bagBig,
                                 @RequestParam(value = "deliveFood") int deliveFood,
                                 @RequestParam(value = "spoon") int spoon,
                                 @RequestParam(value = "straw") int straw,
                                 @RequestParam(value = "cup") int cup,
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

        return "calculator/survey3";
    }

    @PostMapping("/waiting")
    public String waitingPage(@RequestParam(value = "name") String name,
                              @RequestParam(value = "pet1") int pet1,
                              @RequestParam(value = "pet2") int pet2,
                              @RequestParam(value = "contain") int contain,
                              @RequestParam(value = "eggPlt") int eggPlt,
                              @RequestParam(value = "glove") int glove,
                              @RequestParam(value = "bagSmall") int bagSmall, // before data

                              @RequestParam(value = "bagMiddle") int bagMiddle,
                              @RequestParam(value = "bagBig") int bagBig,
                              @RequestParam(value = "deliveFood") int deliveFood,
                              @RequestParam(value = "spoon") int spoon,
                              @RequestParam(value = "straw") int straw,
                              @RequestParam(value = "cup") int cup,

                              @RequestParam(value = "clean1") int clean1,
                              @RequestParam(value = "shampoo") int shampoo,
                              @RequestParam(value = "toothBrush") int toothBrush,
                              @RequestParam(value = "toothPaste") int toothPaste,
                              @RequestParam(value = "clean2") int clean2,
                              @RequestParam(value = "cosmetic") int cosmetic,
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

        return "result/waiting";
    }

    @PostMapping("/scores")
    public String showScores(@RequestParam(value = "name") String name,
                             @RequestParam(value = "pet1") int pet1,
                             @RequestParam(value = "pet2") int pet2,
                             @RequestParam(value = "contain") int contain,
                             @RequestParam(value = "eggPlt") int eggPlt,
                             @RequestParam(value = "glove") int glove,
                             @RequestParam(value = "bagSmall") int bagSmall, // before data

                             @RequestParam(value = "bagMiddle") int bagMiddle,
                             @RequestParam(value = "bagBig") int bagBig,
                             @RequestParam(value = "deliveFood") int deliveFood,
                             @RequestParam(value = "spoon") int spoon,
                             @RequestParam(value = "straw") int straw,
                             @RequestParam(value = "cup") int cup,

                             @RequestParam(value = "clean1") int clean1,
                             @RequestParam(value = "shampoo") int shampoo,
                             @RequestParam(value = "toothBrush") int toothBrush,
                             @RequestParam(value = "toothPaste") int toothPaste,
                             @RequestParam(value = "clean2") int clean2,
                             @RequestParam(value = "cosmetic") int cosmetic,
                             Model model) {

        int sum = pet1 + pet2 + contain + eggPlt + glove + bagSmall + bagMiddle + bagBig + deliveFood +
                spoon + straw + cup + clean1 + shampoo + toothBrush + toothPaste + clean2 + cosmetic;
        String[] imageNames = calculateService.getScoreStrings(sum);

        model.addAttribute("name", name);
        model.addAttribute("today", DateObj.getInstance().toString());
        model.addAttribute("sum", sum);
        model.addAttribute("stampString", imageNames[0]);
        model.addAttribute("commentString", imageNames[1]);

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

        return "result/scores";
    }

    @PostMapping("/result1")
    public String showResult1(@RequestParam(value = "name") String name,
                              @RequestParam(value = "pet1") int pet1,
                              @RequestParam(value = "pet2") int pet2,
                              @RequestParam(value = "contain") int contain,
                              @RequestParam(value = "eggPlt") int eggPlt,
                              @RequestParam(value = "glove") int glove,
                              @RequestParam(value = "bagSmall") int bagSmall, // before data

                              @RequestParam(value = "bagMiddle") int bagMiddle,
                              @RequestParam(value = "bagBig") int bagBig,
                              @RequestParam(value = "deliveFood") int deliveFood,
                              @RequestParam(value = "spoon") int spoon,
                              @RequestParam(value = "straw") int straw,
                              @RequestParam(value = "cup") int cup,

                              @RequestParam(value = "clean1") int clean1,
                              @RequestParam(value = "shampoo") int shampoo,
                              @RequestParam(value = "toothBrush") int toothBrush,
                              @RequestParam(value = "toothPaste") int toothPaste,
                              @RequestParam(value = "clean2") int clean2,
                              @RequestParam(value = "cosmetic") int cosmetic,
                              Model model) {

        model.addAttribute("name", name);
        int[] results = calculateService.getResultPerYears(pet1, pet2, contain, eggPlt, glove, bagSmall, bagMiddle, bagBig, deliveFood, spoon, straw, cup, clean1, shampoo, toothBrush, toothPaste, clean2, cosmetic);
        model.addAttribute("perOneYearResult", results[0]);
        model.addAttribute("perTwentyYearsResult", results[1]);
        model.addAttribute("perWholeYearsResult", results[2]);

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

        return "result/result1";
    }

    @PostMapping("/result2")
    public String showResult2(@RequestParam(value = "name") String name,
                              @RequestParam(value = "pet1") int pet1,
                              @RequestParam(value = "pet2") int pet2,
                              @RequestParam(value = "contain") int contain,
                              @RequestParam(value = "eggPlt") int eggPlt,
                              @RequestParam(value = "glove") int glove,
                              @RequestParam(value = "bagSmall") int bagSmall, // before data

                              @RequestParam(value = "bagMiddle") int bagMiddle,
                              @RequestParam(value = "bagBig") int bagBig,
                              @RequestParam(value = "deliveFood") int deliveFood,
                              @RequestParam(value = "spoon") int spoon,
                              @RequestParam(value = "straw") int straw,
                              @RequestParam(value = "cup") int cup,

                              @RequestParam(value = "clean1") int clean1,
                              @RequestParam(value = "shampoo") int shampoo,
                              @RequestParam(value = "toothBrush") int toothBrush,
                              @RequestParam(value = "toothPaste") int toothPaste,
                              @RequestParam(value = "clean2") int clean2,
                              @RequestParam(value = "cosmetic") int cosmetic,
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

        return "result/result2";
    }

    @PostMapping("/replace")
    public String showReport(@RequestParam(value = "name") String name,
                             @RequestParam(value = "pet1") int pet1,
                             @RequestParam(value = "pet2") int pet2,
                             @RequestParam(value = "contain") int contain,
                             @RequestParam(value = "eggPlt") int eggPlt,
                             @RequestParam(value = "glove") int glove,
                             @RequestParam(value = "bagSmall") int bagSmall, // before data

                             @RequestParam(value = "bagMiddle") int bagMiddle,
                             @RequestParam(value = "bagBig") int bagBig,
                             @RequestParam(value = "deliveFood") int deliveFood,
                             @RequestParam(value = "spoon") int spoon,
                             @RequestParam(value = "straw") int straw,
                             @RequestParam(value = "cup") int cup,

                             @RequestParam(value = "clean1") int clean1,
                             @RequestParam(value = "shampoo") int shampoo,
                             @RequestParam(value = "toothBrush") int toothBrush,
                             @RequestParam(value = "toothPaste") int toothPaste,
                             @RequestParam(value = "clean2") int clean2,
                             @RequestParam(value = "cosmetic") int cosmetic,
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

        return "result/replace";
    }

    @PostMapping("/determination")
    public String showDetermination(@RequestParam(value = "name") String name,
                                    @RequestParam(value = "pet1") int pet1,
                                    @RequestParam(value = "pet2") int pet2,
                                    @RequestParam(value = "contain") int contain,
                                    @RequestParam(value = "eggPlt") int eggPlt,
                                    @RequestParam(value = "glove") int glove,
                                    @RequestParam(value = "bagSmall") int bagSmall, // before data

                                    @RequestParam(value = "bagMiddle") int bagMiddle,
                                    @RequestParam(value = "bagBig") int bagBig,
                                    @RequestParam(value = "deliveFood") int deliveFood,
                                    @RequestParam(value = "spoon") int spoon,
                                    @RequestParam(value = "straw") int straw,
                                    @RequestParam(value = "cup") int cup,

                                    @RequestParam(value = "clean1") int clean1,
                                    @RequestParam(value = "shampoo") int shampoo,
                                    @RequestParam(value = "toothBrush") int toothBrush,
                                    @RequestParam(value = "toothPaste") int toothPaste,
                                    @RequestParam(value = "clean2") int clean2,
                                    @RequestParam(value = "cosmetic") int cosmetic,

                                    @RequestParam(value = "select1") String select1,
                                    @RequestParam(value = "select2") String select2,
                                    @RequestParam(value = "select3") String select3,
                                    @RequestParam(value = "select4") String select4,
                                    @RequestParam(value = "select5") String select5,
                                    @RequestParam(value = "select6") String select6,

                                    @RequestParam(value = "replace1") String replace1,
                                    @RequestParam(value = "replace2") String replace2,
                                    @RequestParam(value = "replace3") String replace3,
                                    @RequestParam(value = "replace4") String replace4,
                                    @RequestParam(value = "replace5") String replace5,
                                    @RequestParam(value = "replace6") String replace6,
                                    @RequestParam(value = "replace7") String replace7,
                                    @RequestParam(value = "replace8") String replace8,
                                    @RequestParam(value = "replace9") String replace9,
                                    @RequestParam(value = "replace10") String replace10,
                                    @RequestParam(value = "replace11") String replace11,
                                    @RequestParam(value = "replace12") String replace12,

                                    Model model) {

        int sum = pet1 + pet2 + contain + eggPlt + glove + bagSmall + bagMiddle + bagBig + deliveFood +
                spoon + straw + cup + clean1 + shampoo + toothBrush + toothPaste + clean2 + cosmetic;
        String[] imageNames = calculateService.getScoreStrings(sum);

        String[][] list = calculateService.getResultStrings(select1, select2, select3, select4, select5,
                select6, replace1, replace2, replace3, replace4, replace5, replace6, replace7, replace8,
                replace9, replace10, replace11, replace12);

        for(int i = 0; i < 3 && list[0][i] != null; i++) {
            model.addAttribute("group1_" + (i+1), list[0][i]);
        }

        for(int i = 0; i < 3 && list[1][i] != null; i++) {
            model.addAttribute("group2_" + (i+1), list[1][i]);
        }

        model.addAttribute("name", name);
        model.addAttribute("count", ++count);
        model.addAttribute("today", DateObj.getInstance().toString());
        model.addAttribute("sum", sum);
        model.addAttribute("stampString", imageNames[0]);
        model.addAttribute("commentString", imageNames[1]);

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

        model.addAttribute("select1", select1);
        model.addAttribute("select2", select2);
        model.addAttribute("select3", select3);
        model.addAttribute("select4", select4);
        model.addAttribute("select5", select5);
        model.addAttribute("select6", select6);
        model.addAttribute("replace1", replace1);
        model.addAttribute("replace2", replace2);
        model.addAttribute("replace3", replace3);
        model.addAttribute("replace4", replace4);
        model.addAttribute("replace5", replace5);
        model.addAttribute("replace6", replace6);
        model.addAttribute("replace7", replace7);
        model.addAttribute("replace8", replace8);
        model.addAttribute("replace9", replace9);
        model.addAttribute("replace10", replace10);
        model.addAttribute("replace11", replace11);
        model.addAttribute("replace12", replace12);


        return "result/determination";
    }

    @GetMapping("/determination")
    public String shareDetermination(@RequestParam(value = "name", defaultValue = "") String name,
                                    @RequestParam(value = "pet1", defaultValue = "") int pet1,
                                    @RequestParam(value = "pet2", defaultValue = "") int pet2,
                                    @RequestParam(value = "contain", defaultValue = "") int contain,
                                    @RequestParam(value = "eggPlt", defaultValue = "") int eggPlt,
                                    @RequestParam(value = "glove", defaultValue = "") int glove,
                                    @RequestParam(value = "bagSmall", defaultValue = "") int bagSmall, // before data

                                    @RequestParam(value = "bagMiddle", defaultValue = "") int bagMiddle,
                                    @RequestParam(value = "bagBig", defaultValue = "") int bagBig,
                                    @RequestParam(value = "deliveFood", defaultValue = "") int deliveFood,
                                    @RequestParam(value = "spoon", defaultValue = "") int spoon,
                                    @RequestParam(value = "straw", defaultValue = "") int straw,
                                    @RequestParam(value = "cup", defaultValue = "") int cup,

                                    @RequestParam(value = "clean1", defaultValue = "") int clean1,
                                    @RequestParam(value = "shampoo", defaultValue = "") int shampoo,
                                    @RequestParam(value = "toothBrush", defaultValue = "") int toothBrush,
                                    @RequestParam(value = "toothPaste", defaultValue = "") int toothPaste,
                                    @RequestParam(value = "clean2", defaultValue = "") int clean2,
                                    @RequestParam(value = "cosmetic", defaultValue = "") int cosmetic,

                                    @RequestParam(value = "select1", defaultValue = "") String select1,
                                    @RequestParam(value = "select2", defaultValue = "") String select2,
                                    @RequestParam(value = "select3", defaultValue = "") String select3,
                                    @RequestParam(value = "select4", defaultValue = "") String select4,
                                    @RequestParam(value = "select5", defaultValue = "") String select5,
                                    @RequestParam(value = "select6", defaultValue = "") String select6,

                                    @RequestParam(value = "replace1", defaultValue = "") String replace1,
                                    @RequestParam(value = "replace2", defaultValue = "") String replace2,
                                    @RequestParam(value = "replace3", defaultValue = "") String replace3,
                                    @RequestParam(value = "replace4", defaultValue = "") String replace4,
                                    @RequestParam(value = "replace5", defaultValue = "") String replace5,
                                    @RequestParam(value = "replace6", defaultValue = "") String replace6,
                                    @RequestParam(value = "replace7", defaultValue = "") String replace7,
                                    @RequestParam(value = "replace8", defaultValue = "") String replace8,
                                    @RequestParam(value = "replace9", defaultValue = "") String replace9,
                                    @RequestParam(value = "replace10", defaultValue = "") String replace10,
                                    @RequestParam(value = "replace11", defaultValue = "") String replace11,
                                    @RequestParam(value = "replace12", defaultValue = "") String replace12,

                                    Model model) {

        int sum = pet1 + pet2 + contain + eggPlt + glove + bagSmall + bagMiddle + bagBig + deliveFood +
                spoon + straw + cup + clean1 + shampoo + toothBrush + toothPaste + clean2 + cosmetic;
        String[] imageNames = calculateService.getScoreStrings(sum);

        String[][] list = calculateService.getResultStrings(select1, select2, select3, select4, select5,
                select6, replace1, replace2, replace3, replace4, replace5, replace6, replace7, replace8,
                replace9, replace10, replace11, replace12);

        for(int i = 0; i < 3 && list[0][i] != null; i++) {
            model.addAttribute("group1_" + (i+1), list[0][i]);
        }

        for(int i = 0; i < 3 && list[1][i] != null; i++) {
            model.addAttribute("group2_" + (i+1), list[1][i]);
        }

        model.addAttribute("name", name);
        model.addAttribute("today", DateObj.getInstance().toString());
        model.addAttribute("sum", sum);
        model.addAttribute("stampString", imageNames[0]);
        model.addAttribute("commentString", imageNames[1]);

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

        return "result/shared";
    }
}
