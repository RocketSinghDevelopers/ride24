package com.ctride.services;

import java.util.HashSet;
import java.util.Set;

import com.ctride.constants.ServiceTypeEnum;
import com.ctride.dto.ViewRatesDTO;

public class GenericRateValidationService implements IServiceValidation {

	public boolean isValid = true;
	Set<String> errorMessageSet;

	@Override
	public boolean validate(ViewRatesDTO viewRatesDTO) {
		errorMessageSet = new HashSet<String>();
		if (null == viewRatesDTO.getServiceType()) {
			isValid = false;
		}
		if (ServiceTypeEnum.getServiceTypeList().contains(
				viewRatesDTO.getServiceType())) {

		}

		return isValid;
	}
}
