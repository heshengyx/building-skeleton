package com.house.building.service;

import com.house.building.entity.Building;
import com.house.building.page.Page;
import com.house.building.param.BuildingQueryParam;

/**
 * 描述：
 * 
 * <pre>HISTORY
 * ****************************************************************************
 *  ID   DATE           PERSON          REASON
 *  1    2015年10月30日      608279         Create
 * ****************************************************************************
 * </pre>
 * @author 608279
 * @since 1.0
 */
public interface IBuildingService {

	int save(Building param);
	int update(Building param);
	int deleteById(String id);
	Building getDataById(String id);
	
	Page<Building> query(BuildingQueryParam param);
}
