package com.ctride.model;

/**
 * Rate of each addon.
 *
 */
public class AddonRate {
	private VehicleAddon addon;
	private VehicleGroup vehicleGroup;
	private RateGroup rateGroup;
	private double addonRate;
	private int maxCapacity;
	private int minCapacity;
	private boolean isIncremental;

	public VehicleAddon getAddon() {
		return addon;
	}

	public void setAddon(VehicleAddon addon) {
		this.addon = addon;
	}

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

	public double getAddonRate() {
		return addonRate;
	}

	public void setAddonRate(double addonRate) {
		this.addonRate = addonRate;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getMinCapacity() {
		return minCapacity;
	}

	public void setMinCapacity(int minCapacity) {
		this.minCapacity = minCapacity;
	}

	public boolean isIncremental() {
		return isIncremental;
	}

	public void setIncremental(boolean isIncremental) {
		this.isIncremental = isIncremental;
	}

}
