package com.jee4a.redis.master.slave.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jee4a.redis.master.slave.common.io.cache.redis.RedisUtils;
import com.jee4a.redis.master.slave.common.model.CacheKeys;
import com.jee4a.redis.master.slave.common.model.UserModel;

/**
 * <p></p> 
 * @author tpeng 2018年1月3日
 * @email 398222836@qq.com
 */
@Component
public class UserManger {

	@Resource
	private  RedisUtils redisUtils ;
	 
	public void addUser(UserModel user) {
		String key = CacheKeys.USER_MODEL.getKeyPrefix(user.getId()) ;
		redisUtils.setex(key, CacheKeys.USER_MODEL.getExpire(), user);
	}
}
