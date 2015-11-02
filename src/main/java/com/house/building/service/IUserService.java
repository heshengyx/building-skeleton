package com.house.building.service;

import com.house.building.entity.User;
import com.house.building.page.IPage;
import com.house.building.param.UserQueryParam;

public interface IUserService {

	int save(User param);
	int update(User param);
	int deleteById(String id);
	User getDataById(String id);
	User getDataByUsername(User param);

	IPage<User> query(UserQueryParam param);
}
