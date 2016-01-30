package com.ctride.model;

/**
 * Different addon services or items maintained by owner
 *
 */
public class VehicleAddon {
	private long addonId;
	private String addonName;
	private String addonDescription;
	private boolean isActive;

	public long getAddonId() {
		return addonId;
	}

	public void setAddonId(long addonId) {
		this.addonId = addonId;
	}

	public String getAddonName() {
		return addonName.trim();
	}

	public void setAddonName(String addonName) {
		this.addonName = addonName;
	}

	public String getAddonDescription() {
		return addonDescription.trim();
	}

	public void setAddonDescription(String addonDescription) {
		this.addonDescription = addonDescription;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
