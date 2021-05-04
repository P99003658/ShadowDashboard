package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Main;
import com.ltts.ConnectedBoatSimulatorUI.service.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainservice;
	
	
	
	@GetMapping("/")
	public String viewMain(Model model) {
		List<Main> li = mainservice.listAll();
		model.addAttribute("boatlist", li);
		System.out.println("Get / ");
		return "boatlist";
	}
	
}
