package com.epic.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Becomes a REST controller class (HTTP responses)
@RestController
public class HelloController {
	
		// Mapping
		@RequestMapping("/hello")
		public String sayHi() {
			return "Hi";
		}
}
