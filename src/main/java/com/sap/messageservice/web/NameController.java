package com.sap.messageservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

	@GetMapping(path = { "/seperateName" })
	public String seperateName(@RequestBody String fullName) throws Exception {
		
		return fullName;
	}
}
