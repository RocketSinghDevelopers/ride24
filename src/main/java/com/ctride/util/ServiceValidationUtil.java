package com.ctride.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ctride.dto.ViewRatesDTO;
import com.ctride.services.IServiceValidation;

@Service("serviceValidationUtil")
public class ServiceValidationUtil {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	List<IServiceValidation> serviceValidatorStrategyList;

	public void validateServiceRateRequest(ViewRatesDTO viewRatesDTO) {
		serviceValidatorStrategyList = new ArrayList<IServiceValidation>();
		
	}

}
