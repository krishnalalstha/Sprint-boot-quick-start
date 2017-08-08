package com.sprintboot.quickstart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by krishna on 8/8/17.
 */
@Entity
public class Topic {
    @Id
    String id;
    String name;
    String description;

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
        return ((Topic) obj).getId().equals(id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
