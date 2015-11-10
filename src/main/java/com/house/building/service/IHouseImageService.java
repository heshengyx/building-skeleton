package com.house.building.service;

import com.house.building.entity.HouseImage;
import com.house.building.page.IPage;
import com.house.building.param.HouseImageQueryParam;

public interface IHouseImageService {

	void save(HouseImage param);
	void update(HouseImage param);
	void deleteById(String id);
	HouseImage getDataById(String id);
	
	IPage<HouseImage> query(HouseImageQueryParam param, int page, int rows);
}