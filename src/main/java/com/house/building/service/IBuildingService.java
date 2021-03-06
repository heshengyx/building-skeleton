package com.house.building.service;

import java.util.List;

import com.house.building.entity.Building;
import com.house.building.page.IPage;
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

	void save(Building param);
	void update(Building param);
	void deleteById(String id);
	Building getDataById(String id);
	
	IPage<Building> query(BuildingQueryParam param, int page, int rows);
	List<Building> list(BuildingQueryParam param);
}
