package com.sprintboot.quickstart.controller;

import com.sprintboot.quickstart.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by krishna on 8/8/17.
 */
@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Spring Framework", "Spring framework desc"),
                new Topic("2", "Core Java", "Core java Description")
        );
    }
}
