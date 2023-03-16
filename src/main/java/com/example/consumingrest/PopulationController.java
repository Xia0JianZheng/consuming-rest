package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(PopulationController.POPULATION)
public class PopulationController {
    public static final String POPULATION = "/population";

    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String showPopulation(Model model) {
        PopulationQuote[] populationQuotes = greetingService.getPopulationQuote();
        model.addAttribute("populationQuotes", populationQuotes);
        return "population";
    }
}
