package com.example.demo.conf.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;


import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Redis tool
 *
 * @author ZhangGR
 * @created on 2018/5/12
 **/
@Service
public class RedisService {

    private static final String ENCODING = "UTF8";

    @Autowired
    private StringRedisTemplate redisTemplate;


    public boolean lpush(String key, Object value) {
        return false;
    }

    /**
     * list all values mapped to the key
     * @param key
     * @return
     * @should test
     */
    public List<String> lrange(String key) {

        return redisTemplate.execute(new RedisCallback<List<String>>() {

            @Override
            public List<String> doInRedis(RedisConnection redisConnection) throws DataAccessException {

                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                List<byte[]> bytes = redisConnection.lRange(serializer.serialize(key), 0, -1);

                List<String> collect = bytes.stream()
                        .map(s -> {
                            try {
                                return new String(s, ENCODING);
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }
                            return "";
                        }).collect(Collectors.toList());

                return collect;
            }
        });
    }

}
