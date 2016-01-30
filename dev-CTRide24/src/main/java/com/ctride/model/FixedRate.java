package com.ctride.model;

/**
 * Defines Fixed rate for place to place service.
 *
 */
public class FixedRate extends RideRate {
	private Place fromPlace;
	private Place toPlace;

	public Place getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(Place fromPlace) {
		this.fromPlace = fromPlace;
	}

	public Place getToPlace() {
		return toPlace;
	}

	public void setToPlace(Place toPlace) {
		this.toPlace = toPlace;
	}

}
