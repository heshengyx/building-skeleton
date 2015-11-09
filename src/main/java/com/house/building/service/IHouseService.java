package com.house.building.service;

import com.house.building.entity.House;
import com.house.building.page.IPage;
import com.house.building.param.HouseQueryParam;

public interface IHouseService {

	void save(House param);
	void update(House param);
	void deleteById(String id);
	House getDataById(String id);
	
	IPage<House> query(HouseQueryParam param, int page, int rows);
}