/**
 * 
 */
package com.company.services.api;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Harsha Govada
 *
 * 
 */

@Produces(value = {MediaType.APPLICATION_JSON})
@FeignClient(name = "rules",url = "http://localhost:8083")
public interface GetRules {
	@RequestMapping(method = RequestMethod.GET,value = "/getrules")
	public Object getRules() throws Exception;
}
