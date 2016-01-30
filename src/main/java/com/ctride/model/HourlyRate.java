package com.ctride.model;

/**
 * Defines hourly rates.
 *
 */
public class HourlyRate extends RideRate {
	private int minMinutes;
	private int maxMinutes;

	public void setMinMinutes(int minMinutes) {
		this.minMinutes = minMinutes;
	}

	public int getMinMinutes() {
		return minMinutes;
	}

	public void setMaxMinutes(int maxMinutes) {
		this.maxMinutes = maxMinutes;
	}

	public int getMaxMinutes() {
		return maxMinutes;
	}
}
