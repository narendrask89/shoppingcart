/**
 * 
 */
package com.nandulabs.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nandulabs.shoppingcart.entities.Customer;
import com.nandulabs.shoppingcart.entities.Order;

/**
 * @author Nandu
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Customer findByEmail(String email);

	@Query("select o from Order o where o.customer.email=?1")
	List<Order> getCustomerOrders(String email);

}
