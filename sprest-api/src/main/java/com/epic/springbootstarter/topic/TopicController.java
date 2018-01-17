package com.epic.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
		@Autowired //establish the dependency
		private TopicService topicService;
		
		@RequestMapping("/topics")
		// Converted to JSON auto because of REST@
		public List<Topic> getAllTopics() {
			return topicService.getAllTopics();
		}
		
		@RequestMapping("/topics/{id}")
		// PathVariable - its a variable in the URL
		public Topic getTopic(@PathVariable String id) {
			return topicService.getTopic(id);
		}
		
		@RequestMapping(value = "/topics", method = RequestMethod.POST)
		// Check other parameters for request mapping
		// Map request body to Topic object
		public void addTopic(@RequestBody Topic topic) {
			topicService.addTopic(topic);
		}
		
		@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
		public void updateTopic (@RequestBody Topic topic, @PathVariable String id) {
			topicService.updateTopic(id, topic);
		}
		
		@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
		public void deleteTopic (String id) {
			topicService.deleteTopic(id);
		}
		
		
		
		
		
}
