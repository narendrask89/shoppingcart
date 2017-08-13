/**
 * 
 */
package com.nandulabs.shoppingcart.admin.web.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Nandu
 *
 */
public class WebUtils {
	
	private WebUtils() {
	}

	public static final String IMAGES_PREFIX = "/products/images/";
	public static final String IMAGES_DIR = "D:/shoppingcart/products/";

	public static String getURLWithContextPath(HttpServletRequest request) {
		return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath();
	}

}
