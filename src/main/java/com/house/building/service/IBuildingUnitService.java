package com.house.building.service;

import com.house.building.entity.BuildingUnit;
import com.house.building.page.IPage;
import com.house.building.param.BuildingUnitQueryParam;

public interface IBuildingUnitService {

	int save(BuildingUnit param);
	void update(BuildingUnit param);
	void deleteById(String id);
	BuildingUnit getDataById(String id);
	
	IPage<BuildingUnit> query(BuildingUnitQueryParam param, int page, int rows);
}
