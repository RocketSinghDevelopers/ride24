package com.ctride.model;

/**
 * Defines different rate groups, e.g. Corporate group, college group etc.
 *
 */
public class RateGroup {
	private long rateGroupId;
	private String rateGroupName;
	private String groupRuleType;
	private String groupRuleCondition;

	public long getRateGroupId() {
		return rateGroupId;
	}

	public void setRateGroupId(long rateGroupId) {
		this.rateGroupId = rateGroupId;
	}

	public String getRateGroupName() {
		return rateGroupName;
	}

	public void setRateGroupName(String rateGroupName) {
		this.rateGroupName = rateGroupName;
	}

	public String getGroupRuleType() {
		return groupRuleType;
	}

	public void setGroupRuleType(String groupRuleType) {
		this.groupRuleType = groupRuleType;
	}

	public String getGroupRuleCondition() {
		return groupRuleCondition;
	}

	public void setGroupRuleCondition(String groupRuleCondition) {
		this.groupRuleCondition = groupRuleCondition;
	}

}
