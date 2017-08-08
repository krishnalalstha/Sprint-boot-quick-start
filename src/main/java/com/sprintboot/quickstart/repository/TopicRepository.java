package com.sprintboot.quickstart.repository;

import com.sprintboot.quickstart.model.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by krishna on 8/8/17.
 */
public interface TopicRepository extends CrudRepository<Topic,String> {

}
