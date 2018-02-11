/**
 * 
 */
package com.nandulabs.shoppingcart.admin.web.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nandulabs.shoppingcart.admin.web.models.ProductForm;
import com.nandulabs.shoppingcart.entities.Product;
import com.nandulabs.shoppingcart.service.CatalogService;

/**
 * @author Nandu
 *
 */
@Component
public class ProductFormValidator implements Validator {
	
	@Autowired
	protected MessageSource messageSource;
	@Autowired
	protected CatalogService catalogService;

	@Override
	public boolean supports(Class<?> clazz) {
		return Product.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ProductForm product = (ProductForm) target;
		String sku = product.getSku();
		Product p = catalogService.getProductBySku(sku);
		if (p != null) {
			errors.rejectValue("sku", "error.exists", new Object[] { sku }, "Product SKU " + sku + " already exists");
		}
	}

}
