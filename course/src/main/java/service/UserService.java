package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import controller.User;
import dto.CourseDto;
import dto.UserDto;
import entity.UserEntity;
import repository.UserRepository;

@Service

public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<UserDto> getAllUser() {
		
		List<UserEntity> users = userRepository.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		
		
		for(UserEntity user : users) {
			UserDto userDto = new UserDto();
			
			userDto.setId(user.getId());
			userDto.setName(user.getName());
			userDtos.add(userDto);
		}
		
		return userDtos;
		
	}

	public List<UserDto> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
