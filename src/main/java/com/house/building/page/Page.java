package com.house.building.page;

import java.util.Collection;

public interface Page<T> extends java.io.Serializable {

	int getTotal();
	int getSize();
	int getIndex();
	int getTotalRecord();
	Collection<T> getData();
}
