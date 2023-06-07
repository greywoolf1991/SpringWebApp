package com.example.springwebapp.controllers;

import com.example.springwebapp.models.VisitorModel;
import com.example.springwebapp.repositories.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/memory")
public class MemoryController {
    @Autowired
    VisitorRepository visitorRepository;
    @GetMapping
    public String getMemoryPage(Model model){
        List<VisitorModel> list = (List<VisitorModel>) visitorRepository.findAll();
        model.addAttribute("visitors", list);
        return "memory";}
}
