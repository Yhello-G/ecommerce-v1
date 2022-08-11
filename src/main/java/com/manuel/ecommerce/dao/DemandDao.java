package com.manuel.ecommerce.dao;

import java.util.List;


import com.manuel.ecommerce.beans.DemandBean;

public interface DemandDao {
	
	boolean addProduct(String userId, String prodId, int demandQty);
	
	boolean addProduct(DemandBean userDemandBean);
	
	boolean removeProduct(String userId, String prodId);
	
	List<DemandBean> haveDemanded(String prodId);
	
}
