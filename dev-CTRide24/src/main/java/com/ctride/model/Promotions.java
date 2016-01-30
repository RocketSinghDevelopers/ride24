package com.ctride.model;

public class Promotions {
	private String promoCode;
	private String promoDescription;
	private String promoStartDate;
	private String promoEndDate;
	private double promoDiscount;
	private String promoDiscountUnit;
	private RateGroup rateGroup;

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getPromoDescription() {
		return promoDescription;
	}

	public void setPromoDescription(String promoDescription) {
		this.promoDescription = promoDescription;
	}

	public String getPromoStartDate() {
		return promoStartDate;
	}

	public void setPromoStartDate(String promoStartDate) {
		this.promoStartDate = promoStartDate;
	}

	public String getPromoEndDate() {
		return promoEndDate;
	}

	public void setPromoEndDate(String promoEndDate) {
		this.promoEndDate = promoEndDate;
	}

	public double getPromoDiscount() {
		return promoDiscount;
	}

	public void setPromoDiscount(double promoDiscount) {
		this.promoDiscount = promoDiscount;
	}

	public String getPromoDiscountUnit() {
		return promoDiscountUnit;
	}

	public void setPromoDiscountUnit(String promoDiscountUnit) {
		this.promoDiscountUnit = promoDiscountUnit;
	}

	public RateGroup getRateGroup() {
		return rateGroup;
	}

	public void setRateGroup(RateGroup rateGroup) {
		this.rateGroup = rateGroup;
	}

}
