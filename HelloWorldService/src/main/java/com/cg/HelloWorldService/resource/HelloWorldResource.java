/**
 * 
 */
package com.cg.HelloWorldService.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ugawari
 *
 */
@RestController
@RequestMapping("/helloworlds")
public class HelloWorldResource {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping
	public String hello() {
		//System.out.println(this.discoveryClient.getInstances("helloworld-service"));
		return "Hello World!!!";
	}
}
