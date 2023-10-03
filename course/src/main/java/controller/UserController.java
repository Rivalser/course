//Kliens felé az interfész, milyen kommunikáció zajlik le
package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import service.UserService;

@RestController
@RequestMapping("api/controller")
@Tag(name = "User API")

public class UserController {

private final UserService UserService;
	
	public UserController(UserService userService) {
		this.UserService = userService;
	}
	
	@GetMapping
	//Végpont létrehozása, ami létrehozza az összes kurzust
	public List<UserDto> getAllUser() {
		return UserService.getAllUser();		
	}
	
	
	
}
