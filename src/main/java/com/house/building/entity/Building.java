package com.house.building.entity;

import java.io.Serializable;
import java.util.Date;

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
public class Building implements Serializable {

	/**  */
	private static final long serialVersionUID = 5051212720480835254L;
	private String id;
	private String buildingName;
	private String buildingYear;
	private String buildingFloor;
	private String buildingAddress;
	private String status;
	private Date createTime;
	private Date updateTime;
	private String remarks;
	
	public String getBuildingAddress() {
		return buildingAddress;
	}
	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}
	public String getBuildingYear() {
		return buildingYear;
	}
	public void setBuildingYear(String buildingYear) {
		this.buildingYear = buildingYear;
	}
	public String getBuildingFloor() {
		return buildingFloor;
	}
	public void setBuildingFloor(String buildingFloor) {
		this.buildingFloor = buildingFloor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
