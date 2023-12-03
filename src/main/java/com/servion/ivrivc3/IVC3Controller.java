package com.servion.ivrivc3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IVC3Controller {
	
	@GetMapping("/ivr/ivc3")
	public String processBackend(@RequestParam(defaultValue = "defaulthost") String ivc3Method) {
		System.out.println(ivc3Method + " - Processing");
		System.out.println(ivc3Method + " - Processed");
		return ivc3Method + "-Result : 7d988at98ad78f798ad7f98d798f7a0fd709";
	}

}
