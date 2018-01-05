package com.jee4a.redis.master.slave.common.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p></p> 
 * @author tpeng 2018年1月4日
 * @email 398222836@qq.com
 */
public class OrderModel {

	private Integer id ;
	private String orderNo ;
	private BigDecimal amount ;
	private Byte status ;
	private Byte payState ;
	private Date createTime ;
	private Integer  creator ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Byte getPayState() {
		return payState;
	}
	public void setPayState(Byte payState) {
		this.payState = payState;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	 
	public Integer getCreator() {
		return creator;
	}
	public void setCreator(Integer creator) {
		this.creator = creator;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + ((payState == null) ? 0 : payState.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderModel other = (OrderModel) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (payState == null) {
			if (other.payState != null)
				return false;
		} else if (!payState.equals(other.payState))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", orderNo=" + orderNo + ", amount=" + amount + ", status=" + status
				+ ", payState=" + payState + ", createTime=" + createTime + ", creator=" + creator + "]";
	}
	
	
}

