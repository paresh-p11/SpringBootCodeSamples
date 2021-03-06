package io.examples.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics() {

//        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }


    public Topic getTopic(String id) {
//        for (Topic topic : topics) {
//            if (topic.getId().equals(id))
//                return topic;
//        }
//        return null;

        return  topicRepository.findOne(id);

    }


    public void addTopic(Topic topic)
    {
//        topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
//        for (int i = 0; i < topics.size(); i++) {
//            if (topics.get(i).getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);

    }


    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(id);
    }
}
