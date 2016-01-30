package com.ctride.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctride.dto.ViewRatesDTO;
import com.ctride.services.IReservationRateService;

@Service
public class RateServiceFactory {

	@Autowired
	private IReservationRateService flatRateService;

	public IReservationRateService getRateServiceObject(
			ViewRatesDTO viewRatesDTO) {
		if (viewRatesDTO.getPickupLocationId() == -1
				|| viewRatesDTO.getDropOffLocationId() == -1) {
			return flatRateService;
		}
		return null;
	}
}
