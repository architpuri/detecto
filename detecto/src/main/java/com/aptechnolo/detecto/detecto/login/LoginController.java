package com.aptechnolo.detecto.detecto.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aptechnolo.detecto.detecto.CommonUtils;
import com.aptechnolo.detecto.detecto.GeneralResponse;



@RestController
public class LoginController {
	@Autowired // This means to get the bean called userRepository
	private UserRepository userRepository;
	
	@GetMapping(path="/api/users/login/{userName}/{password}")//for now change each letter to int add all and then +80
	public @ResponseBody GeneralResponse isUserRegistered(@PathVariable(value="userName")String userName,
															@PathVariable(value="password")String password) {
		User user = CommonUtils.optionalToListConverter(userRepository.findUserByUserName(userName));
		if(user!=null)
		if((user.getPassword()).compareTo(password)==0)
		return new GeneralResponse(200,"Valid User");
		else
			return new GeneralResponse(200,"InValid User Details");
		else {
		return new GeneralResponse(200,"New User > Register From Below");	
		}
	}
	
	@GetMapping(path="/api/test")
	public String testRun() {
		return "Testing Successful";
	}

}
