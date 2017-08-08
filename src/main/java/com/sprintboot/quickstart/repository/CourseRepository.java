package com.sprintboot.quickstart.repository;

import com.sprintboot.quickstart.model.Course;
import com.sprintboot.quickstart.model.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by krishna on 8/8/17.
 */
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByName(String name);

    public List<Course> findByDescription(String desc);

    public List<Course> findByTopicId(String topicId);

}
