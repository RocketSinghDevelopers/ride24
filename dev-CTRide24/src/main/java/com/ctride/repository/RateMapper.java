package com.ctride.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.ctride.dto.ViewRatesDTO;
import com.ctride.model.AddonRate;
import com.ctride.model.FixedRate;
import com.ctride.model.VehicleAddon;
import com.ctride.model.VehicleGroup;

@Service
public class RateMapper {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * Get flat price between two places
	 * 
	 * @param vehicleGroup
	 * @param viewRatesDTO
	 * @return
	 */
	public FixedRate getFlatRateForVehicle(VehicleGroup vehicleGroup,
			ViewRatesDTO viewRatesDTO) {

		FixedRate fixedRate = jdbcTemplate
				.queryForObject(
						"SELECT flat_rate FROM ctrideadm01.tbl_flat_rate_pricing where vechicle_type_id = ? and from_place_zip_code = ? "
								+ "and to_place_zip_code = ? and rate_group_id = ?",
						new Object[] { vehicleGroup.getVehicleTypeId(),
								viewRatesDTO.getPickupLocationZip(),
								viewRatesDTO.getDropOffLocationZip(),
								viewRatesDTO.getRateGroupId() },
						new FixedRateMapper());

		return fixedRate;

	}

	/**
	 * Get fixed rate addons
	 * 
	 * @param vehicleGroup
	 * @param rateGroupId
	 * @return
	 */
	public List<AddonRate> getFixedRateAddon(VehicleGroup vehicleGroup,
			int rateGroupId) {
		List<AddonRate> fixedRateAddonList = new ArrayList<AddonRate>();
		jdbcTemplate
				.query("SELECT a.addon_id, a.addon_name, a.addon_service_description, a.rate_type,a.is_active, b.addon_rate, b.maximum_capacity, b.minimum_capacity "
						+ " FROM ctrideadm01.tbl_addon a, ctrideadm01.tbl_addons_rate b where a.addon_id = b.addon_id and b.vehicle_type_id = ? and b.rate_group_id = ? "
						+ " and b.is_incremental = false",
						new Object[] { vehicleGroup.getVehicleTypeId(),
								rateGroupId }, new RowMapper<AddonRate>() {

							@Override
							public AddonRate mapRow(ResultSet rs, int column)
									throws SQLException {
								AddonRate addonRate = new AddonRate();
								VehicleAddon vehicleAddon = new VehicleAddon();
								vehicleAddon.setAddonId(rs.getLong("addon_id"));
								vehicleAddon.setAddonName(rs
										.getString("addon_name"));
								vehicleAddon.setAddonDescription(rs
										.getString("addon_service_description"));
								addonRate.setAddon(vehicleAddon);
								addonRate.setAddonRate(rs
										.getDouble("addon_rate"));
								addonRate.setMaxCapacity(rs
										.getInt("maximum_capacity"));
								addonRate.setMinCapacity(rs
										.getInt("minimum_capacity"));
								addonRate.setIncremental(false);
								return addonRate;
							}
						}).forEach(
						addonRate -> fixedRateAddonList.add(addonRate));

		return fixedRateAddonList;

	}

	/**
	 * Get incremental rate addons
	 * 
	 * @param vehicleGroup
	 * @param rateGroupId
	 * @return
	 */

	public List<AddonRate> getIncrementalRateAddon(VehicleGroup vehicleGroup,
			int rateGroupId) {
		List<AddonRate> incrementalRateAddonList = new ArrayList<AddonRate>();
		jdbcTemplate
				.query("SELECT a.addon_id, a.addon_name, a.addon_service_description, a.rate_type,a.is_active, b.addon_rate, b.maximum_capacity, b.minimum_capacity "
						+ " FROM ctrideadm01.tbl_addon a, ctrideadm01.tbl_addons_rate b where a.addon_id = b.addon_id and b.vehicle_type_id = ? and b.rate_group_id = ? "
						+ " and b.is_incremental = true",
						new Object[] { vehicleGroup.getVehicleTypeId(),
								rateGroupId }, new RowMapper<AddonRate>() {

							@Override
							public AddonRate mapRow(ResultSet rs, int column)
									throws SQLException {
								AddonRate addonRate = new AddonRate();
								VehicleAddon vehicleAddon = new VehicleAddon();
								vehicleAddon.setAddonId(rs.getLong("addon_id"));
								vehicleAddon.setAddonName(rs
										.getString("addon_name"));
								vehicleAddon.setAddonDescription(rs
										.getString("addon_service_description"));
								addonRate.setAddon(vehicleAddon);
								addonRate.setAddonRate(rs
										.getDouble("addon_rate"));
								addonRate.setMaxCapacity(rs
										.getInt("maximum_capacity"));
								addonRate.setMinCapacity(rs
										.getInt("minimum_capacity"));
								addonRate.setIncremental(false);
								return addonRate;
							}
						}).forEach(
						addonRate -> incrementalRateAddonList.add(addonRate));

		return incrementalRateAddonList;

	}

	class FixedRateMapper implements RowMapper<FixedRate> {

		@Override
		public FixedRate mapRow(ResultSet rs, int column) throws SQLException {
			FixedRate fixedRate = new FixedRate();
			fixedRate.setFare(rs.getDouble("flat_rate"));
			return fixedRate;
		}

	}
}
