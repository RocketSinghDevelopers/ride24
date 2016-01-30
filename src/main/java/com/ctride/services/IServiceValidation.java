package com.ctride.services;

import com.ctride.dto.ViewRatesDTO;

/**
 * Interface to validate all service requests.
 */
public interface IServiceValidation {
	/**
	 * 
	 * @param viewRatesDTO
	 */
	public boolean validate(ViewRatesDTO viewRatesDTO);
}
