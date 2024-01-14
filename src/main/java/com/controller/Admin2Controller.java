package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.entities.Matches;
import com.repositories.MatchesRepository;

@Controller
public class Admin2Controller {
	@Autowired
    private MatchesRepository matchesRepository;

	@GetMapping("/admin2")
	public String showAdmin2Page(Model model) {
	    List<Matches> matches = matchesRepository.findAll();
	    model.addAttribute("matches", matches);
	    model.addAttribute("match", new Matches()); // Add an empty match object for the form
	    return "admin2";
	}


    @PostMapping("/addMatch")
    public String addMatch(@ModelAttribute Matches matches) {
    	matchesRepository.save(matches);
        return "redirect:/admin2";
    }
}
