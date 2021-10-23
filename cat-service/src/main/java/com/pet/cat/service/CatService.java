/**
 * 
 */
package com.pet.cat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.cat.feign.FoodService;

/**
 * @author Obuli Sundar
 *
 */
@Service
public class CatService {
	
	@Autowired
	private FoodService foodService;
	
	public String getFood() {
		return foodService.getFood("cat");
	}
}
