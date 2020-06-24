package com.sap.messageservice.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/message")
public class MessageController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping(path = { "/getError" })
	public String getError(HttpServletRequest request) throws Exception {
		String msg = "ERROR" + System.currentTimeMillis();

		logger.error(msg);

		return msg;
	}

	@GetMapping(path = { "/getWarning" })
	public String getWarning(HttpServletRequest request) throws Exception {
		String msg = "WARN" + System.currentTimeMillis();

		logger.warn(msg);

		return msg;
	}

	@GetMapping(path = { "/getDebug" })
	public String getDebug(HttpServletRequest request) throws Exception {
		String msg = "DEBUG" + System.currentTimeMillis();

		logger.debug(msg);

		return msg;
	}

	@GetMapping(path = { "/getInfo" })
	public String getInfo(HttpServletRequest request) throws Exception {
		String msg = "INFO" + System.currentTimeMillis();

		logger.info(msg);

		return msg;
	}

	@GetMapping(path = { "/getMessage" })
	public String getMessage(HttpServletRequest request) throws Exception {
		String msg = "Hello world!";

		return msg;
	}

	@GetMapping(path = { "/getFullname" })
	public String getFullname(HttpServletRequest request) throws Exception {
		String msg = "Hello: ";

		RestTemplate restTemplate = new RestTemplate();
		String name = restTemplate.getForObject("http://person:8080/person/getName", String.class);

		msg = msg + name;
		return msg;
	}

}
