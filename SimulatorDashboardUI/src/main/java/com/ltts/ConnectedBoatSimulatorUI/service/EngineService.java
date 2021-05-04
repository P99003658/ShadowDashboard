package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Engine;
import com.ltts.ConnectedBoatSimulatorUI.repository.EngineRepository;

@Service
public class EngineService {

	@Autowired
	private EngineRepository repos;
	
	public List<Engine> listAllEngines(){
		return repos.findAll();
	}
	public void save(Engine engines) {
		repos.save(engines);
	}
	public Engine get(int id) {
		return repos.findById(id).get();
	}
	public void delete(int id) {
		repos.deleteById(id);
	}
}
