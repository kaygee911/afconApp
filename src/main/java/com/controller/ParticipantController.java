package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.entities.Participant;
import com.repositories.ParticipantRepository;

@Controller
public class ParticipantController {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@GetMapping("/participants")
	public String showParticipants(Model model) {
        
		List<Participant> participants = participantRepository.findAll();
        model.addAttribute("participants", participants);
        
        return "participants"; // Name of your Thymeleaf template
    }
	
}
