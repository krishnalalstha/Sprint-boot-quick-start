package com.sprintboot.quickstart.service;

import com.sprintboot.quickstart.model.Topic;
import com.sprintboot.quickstart.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna on 8/8/17.
 */
@Service
public class TopicService {
    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        for (Topic topic : topicRepository.findAll()) {
            topics.add(topic);
        }
        return topics;
    }

    public Topic getTopicById(String id) {
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
       topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
       topicRepository.delete(id);
    }
}
