package com.ctride.model;

import com.ctride.constants.DistanceTypeEnum;

/**
 * Defines rate on basis of distance between point to point.
 *
 */
public class DistanceRate extends RideRate {
	private int minDistance;
	private int maxDistance;
	private DistanceTypeEnum unitOfDistance;

	public int getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(int minDistance) {
		this.minDistance = minDistance;
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	public DistanceTypeEnum getUnitOfDistance() {
		return unitOfDistance;
	}

	public void setUnitOfDistance(DistanceTypeEnum unitOfDistance) {
		this.unitOfDistance = unitOfDistance;
	}

}
