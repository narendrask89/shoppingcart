/**
 * 
 */
package com.nandulabs.shoppingcart.catalog;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandulabs.shoppingcart.entities.Category;

/**
 * @author Nandu
 *
 */
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	Category getByName(String name);

}
