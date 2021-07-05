/**
 * 
 */
package com.company.services.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.services.service.APIService;

/**
 * @author Harsha Govada
 *
 * 
 */
@RestController
public class Controller {
	@Autowired
	APIService apiService;
	
	@GetMapping("/getruleorder")
	public Object getRules() throws Exception {
		return apiService.getData();
	}

}
