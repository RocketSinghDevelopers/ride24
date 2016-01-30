package com.ctride.services;

import com.ctride.dto.ViewRatesDTO;
import com.ctride.model.RideRate;
import com.ctride.model.VehicleGroup;

public interface IReservationRateService {

	public RideRate getServiceRequestRate(VehicleGroup vehicleGroup,
			ViewRatesDTO viewRatesDTO);
}
