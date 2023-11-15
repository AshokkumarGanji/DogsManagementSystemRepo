/**
 * 
 */
package com.ashokGanji.DMS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ashokGanji.DMS.Models.Dog;

import java.util.*;

/**
 * @auther Ashok Kumar Ganji
 * Nov 11, 2023
 */


public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);
	

}
