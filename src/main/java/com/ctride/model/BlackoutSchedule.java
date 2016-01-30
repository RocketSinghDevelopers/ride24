package com.ctride.model;

/**
 * Blackout schedules where owner cannot take reservations.
 *
 */
public class BlackoutSchedule {
	private String blackoutStartDate;
	private String blackoutEndDate;
	private String blackoutStartTime;
	private String blackoutEndTime;
	private String blackoutDay;
	private boolean isDaily;
	private boolean isWeekly;
	private boolean isMonthly;
	private boolean isYearly;
	private boolean onlyOnce;

	public String getBlackoutStartDate() {
		return blackoutStartDate;
	}

	public void setBlackoutStartDate(String blackoutStartDate) {
		this.blackoutStartDate = blackoutStartDate;
	}

	public String getBlackoutEndDate() {
		return blackoutEndDate;
	}

	public void setBlackoutEndDate(String blackoutEndDate) {
		this.blackoutEndDate = blackoutEndDate;
	}

	public String getBlackoutStartTime() {
		return blackoutStartTime;
	}

	public void setBlackoutStartTime(String blackoutStartTime) {
		this.blackoutStartTime = blackoutStartTime;
	}

	public String getBlackoutEndTime() {
		return blackoutEndTime;
	}

	public void setBlackoutEndTime(String blackoutEndTime) {
		this.blackoutEndTime = blackoutEndTime;
	}

	public String getBlackoutDay() {
		return blackoutDay;
	}

	public void setBlackoutDay(String blackoutDay) {
		this.blackoutDay = blackoutDay;
	}

	public boolean isDaily() {
		return isDaily;
	}

	public void setDaily(boolean isDaily) {
		this.isDaily = isDaily;
	}

	public boolean isWeekly() {
		return isWeekly;
	}

	public void setWeekly(boolean isWeekly) {
		this.isWeekly = isWeekly;
	}

	public boolean isMonthly() {
		return isMonthly;
	}

	public void setMonthly(boolean isMonthly) {
		this.isMonthly = isMonthly;
	}

	public boolean isYearly() {
		return isYearly;
	}

	public void setYearly(boolean isYearly) {
		this.isYearly = isYearly;
	}

	public boolean isOnlyOnce() {
		return onlyOnce;
	}

	public void setOnlyOnce(boolean onlyOnce) {
		this.onlyOnce = onlyOnce;
	}

}
