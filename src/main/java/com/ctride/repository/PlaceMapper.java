package com.ctride.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ctride.model.Place;

@Service
public class PlaceMapper {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Place> getSavedPlaces(String placeType) {
		List<Place> placeList = new ArrayList<Place>();

		jdbcTemplate
				.query("SELECT place_id, place_code, place_name, place_address, city, state, zip_code, place_type "
						+ "FROM ctrideadm01.tbl_places_list WHERE place_type = ?",
						new Object[] { placeType },
						(rs, rowNum) -> new Place(rs.getLong("place_id"), rs
								.getString("place_code"), rs
								.getString("place_name"), rs
								.getString("place_address"), rs
								.getString("city"), rs.getString("state"), rs
								.getString("zip_code"), rs
								.getString("place_type"))).forEach(
						place -> placeList.add(place));

		return placeList;

	}

}
