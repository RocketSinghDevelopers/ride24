package com.ctride.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ctride.model.Place;
import com.ctride.repository.PlaceMapper;

@RestController
@RequestMapping(value = "/v1/place/")
public class PlaceResource {

	@Autowired
	private PlaceMapper placeMapper;

	@RequestMapping(value = "{placeType}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Place> getAllPlaces(@PathVariable String placeType) {
		return placeMapper.getSavedPlaces(placeType.toUpperCase());

	}

}
