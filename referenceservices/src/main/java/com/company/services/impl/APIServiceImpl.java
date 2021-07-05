/**
 * 
 */
package com.company.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.services.api.GetRules;
import com.company.services.service.APIService;

/**
 * @author Harsha Govada
 *
 * 
 */
@Service
public class APIServiceImpl implements APIService{
	
	@Autowired
	private GetRules getRules;

	@Override
	public Object getData() throws Exception {
		// TODO Auto-generated method stub
		return getRules.getRules();
	}

}
