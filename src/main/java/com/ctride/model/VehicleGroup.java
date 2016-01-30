package com.ctride.model;

import java.util.List;

import javax.persistence.Entity;

/**
 * 
 * Domain class for different type of vehicles and number of vehicle in this
 * type.
 *
 */
@Entity
public class VehicleGroup {

	private long vehicleTypeId;
	private String vehicleType;
	private int maxNumPassenger;
	private String vehicleName;
	private String vehicleDescription;
	private String vehicleImageURL;
	private List<Vehicle> vehicleList;

	public VehicleGroup(long vehicleTypeId, String vehicleType,
			int maxNumPassenger, String vehicleImageURL, String vehicleName,
			String vehicleDescription) {
		this.vehicleTypeId = vehicleTypeId;
		this.vehicleType = vehicleType;
		this.maxNumPassenger = maxNumPassenger;
		this.vehicleImageURL = vehicleImageURL;
		this.vehicleName = vehicleName;
		this.vehicleDescription = vehicleDescription;
	}

	public long getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(long vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getMaxNumPassenger() {
		return maxNumPassenger;
	}

	public void setMaxNumPassenger(int maxNumPassenger) {
		this.maxNumPassenger = maxNumPassenger;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleDescription() {
		return vehicleDescription;
	}

	public void setVehicleDescription(String vehicleDescription) {
		this.vehicleDescription = vehicleDescription;
	}

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public void setVehicleImageURL(String vehicleImageURL) {
		this.vehicleImageURL = vehicleImageURL;
	}

	public String getVehicleImageURL() {
		return vehicleImageURL;
	}
}
