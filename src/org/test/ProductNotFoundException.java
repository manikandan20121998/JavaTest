package org.test;

public class ProductNotFoundException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "product not available in this list so search relavent items only...";
	}
	
}
