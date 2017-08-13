/**
 * 
 */
package com.nandulabs.shoppingcart.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandulabs.shoppingcart.entities.Permission;

/**
 * @author Nandu
 *
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer>
{

}
