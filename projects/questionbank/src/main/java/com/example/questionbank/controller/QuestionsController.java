package com.example.questionbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.questionbank.service.QuestionService;
import java.util.List;
import com.example.questionbank.entity.Question;

@Controller
@RequestMapping("/api/questions")
public class QuestionsController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public String viewHomePage(Model model) {
        List<Question> questions = questionService.getAllQuestions();
        model.addAttribute("questions",questions);
        return "index";
    } 

}