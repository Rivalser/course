//Kliens felé az interfész, milyen kommunikáció zajlik le
package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dto.CourseDto;
import dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import net.bytebuddy.build.Plugin.Engine.Summary;
import service.UserService;

@RestController
@RequestMapping("api/controller")
@Tag(name = "User API")

public class UserController {

private final UserService UserService;
	
	public UserController(UserService userService) {
		this.UserService = userService;
	}
	//Végpont létrehozása, ami létrehozza az összes kurzust
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "List all users", security = {@SecurityRequirement(name = "token")})
	public List<UserDto> getAllUsers() {
		return UserService.listAllUsers();
	}
	
	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary = "Get a user by id", security = {@SecurityRequirement(name = "token")})
	//? 
	public User getUserById(@PathVariable final Integer id) {
		return UserService.getUserById(id);
	}
}
