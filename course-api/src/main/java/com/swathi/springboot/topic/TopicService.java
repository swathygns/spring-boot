package com.swathi.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
   private List<Topic> topics = new ArrayList<> (Arrays.asList(
    new Topic("spring","Spring Framework","Spring Framework Description"),
    new Topic("java","Core Java","Core Java Description"),
    new Topic("javascript","javaScript","JavaScript Description")
   ));

   public List<Topic> getAllTopics() {
       return topics;
   }
 
   public Topic getTopic(String id){
       Topic ret = null;
       for(int i=0;i<topics.size();i++){
           if(topics.get(i).getId().equals(id)){
               ret = topics.get(i);
               return ret;
           }
       }
       return ret;
   }

   public void addTopic(Topic topic){
        topics.add(topic);
   }

   public void updateTopic(String id, Topic topic){
       for(int i=0; i<topics.size();i++){
           Topic t = topics.get(i);
           if(t.getId().equals(id)){
               topics.set(i, topic);
               return;
           }
       }
   }

public void deleteTopic(String id) {
    topics.removeIf(t->t.getId().equals(id));
}
}
