package com.ctride.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctride.constants.ErrorCodeEnum;
import com.ctride.dto.ViewRateResponseDTO;
import com.ctride.dto.ViewRatesDTO;
import com.ctride.exception.BaseException;
import com.ctride.model.Place;
import com.ctride.model.RideRate;
import com.ctride.model.VehicleGroup;
import com.ctride.repository.RateMapper;
import com.ctride.repository.VehicleMapper;
import com.ctride.util.RateServiceFactory;

@Service
public class ReservationReqestService {

	@Autowired
	VehicleMapper vehicleMapper;

	@Autowired
	RateMapper rateMapper;

	@Autowired
	RateServiceFactory rateServiceFactory;

	/**
	 * This method returns all the information satisfying user criteria for
	 * reservation
	 * 
	 * @param viewRatesDTO
	 * @return
	 */
	public List<ViewRateResponseDTO> viewVehicleAndRatesForReservation(
			ViewRatesDTO viewRatesDTO) {

		List<ViewRateResponseDTO> rateResponseDTOList = new ArrayList<ViewRateResponseDTO>();

		List<VehicleGroup> vehicleTypeList = vehicleMapper
				.filterVehicleOnCapacity(viewRatesDTO.getNumOfPassenger());
		IReservationRateService rateService = rateServiceFactory
				.getRateServiceObject(viewRatesDTO);

		if (viewRatesDTO.getRateGroupId() == 0) {
			// set rate group to REGULAR
			viewRatesDTO.setRateGroupId(1);
		}

		Place pickUpPlace = new Place();
		pickUpPlace.setPlaceAddress(viewRatesDTO.getPickupLocation());
		pickUpPlace.setZipCode(viewRatesDTO.getPickupLocationZip());

		Place dropOffPlace = new Place();
		dropOffPlace.setPlaceAddress(viewRatesDTO.getDropOffLocation());
		dropOffPlace.setZipCode(viewRatesDTO.getDropOffLocationZip());

		ViewRateResponseDTO viewRateResponseDTO;
		RideRate rideRate;
		if (CollectionUtils.isNotEmpty(vehicleTypeList) && rateService != null) {
			for (VehicleGroup vehicle : vehicleTypeList) {
				rideRate = rateService.getServiceRequestRate(vehicle,
						viewRatesDTO);
				viewRateResponseDTO = new ViewRateResponseDTO(vehicle,
						rideRate, pickUpPlace, dropOffPlace);
				rateResponseDTOList.add(viewRateResponseDTO);
			}
		} else {
			throw new BaseException(ErrorCodeEnum.ERROR_1001.getErrorCode(),
					"No vehicle or rate service Object found");
		}

		return rateResponseDTOList;
	}

}
