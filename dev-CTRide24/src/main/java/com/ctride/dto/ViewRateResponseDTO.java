package com.ctride.dto;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.ctride.model.AddonRate;
import com.ctride.model.FixedRate;
import com.ctride.model.Place;
import com.ctride.model.RideRate;
import com.ctride.model.VehicleGroup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ViewRateResponseDTO {

	@JsonIgnoreProperties
	private VehicleGroup vehicleGroup;

	@JsonIgnoreProperties
	private RideRate rideRate;

	@JsonIgnoreProperties
	private Place pickUpPlace;

	@JsonIgnoreProperties
	private Place dropOffPlace;

	public ViewRateResponseDTO(VehicleGroup vehicleGroup, RideRate rideRate,
			Place pickUpPlace, Place dropOffPlace) {
		this.vehicleGroup = vehicleGroup;
		this.rideRate = rideRate;
		this.pickUpPlace = pickUpPlace;
		this.dropOffPlace = dropOffPlace;
	}

	@JsonProperty("vehicle_name")
	public String getVehicleName() {
		return vehicleGroup.getVehicleName().trim();
	}

	@JsonProperty("vehicle_type_id")
	public long getVehicleTypeId() {
		return vehicleGroup.getVehicleTypeId();
	}

	@JsonProperty("vehicle_description")
	public String getVehicleDescription() {
		return vehicleGroup.getVehicleDescription() != null ? vehicleGroup
				.getVehicleDescription().trim() : "";

	}

	@JsonProperty("image_url")
	public String getImageUrl() {
		return vehicleGroup.getVehicleImageURL().trim();
	}

	@JsonProperty("capacity")
	public int getCapacity() {
		return vehicleGroup.getMaxNumPassenger();
	}

	@JsonProperty("rate_group_name")
	public String getRateGroupName() {
		return "Regular";
	}

	@JsonProperty("base_rate_item")
	public Object getBaseRateItem() {
		return new BaseRateItem();
	}

	@JsonProperty("pickup_address")
	public Object getPickUpAddress() {
		return new PickUpBean();
	}

	@JsonProperty("dropoff_address")
	public Object getDropOffAddress() {
		return new DropOffBean();
	}

	@JsonProperty("optional_fixed_rate_items")
	public List<FixedAddonItem> getFixedAddonList() {
		List<FixedAddonItem> addonItemList = new ArrayList<FixedAddonItem>();
		if (CollectionUtils.isNotEmpty(rideRate.getFixedRateAddonList())) {
			rideRate.getFixedRateAddonList().forEach(
					fixedRateAddon -> addonItemList.add(new FixedAddonItem(
							fixedRateAddon.getAddon().getAddonId(),
							fixedRateAddon.getAddon().getAddonName(),
							fixedRateAddon.getAddon().getAddonDescription(),
							fixedRateAddon.getAddonRate())));
		}

		return addonItemList;
	}

	@JsonProperty("incremental_rate_items")
	public List<IncrementalAddonItem> getIncrementalAddonList() {
		List<IncrementalAddonItem> addonItemList = new ArrayList<IncrementalAddonItem>();
		if (CollectionUtils.isNotEmpty(rideRate.getIncrementalRateAddonList())) {
			rideRate.getIncrementalRateAddonList().forEach(
					incrementRateAddon -> addonItemList
							.add(new IncrementalAddonItem(incrementRateAddon
									.getAddon().getAddonId(),
									incrementRateAddon.getAddon()
											.getAddonName(), incrementRateAddon
											.getAddon().getAddonDescription(),
									incrementRateAddon.getAddonRate(),
									incrementRateAddon.getMinCapacity(),
									incrementRateAddon.getMaxCapacity())));
		}
		return addonItemList;
	}

	class BaseRateItem {
		@JsonProperty("rate_type")
		public String getRateTyoe() {
			if (rideRate instanceof FixedRate) {
				return "Flat";
			} else {
				return "";
			}
		}

		@JsonProperty("amount")
		public double getAmount() {
			return rideRate.getFare();
		}
	}

	class PickUpBean {
		@JsonProperty("zip")
		public String getZip() {
			return pickUpPlace.getZipCode();
		}

		@JsonProperty("full_address")
		public String getFullAddress() {
			return pickUpPlace.getPlaceAddress();
		}
	}

	class DropOffBean {
		@JsonProperty("zip")
		public String getZip() {
			return dropOffPlace.getZipCode();
		}

		@JsonProperty("full_address")
		public String getFullAddress() {
			return dropOffPlace.getPlaceAddress();
		}
	}

	class FixedAddonItem {

		@JsonIgnoreProperties
		private long addonId;

		@JsonIgnoreProperties
		private String addonName;

		@JsonIgnoreProperties
		private String description;

		@JsonIgnoreProperties
		private double amount;

		public FixedAddonItem(long addonId, String addonName,
				String description, double amount) {
			this.addonId = addonId;
			this.addonName = addonName;
			this.description = description;
			this.amount = amount;
		}

		@JsonProperty("addon_id")
		public long getAddonId() {
			return addonId;
		}

		@JsonProperty("addon_name")
		public String getAddonName() {
			return addonName;
		}

		/*@JsonProperty("description")
		public String getDescription() {
			return description;
		}*/

		@JsonProperty("amount")
		public double getAmount() {
			return amount;
		}
	}

	class IncrementalAddonItem {

		@JsonIgnoreProperties
		private long addonId;
		
		@JsonIgnoreProperties
		private String addonName;

		@JsonIgnoreProperties
		private String description;

		@JsonIgnoreProperties
		private double amount;

		@JsonIgnoreProperties
		private int incrementalMin;

		@JsonIgnoreProperties
		private int incrementalMax;

		public IncrementalAddonItem(long addonId, String addonName,
				String description, double amount, int incrementalMin,
				int incrementalMax) {
			this.addonId = addonId;
			this.addonName = addonName;
			this.description = description;
			this.amount = amount;
			this.incrementalMin = incrementalMin;
			this.incrementalMax = incrementalMax;
		}

		@JsonProperty("addon_id")
		public long getAddonId() {
			return addonId;
		}
		
		@JsonProperty("addon_name")
		public String getAddonName() {
			return addonName;
		}

		/*@JsonProperty("description")
		public String getDescription() {
			return description;
		}*/

		@JsonProperty("incremental_amount")
		public double getAmount() {
			return amount;
		}

		@JsonProperty("incremental_minimum")
		public int getIncrementalMin() {
			return incrementalMin;
		}

		@JsonProperty("incremental_maximum")
		public int getIncrementalMax() {
			return incrementalMax;
		}

	}

}
