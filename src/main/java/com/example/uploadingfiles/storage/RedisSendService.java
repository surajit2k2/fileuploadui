package com.example.uploadingfiles.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisSendService {

	@Autowired
	StringRedisTemplate template ;
	private static final Logger LOGGER = LoggerFactory.getLogger(RedisSendService.class);
	
	public void sendToRedis(String fileType){
		
		LOGGER.info("Sending message...");
		template.convertAndSend("chat", "File Uploaded :: " + fileType);
		}
}
