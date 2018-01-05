package com.jee4a.redis.master.slave.common.model;

import java.util.Date;

/**
 * <p></p> 
 * @author tpeng 2018年1月3日
 * @email 398222836@qq.com
 */
public class UserModel {

	private Integer id ;
	private String userName ;
	private String phone ;
	private String nick ;
	private Date lastLoginTime ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	
}
