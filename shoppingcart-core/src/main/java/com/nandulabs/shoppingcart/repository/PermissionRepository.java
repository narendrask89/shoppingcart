/**
 * 
 */
package com.nandulabs.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandulabs.shoppingcart.entities.Permission;

/**
 * @author Nandu
 *
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer>
{

}
