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
        model.addAttribute("name", name);
        return "/calculator/survey1";
    }

    @PostMapping("/survey2")
    public String confirmSurvey2(@RequestParam("pla1") int pla1, @RequestParam("pla2") int pla2, Model model) {
        information.setPlasticBag(pla1);
        information.setPlasticBuffer(pla2);
        model.addAttribute("name", information.getName());
        model.addAttribute("pla1", pla1);
        model.addAttribute("pla2", pla2);
        return "/calculator/survey2";
    }

//    @GetMapping("/calculator/survey")
//    @ResponseBody
//    public Inform informApi(@RequestParam("name") String name) {
//        Inform inform = new Inform();
//        inform.setName(name);
//        return inform;
//    }
}
