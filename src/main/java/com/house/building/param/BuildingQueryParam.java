package com.house.building.param;

import java.io.Serializable;

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
public class BuildingQueryParam implements Serializable {
	
	/**  */
	private static final long serialVersionUID = -7030573523951102108L;
	private String buildingName;
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
}
