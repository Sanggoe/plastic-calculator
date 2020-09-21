package com.yeonji.sanggoe.plastic.controller;

import com.yeonji.sanggoe.plastic.domain.UserInformation;
import com.yeonji.sanggoe.plastic.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping(value = "/calculator/survey2")
    public String confirmSurvey2(Model model) {
        //Inform.class
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
    static class Inform {
        private String name;
        private int t;
        private int t1;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
