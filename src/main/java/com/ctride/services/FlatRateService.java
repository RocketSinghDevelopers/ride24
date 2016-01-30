package com.ctride.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctride.dto.ViewRatesDTO;
import com.ctride.model.AddonRate;
import com.ctride.model.FixedRate;
import com.ctride.model.Place;
import com.ctride.model.RideRate;
import com.ctride.model.VehicleGroup;
import com.ctride.repository.RateMapper;

@Service("flatRateService")
public class FlatRateService implements IReservationRateService {

	@Autowired
	RateMapper rateMapper;

	@Override
	public RideRate getServiceRequestRate(VehicleGroup vehicleGroup,
			ViewRatesDTO viewRatesDTO) {

		// get fixed rate
		FixedRate fixedRate = rateMapper.getFlatRateForVehicle(vehicleGroup,
				viewRatesDTO);
		Place fromPlace = new Place();
		fromPlace.setZipCode(viewRatesDTO.getPickupLocationZip());
		fromPlace.setPlaceAddress(viewRatesDTO.getPickupLocation());
		fixedRate.setFromPlace(fromPlace);

		Place toPlace = new Place();
		toPlace.setZipCode(viewRatesDTO.getDropOffLocationZip());
		toPlace.setPlaceAddress(viewRatesDTO.getDropOffLocation());
		fixedRate.setToPlace(toPlace);

		fixedRate.setVehicleGroup(vehicleGroup);

		// get fixed rate addons
		List<AddonRate> fixedRateAddonList = rateMapper.getFixedRateAddon(
				vehicleGroup, viewRatesDTO.getRateGroupId());
		fixedRate.setFixedRateAddonList(fixedRateAddonList);

		// get incremental rate addons
		List<AddonRate> incrementalRateAddonList = rateMapper
				.getIncrementalRateAddon(vehicleGroup,
						viewRatesDTO.getRateGroupId());

		fixedRate.setIncrementalRateAddonList(incrementalRateAddonList);

		return fixedRate;
	}

}
