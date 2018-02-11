/**
 * 
 */
package com.nandulabs.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandulabs.shoppingcart.entities.Order;

/**
 * @author Nandu
 *
 */
public interface OrderRepository extends JpaRepository<Order, Integer>
{
	Order findByOrderNumber(String orderNumber);
}
