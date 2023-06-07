package com.example.springwebapp.controllers;

import com.example.springwebapp.models.VisitorModel;
import com.example.springwebapp.repositories.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/remember")
public class RememberController {
    @Autowired
    VisitorRepository visitorRepository;
    @GetMapping
    public String getRememberPage(){return "remember";}
    @PostMapping
    public RedirectView saveVisitor(@RequestParam String name, Integer age, String phone, String quest){
        VisitorModel visitorModel = new VisitorModel();
        visitorModel.setName(name);
        visitorModel.setAge(age);
        visitorModel.setPhone(phone);
        visitorModel.setQuest(quest);
        visitorRepository.save(visitorModel);
        return new RedirectView("/");
    }
}
