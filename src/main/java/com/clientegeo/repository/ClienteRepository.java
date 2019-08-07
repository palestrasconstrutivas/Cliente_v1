/**
 * 
 */
package com.clientegeo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.clientegeo.entity.Cliente;


/**
 * @author hp
 *
 */
@Repository
@Transactional
public interface ClienteRepository extends CrudRepository<Cliente,Long> {

 
	 Optional<Cliente> findById(Long id) ;
 
	
}
