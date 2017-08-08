package com.sprintboot.quickstart.service;

import com.sprintboot.quickstart.model.Topic;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by krishna on 8/8/17.
 */
@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("1", "Spring Framework", "Spring framework desc"),
            new Topic("2", "Core Java", "Core java Description")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(String id) {
        for (Topic topic : topics) {
            if (topic.getId().equals(id)) {
                return topic;
            }
        }
        return null;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        int pos = -1;
        for (int i = 0; i < topics.size(); i++) {

            if (topics.get(i).getId().equals(id)) {
                pos = i;

            }

        }
        if (pos != -1)
            topics.remove(pos);
    }
}
