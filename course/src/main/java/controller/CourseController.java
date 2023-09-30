package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.CourseDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import service.CourseService;

@RestController
@RequestMapping("/api/courses")
@Tag(name = "Course API")

public class CourseController {
	
	private final CourseService courseService;
	
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@GetMapping
	//Végpont létrehozása, ami létrehozza az összes kurzust
	public List<CourseDto> getAllCourse() {
		return courseService.getAllCourse();		
	}
	
	@GetMapping(name = "/pelda")
	public String pelda() {
		return "Sziasztok";
	}
	
}