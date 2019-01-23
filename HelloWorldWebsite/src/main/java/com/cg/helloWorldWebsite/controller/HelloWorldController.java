/**
 * 
 */
package com.cg.helloWorldWebsite.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ugawari
 *
 */
@Controller
public class HelloWorldController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/index")
	public ModelAndView getHelloWorld() {
		//String message = restTemplate.exchange("http://helloworld-service/helloworlds",  HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
		ResponseEntity<String> entity= restTemplate.getForEntity("http://helloworld-service/helloworlds",  String.class);
		String message = entity.getBody();
		return new ModelAndView("index", "message", message);
	}
}
