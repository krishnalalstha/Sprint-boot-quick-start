package com.sprintboot.quickstart.repository;

import com.sprintboot.quickstart.model.Course;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by krishna on 8/8/17.
 */
public interface CourseRepository extends CrudRepository<Course,String> {

}
