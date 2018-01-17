package com.epic.springbootstarter.topic;
//Services in Spring are singletons

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //I'm a service
public class TopicService {
	List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("A45","Name 1","Im the one"),
				new Topic("D77","Name 2","Im the two"),
				new Topic("DDE","Name 3","Im the three"),
				new Topic("48V","Name 4","Im the four"),
				new Topic("CN7","Name 5","Im the five")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		for (int i  = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) { 
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic (String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
