package com.ctride.constants;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public enum ServiceTypeEnum {
	TO_AIRPORT(1), //
	FROM_AIRPORT(2), //
	POINT_TO_POINT(3), //
	HOURLY(4), //
	TO_AIRPORT_ROUND_TRIP(5), //
	FROM_AIRPORT_ROUND_TRIP(6);//
	private int serviceTypeId;

	public int getServiceTypeId() {
		return serviceTypeId;
	}

	private ServiceTypeEnum(int serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	static List<String> serviceTypeList;

	public static List<String> getServiceTypeList() {
		if (CollectionUtils.isNotEmpty(serviceTypeList)) {
			serviceTypeList = new ArrayList<String>();
			for (ServiceTypeEnum serviceEnum : ServiceTypeEnum.values()) {
				serviceTypeList.add(serviceEnum.toString());
			}
		}
		return serviceTypeList;
	}

	public static int getServiceTypeId(String serviceType) {
		for (ServiceTypeEnum serviceEnum : ServiceTypeEnum.values()) {
			if (serviceEnum.toString().equalsIgnoreCase(serviceType)) {
				return serviceEnum.getServiceTypeId();
			}
		}
		return 0;
	}
}
