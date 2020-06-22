package com.jsrdxzw.redis.lock.configuration;

import com.jsrdxzw.redis.lock.DefaultRedisLockFactory;
import com.jsrdxzw.redis.lock.RedisLockFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author xuzhiwei
 * @date 2020/05/31
 */
@Configuration
public class DistributedLockAutoConfiguration {
    @Bean
    public RedisLockFactory redisLockFactory(StringRedisTemplate stringRedisTemplate) {
        return new DefaultRedisLockFactory(stringRedisTemplate);
    }
}