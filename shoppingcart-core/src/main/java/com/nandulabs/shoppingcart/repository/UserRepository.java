/**
 * 
 */
package com.nandulabs.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandulabs.shoppingcart.entities.User;

/**
 * @author Nandu
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByEmail(String email);

}
