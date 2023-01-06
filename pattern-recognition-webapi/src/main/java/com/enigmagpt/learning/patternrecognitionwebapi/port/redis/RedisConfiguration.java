package com.enigmagpt.learning.patternrecognitionwebapi.port.redis;

import com.enigmagpt.learning.patternrecognitionwebapi.domain.Result;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
public class RedisConfiguration {

    @Bean
    public RedisTemplate<String, Result> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Result> template = new RedisTemplate<>();
        template.setValueSerializer(new Jackson2JsonRedisSerializer<>(Result.class));
        template.setConnectionFactory(connectionFactory);
        return template;
    }
}
