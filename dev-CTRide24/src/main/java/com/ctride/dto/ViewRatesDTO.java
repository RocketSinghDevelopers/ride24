package com.ctride.dto;

import com.ctride.constants.ServiceTypeEnum;

/**
 * Class to map values from Service request to find rates.
 *
 */
public class ViewRatesDTO {
	private String serviceType;
	private int serviceId;
	private int numOfPassenger;
	private String pickupDate;
	private String pickupLocation;
	private String pickupLocationZip;
	private int pickupLocationId;
	private String dropOffLocation;
	private int dropOffLocationId;
	private String dropOffLocationZip;
	private double distanceMiles;
	private int rateGroupId;

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getNumOfPassenger() {
		return numOfPassenger;
	}

	public void setNumOfPassenger(int numOfPassenger) {
		this.numOfPassenger = numOfPassenger;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getPickupLocationZip() {
		return pickupLocationZip;
	}

	public void setPickupLocationZip(String pickupLocationZip) {
		this.pickupLocationZip = pickupLocationZip;
	}

	public int getPickupLocationId() {
		return pickupLocationId;
	}

	public void setPickupLocationId(int pickupLocationId) {
		this.pickupLocationId = pickupLocationId;
	}

	public String getDropOffLocation() {
		return dropOffLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	public int getDropOffLocationId() {
		return dropOffLocationId;
	}

	public void setDropOffLocationId(int dropOffLocationId) {
		this.dropOffLocationId = dropOffLocationId;
	}

	public String getDropOffLocationZip() {
		return dropOffLocationZip;
	}

	public void setDropOffLocationZip(String dropOffLocationZip) {
		this.dropOffLocationZip = dropOffLocationZip;
	}

	public double getDistanceMiles() {
		return distanceMiles;
	}

	public void setDistanceMiles(double distanceMiles) {
		this.distanceMiles = distanceMiles;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		this.serviceId = ServiceTypeEnum.getServiceTypeId(serviceType);
	}

	public String getServiceType() {
		return serviceType;
	}

	public int getRateGroupId() {
		return rateGroupId;
	}

	public void setRateGroupId(int rateGroupId) {
		this.rateGroupId = rateGroupId;
	}
}
