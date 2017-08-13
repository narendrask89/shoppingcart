/**
 * 
 */
package com.nandulabs.shoppingcart.admin.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nandu
 *
 */
@Controller
public class HomeController extends ShoppingCartAdminBaseController
{	
	@Override
	protected String getHeaderTitle() {
		return "Home";
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		return "home";
	}

	

}
