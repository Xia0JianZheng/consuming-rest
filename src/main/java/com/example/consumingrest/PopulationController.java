package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(PopulationController.POPULATION)
public class PopulationController {
    public static final String POPULATION = "/population";

    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String getChuckQuote(Model model) {


        PopulationQuote[] q = greetingService.gerPopulationQuote();

        for
        model.addAttribute("any", q.any());
        model.addAttribute("codi", q.codi());
        model.addAttribute("literal", q.literal());
        model.addAttribute("homes_de_0_a_14_anys", q.homes_de_0_a_14_anys());
        model.addAttribute("homes_de_15_a_64_anys", q.homes_de_15_a_64_anys());
        model.addAttribute("homes_de_65_anys_i_m_s", q.homes_de_65_anys_i_m_s());
        model.addAttribute("dones_de_0_a_14_anys", q.dones_de_0_a_14_anys());
        model.addAttribute("dones_de_15_a_64_anys", q.dones_de_15_a_64_anys());
        model.addAttribute("dones_de_65_anys_i_m_s", q.dones_de_65_anys_i_m_s());
        model.addAttribute("total_de_0_a_14_anys", q.total_de_0_a_14_anys());
        model.addAttribute("total_de_15_a_64_anys", q.total_de_15_a_64_anys());
        model.addAttribute("total_de_65_anys_i_m_s", q.total_de_65_anys_i_m_s());
        return "chuck";
    }
}
