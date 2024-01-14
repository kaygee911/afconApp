package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.entities.Participant;
import com.repositories.ParticipantRepository;

@Controller
public class AdminController {
	@Autowired
    private ParticipantRepository participantRepository;

    @GetMapping("/admin")
    public String showAdminPage(Model model) {
        model.addAttribute("participant", new Participant());
        List<Participant> participants = participantRepository.findAll();
        model.addAttribute("participants", participants);
        return "admin";
    }

    @PostMapping("/addParticipant")
    public String addParticipant(@ModelAttribute Participant participant) {
        participantRepository.save(participant);
        return "redirect:/admin";
    }
}
