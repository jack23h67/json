package com.example.json.objectmapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ObjectMapperController {

	@GetMapping("/convert")
	public String convert() throws JsonProcessingException {
		User user = new User();
		user.setId(1);
		user.setName("Judy");
		user.setContactEmail("test.com");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		// user -> json string
		String jsonRs = objectMapper.writeValueAsString(user);
		System.out.println(jsonRs);
		
		// json string -> json
		String json = "{\"id\":3,\"name\":\"Amy\",\"age\":20,\"contact_email\":\"hello@test.com\"}";
		User userRs = objectMapper.readValue(json, User.class);
		System.out.println(userRs.getId());
		System.out.println(userRs.getName());
		System.out.println(userRs.getContactEmail());
		
		return "convert success";
	}
}
