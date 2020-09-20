package com.yeonji.sanggoe.plastic.controller;

import com.yeonji.sanggoe.plastic.domain.UserInformation;
import com.yeonji.sanggoe.plastic.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {

    CalculateService calculateService;

    @Autowired
    public CalculatorController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/calculator/survey")
    public String confirmSurvey() {
        return "/calculator/survey";
    }

    /*
        @PostMapping("/calculator/survey")
        public String confirm(UserInformationForm informationForm) {
            UserInformation information = new UserInformation();
            information.setName(informationForm.getName());

            return "String";
        }
    */
//    @GetMapping("/calculator/survey")
//    @ResponseBody
//    public Inform informApi(@RequestParam("name") String name) {
//        Inform inform = new Inform();
//        inform.setName(name);
//        return inform;
//    }
//
//
//    static class Inform {
//        private String name;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
}
