/**
 * 
 */
package com.nandulabs.shoppingcart.security;

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
