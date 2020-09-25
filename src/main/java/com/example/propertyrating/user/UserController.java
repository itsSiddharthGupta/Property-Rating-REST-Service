package com.example.propertyrating.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserAuthenticationService userAuthenticationService;
	@RequestMapping(method = RequestMethod.POST, path = "/rest-auth", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String authorizeUser(@RequestBody UserAuth userAuth) {
		if(userAuthenticationService.authenticateUser(userAuth.getEmail(), userAuth.getPassword())) {
			return "Success";
		} else {
			return "Failure";
		}
	}
	@RequestMapping
	public void addMe() {
		userAuthenticationService.addMe(new UserAuth("siddh.gupta99@gmail.com", "123456"));
	}
}
