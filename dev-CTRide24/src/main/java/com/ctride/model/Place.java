package com.ctride.model;

/**
 * Class represents a place like airport or railway station or any fixed place
 * for which fixed rates needs to be setup.
 *
 */
public class Place {
	private long placeId;
	private String placeCode;
	private String placeName;
	private String placeType;
	private String placeAddress;
	private String city;
	private String state;
	private String zipCode;

	public Place() {

	}

	public Place(long placeId, String placeCode, String placeName,
			String placeAddress, String city, String state, String zipCode,
			String placeType) {
		this.placeId = placeId;
		this.placeCode = placeCode.trim();
		this.placeName = placeName.trim();
		this.placeAddress = placeAddress.trim();
		this.city = city.trim();
		this.state = state.trim();
		this.zipCode = zipCode;
		this.placeType = placeType.trim();
	}

	public long getPlaceId() {
		return placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}

	public String getPlaceCode() {
		return placeCode;
	}

	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public String getPlaceAddress() {
		return placeAddress;
	}

	public void setPlaceAddress(String placeAddress) {
		this.placeAddress = placeAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
