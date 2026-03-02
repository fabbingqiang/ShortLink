package com.itheima.shortlink.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
@ConditionalOnClass(StringRedisTemplate.class)
@ConditionalOnProperty(name = "spring.data.redis.host", matchIfMissing = false)
public class RedisConfig {
}
