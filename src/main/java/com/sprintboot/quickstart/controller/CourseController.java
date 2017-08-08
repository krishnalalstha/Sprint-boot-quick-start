package com.sprintboot.quickstart.controller;

import com.sprintboot.quickstart.model.Course;
import com.sprintboot.quickstart.model.Topic;
import com.sprintboot.quickstart.service.CourseService;
import com.sprintboot.quickstart.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by krishna on 8/8/17.
 */
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable String topicId, @PathVariable String courseId) {
        return courseService.getCourseById(courseId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourses(@PathVariable String topicId,@RequestBody Course course, @PathVariable String id) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{topicId}/courses/{id}")
    public void deleteCourses(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
