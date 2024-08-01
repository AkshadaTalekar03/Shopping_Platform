package com.in28minuts.SpringBoot.learnspringboot;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	
	@RequestMapping("/Courses")
	public List<Course> retrieveAllCourses(){
		
		return Arrays.asList(
				new Course(1,"Learn", "go"));

}
}