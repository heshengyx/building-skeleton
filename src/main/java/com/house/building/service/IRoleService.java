package com.house.building.service;

import java.util.List;

import com.house.building.entity.Role;
import com.house.building.page.IPage;
import com.house.building.param.RoleQueryParam;

public interface IRoleService {

	int save(Role param);
	int update(Role param);
	int delete(Role param);
	Role getData(Role param);
	
	IPage<Role> query(RoleQueryParam param);
	List<Role> list(RoleQueryParam param);
	List<Role> queryRolesByUserId(String userId);
}
