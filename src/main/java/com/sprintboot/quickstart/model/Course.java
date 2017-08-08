package com.sprintboot.quickstart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by krishna on 8/8/17.
 */
@Entity
public class Course {
    @Id
    String id;
    String name;
    String description;
    @ManyToOne
    Topic topic;

    public Course() {

    }

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Course) obj).getId().equals(id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
