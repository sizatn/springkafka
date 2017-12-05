package com.sizatn.springkafka.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class KafkaConsumerServer implements MessageListener<String, String> {
	
	@Override
	public void onMessage(ConsumerRecord<String, String> record) {
		System.out.println(record.value());
	}

}
