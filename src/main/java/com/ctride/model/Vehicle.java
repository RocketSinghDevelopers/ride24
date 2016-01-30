package com.ctride.model;

/**
 * 
 * DOM to maintain different vehicle owned.
 *
 */
public class Vehicle {
	private long vehicleId;
	private String vehicleNUmber;
	private String brand;
	private String model;
	private String year;

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleNUmber() {
		return vehicleNUmber;
	}

	public void setVehicleNUmber(String vehicleNUmber) {
		this.vehicleNUmber = vehicleNUmber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
