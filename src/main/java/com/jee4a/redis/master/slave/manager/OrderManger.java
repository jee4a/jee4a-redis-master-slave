package com.jee4a.redis.master.slave.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jee4a.redis.master.slave.common.io.cache.redis.RedisUtils;
import com.jee4a.redis.master.slave.common.model.CacheKeys;
import com.jee4a.redis.master.slave.common.model.OrderModel;

/**
 * <p>订单管理类</p> 
 * @author tpeng 2018年1月4日
 * @email 398222836@qq.com
 */
@Component
public class OrderManger {
	@Resource
	private  RedisUtils redisUtils ;
	
	public void createOrder(OrderModel order) {
		String key = CacheKeys.ORDER_MODEL.getKeyPrefix(order.getId()) ;
		redisUtils.setex(key, CacheKeys.ORDER_MODEL.getExpire(), order);
	}
	
	public OrderModel queryByOrderId (Integer orderId) {
		String key = CacheKeys.ORDER_MODEL.getKeyPrefix(orderId) ;
		return redisUtils.get(key, OrderModel.class) ;
	}
}
