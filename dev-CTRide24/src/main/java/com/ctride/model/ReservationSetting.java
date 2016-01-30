package com.ctride.model;

/**
 * Default reservation settings - if no rate group settings are available
 *
 */
public class ReservationSetting {
	private int minLeadTimeInMinutes;
	private double gratuityPercentage;
	private boolean isUserSelectableTip;
	private double taxRate;

	public int getMinLeadTimeInMinutes() {
		return minLeadTimeInMinutes;
	}

	public void setMinLeadTimeInMinutes(int minLeadTimeInMinutes) {
		this.minLeadTimeInMinutes = minLeadTimeInMinutes;
	}

	public double getGratuityPercentage() {
		return gratuityPercentage;
	}

	public void setGratuityPercentage(double gratuityPercentage) {
		this.gratuityPercentage = gratuityPercentage;
	}

	public boolean isUserSelectableTip() {
		return isUserSelectableTip;
	}

	public void setUserSelectableTip(boolean isUserSelectableTip) {
		this.isUserSelectableTip = isUserSelectableTip;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

}
