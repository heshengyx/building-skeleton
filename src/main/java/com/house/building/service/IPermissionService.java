package com.house.building.service;

import java.util.List;

import com.house.building.entity.Permission;
import com.house.building.page.IPage;
import com.house.building.param.PermissionQueryParam;

public interface IPermissionService {

	int save(Permission param);
	int update(Permission param);
	int deleteById(String id);
	Permission getDataById(String id);
	
	IPage<Permission> query(PermissionQueryParam param);
	List<Permission> queryPermissionsByRoleId(String roleId);
	List<Permission> queryPermissions();
}
