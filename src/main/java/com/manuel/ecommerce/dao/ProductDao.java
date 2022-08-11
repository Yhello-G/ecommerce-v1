package com.manuel.ecommerce.dao;

import java.io.InputStream;
import java.util.List;

import com.manuel.ecommerce.beans.ProductBean;

public interface ProductDao {

	String addProduct(String prodName,String prodType,String prodInfo, double prodPrice, int prodQuantity, InputStream prodImage);
	
	String addProduct(ProductBean product);
	
	String removeProduct(String prodId);
	
	String updateProduct(ProductBean prevProduct, ProductBean updatedProduct);
	
	String updateProductPrice(String prodId, double updatedPrice);
	
	List<ProductBean> getAllProducts();
	
	byte[] getImage(String prodId);
	
	ProductBean getProductDetails(String prodId);
	
	String updateProductWithoutImage(String prevProductId, ProductBean updatedProduct);
	
	double getProductPrice(String prodId);
	
	boolean sellNProduct(String prodId,int n);
	
	int getProductQuantity(String prodId);
}
