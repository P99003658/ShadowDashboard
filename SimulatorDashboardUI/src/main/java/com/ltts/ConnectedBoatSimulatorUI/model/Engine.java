package com.ltts.ConnectedBoatSimulatorUI.model;

public class Engine {

	private int engineid;
	private int oilpressure;
	private int oiltempertature;
	private int enginetemperature;
	private String enginetimestamp;
	
	public Engine() {
		super();
	}

	public Engine(int engineid, int oilpressure, int oiltempertature, int enginetemperature, String enginetimestamp) {
		super();
		this.engineid = engineid;
		this.oilpressure = oilpressure;
		this.oiltempertature = oiltempertature;
		this.enginetemperature = enginetemperature;
		this.enginetimestamp = enginetimestamp;
	}

	public int getEngineid() {
		return engineid;
	}

	public void setEngineid(int engineid) {
		this.engineid = engineid;
	}

	public int getOilpressure() {
		return oilpressure;
	}

	public void setOilpressure(int oilpressure) {
		this.oilpressure = oilpressure;
	}

	public int getOiltempertature() {
		return oiltempertature;
	}

	public void setOiltempertature(int oiltempertature) {
		this.oiltempertature = oiltempertature;
	}

	public int getEnginetemperature() {
		return enginetemperature;
	}

	public void setEnginetemperature(int enginetemperature) {
		this.enginetemperature = enginetemperature;
	}

	public String getEnginetimestamp() {
		return enginetimestamp;
	}

	public void setEnginetimestamp(String enginetimestamp) {
		this.enginetimestamp = enginetimestamp;
	}

	@Override
	public String toString() {
		return "Engine [engineid=" + engineid + ", oilpressure=" + oilpressure + ", oiltempertature=" + oiltempertature
				+ ", enginetemperature=" + enginetemperature + ", enginetimestamp=" + enginetimestamp + "]";
	}
	
	
}
