package com.shanu;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerResource {

	@KafkaListener(topics = "shanu", groupId = "group_json", containerFactory = "listener")
	public void consumeJson(User user) {
		System.out.println("consumedjson" + user);
	}
}
