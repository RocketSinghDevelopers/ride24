package com.ctride.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ctride.model.VehicleGroup;


@Service
public class VehicleMapper {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	public List<VehicleGroup> filterVehicleOnCapacity(int maximumCapacity) {
		List<VehicleGroup> vehicleList = new ArrayList<VehicleGroup>();
		jdbcTemplate
				.query("SELECT vehicle_type_id, vehicle_type, num_off_passengers, vehicle_img_url, vehicle_name, vehicle_description "
						+ "FROM ctrideadm01.tbl_vehicle WHERE num_off_passengers >= ?",
						new Object[] { maximumCapacity },
						(rs, rowNum) -> new VehicleGroup(rs
								.getLong("vehicle_type_id"), rs
								.getString("vehicle_type"), rs
								.getInt("num_off_passengers"), rs
								.getString("vehicle_img_url"), rs
								.getString("vehicle_name"), rs
								.getString("vehicle_description"))).forEach(
						vehicleGroup -> vehicleList.add(vehicleGroup));

		return vehicleList;

	}
}
