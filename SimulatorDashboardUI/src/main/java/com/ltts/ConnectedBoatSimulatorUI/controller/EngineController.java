package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Engine;
import com.ltts.ConnectedBoatSimulatorUI.service.EngineService;

@Controller
public class EngineController {
	
	@Autowired
    private EngineService engineservice;

	@GetMapping("/view")
	public String viewEngine(Model model) {
		List<Engine> lis = engineservice.listAllEngines();
		model.addAttribute("viewparameters", lis);
		System.out.println("Get / ");
		return "viewparameters";
	}
}
