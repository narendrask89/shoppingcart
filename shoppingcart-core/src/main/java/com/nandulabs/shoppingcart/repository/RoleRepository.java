/**
 * 
 */
package com.nandulabs.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandulabs.shoppingcart.entities.Role;

/**
 * @author Nandu
 *
 */
public interface RoleRepository extends JpaRepository<Role, Integer>
{

	Role findByName(String name);

}
