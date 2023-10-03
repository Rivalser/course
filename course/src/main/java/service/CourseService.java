//Üzleti logikát idézi elő
package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dto.CourseDto;
import entity.CourseEntity;
import repository.CourseRepository;

@Service

public class CourseService {

	private final CourseRepository courseRepository;
	
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	public List<CourseDto> getAllCourse() {
		
		List<CourseEntity> courses = courseRepository.findAll();
		List<CourseDto> courseDtos = new ArrayList<>();
		
		
		for(CourseEntity course : courses) {
			CourseDto courseDto = new CourseDto();
			
			courseDto.setId(course.getId());
			courseDto.setName(course.getName());
			courseDtos.add(courseDto);
		}
		
		return courseDtos;
		
	}
	
}
