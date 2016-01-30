package com.ctride.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ctride.dto.ViewRateResponseDTO;
import com.ctride.dto.ViewRatesDTO;
import com.ctride.services.ReservationReqestService;
import com.ctride.util.ServiceValidationUtil;

@RestController
@RequestMapping(value = "/v1/service/")
public class ServiceResource {

	@Autowired
	private ServiceValidationUtil serviceValidationUtil;

	@Autowired
	ReservationReqestService reservationReqestService;

	/**
	 * API to return different rates and vehicle information based on data
	 * provided.
	 * 
	 * @param viewRate
	 * @return
	 */
	@RequestMapping(value = "viewrates", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<ViewRateResponseDTO> viewRates(
			@RequestBody ViewRatesDTO viewRatesDTO) {

		/**
		 * VALIDATIONS <br>
		 * - Check if service id exist <br>
		 * - check if service is provided b/w pickup and drop off location - is
		 * this configured <br>
		 * - Check the blackout schedule for pickup date <br>
		 * 
		 **/

		/**
		 * Services <br>
		 * - fetch the vehicles and rates as per num. of passengers, rate group.
		 * - Fetch the addon rates - flat and incremental
		 * 
		 */
		// serviceValidationUtil.validateServiceRateRequest(viewRatesDTO);

		return reservationReqestService
				.viewVehicleAndRatesForReservation(viewRatesDTO);
	}

}
