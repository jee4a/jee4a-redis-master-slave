package com.jee4a.redis.master.slave;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jee4a.redis.master.slave.common.model.OrderModel;
import com.jee4a.redis.master.slave.common.utils.JsonUtils;
import com.jee4a.redis.master.slave.manager.OrderManger;

/**
 * <p></p> 
 * @author tpeng 2018年1月3日
 * @email 398222836@qq.com
 */
@Component
public class OrderTest extends BaseJunitTest {

	private static Logger logger = LoggerFactory.getLogger(OrderTest.class) ;
	
	@Resource
	private OrderManger orderManger ;
	
	@Test
	public void test0() {
		OrderModel order =new OrderModel();
		order.setId(1);
		order.setAmount(new BigDecimal(298));
		order.setCreateTime(new Date());
		order.setCreator(1);
		order.setOrderNo("10030282");
		order.setStatus((byte)1);
		order.setPayState((byte)0);
		orderManger.createOrder(order);
		logger.error("order:{}", JsonUtils.toJson(order));
	}
	
	
	@Test
	public void test1() {
		OrderModel order = orderManger.queryByOrderId(1) ;
		logger.error("query order:{}", JsonUtils.toJson(order));
	}
}
