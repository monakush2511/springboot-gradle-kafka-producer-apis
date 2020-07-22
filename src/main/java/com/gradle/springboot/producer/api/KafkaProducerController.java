package com.gradle.springboot.producer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {
	
	private static final String TOPIC="kafkatopic1";
	User user=null;
	
	@Autowired
	private KafkaTemplate<String,Object> template;

	
   @RequestMapping(method=RequestMethod.GET,value="/publish/{name}")
   public String getMessage(@PathVariable("name") final String name) {
	  template.send(TOPIC, "Hi"+" "+name); 
	  return "Data Published Successfully"; }
	 
	
	@RequestMapping(method=RequestMethod.GET,value="/jsonpublish")
	public String getJsonMessage() {
		user=new User(1,"Monalisa",new String[] {"Bangalore", "BTM"});
		template.send(TOPIC,user);
	    return "Json Data Published Successfully";
	}
}
