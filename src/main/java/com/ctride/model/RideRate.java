package com.ctride.model;

import java.util.List;

/**
 * Super class to define different kind of rates.
 *
 */
public class RideRate {
	private VehicleGroup vehicleGroup;
	private RateGroup rateGroup;
	private List<AddonRate> fixedRateAddonList;
	private List<AddonRate> incrementalRateAddonList;
	private double minFare;
	private double fare;

	public VehicleGroup getVehicleGroup() {
		return vehicleGroup;
	}

	public void setVehicleGroup(VehicleGroup vehicleGroup) {
		this.vehicleGroup = vehicleGroup;
	}

	public RateGroup getRateGroup() {
		return rateGroup;
	}

	public void setRateGroup(RateGroup rateGroup) {
		this.rateGroup = rateGroup;
	}

	public double getMinFare() {
		return minFare;
	}

	public void setMinFare(double minFare) {
		this.minFare = minFare;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public List<AddonRate> getFixedRateAddonList() {
		return fixedRateAddonList;
	}

	public void setFixedRateAddonList(List<AddonRate> fixedRateAddonList) {
		this.fixedRateAddonList = fixedRateAddonList;
	}

	public List<AddonRate> getIncrementalRateAddonList() {
		return incrementalRateAddonList;
	}

	public void setIncrementalRateAddonList(
			List<AddonRate> incrementalRateAddonList) {
		this.incrementalRateAddonList = incrementalRateAddonList;
	}

}
