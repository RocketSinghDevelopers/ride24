package com.ctride.util;

import com.ctride.dto.ViewRatesDTO;

/**
 * Interface to validate all service requests.
 */
public interface IServiceValidation {
	/**
	 * 
	 * @param viewRatesDTO
	 */
	public void validate(ViewRatesDTO viewRatesDTO);
}
