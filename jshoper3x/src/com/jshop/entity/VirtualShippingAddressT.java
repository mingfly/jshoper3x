package com.jshop.entity;

// Generated 2014-6-15 1:31:55 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VirtualShippingAddressT generated by hbm2java
 */
@Entity
@Table(name = "virtual_shipping_address_t", catalog = "jshoper3")
public class VirtualShippingAddressT implements java.io.Serializable {

	private String virtualshippingaddressid;
	private String userid;
	private String username;
	private String mobile;
	private String email;
	private Date createtime;
	private String state;
	private String issend;
	private String orderid;
	private Date updatetime;
	private Date sendtime;

	public VirtualShippingAddressT() {
	}

	public VirtualShippingAddressT(String virtualshippingaddressid,
			String userid, String username, String mobile, String email,
			Date createtime, String state, String issend, String orderid,
			Date updatetime, Date sendtime) {
		this.virtualshippingaddressid = virtualshippingaddressid;
		this.userid = userid;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.createtime = createtime;
		this.state = state;
		this.issend = issend;
		this.orderid = orderid;
		this.updatetime = updatetime;
		this.sendtime = sendtime;
	}

	@Id
	@Column(name = "VIRTUALSHIPPINGADDRESSID", unique = true, nullable = false, length = 45)
	public String getVirtualshippingaddressid() {
		return this.virtualshippingaddressid;
	}

	public void setVirtualshippingaddressid(String virtualshippingaddressid) {
		this.virtualshippingaddressid = virtualshippingaddressid;
	}

	@Column(name = "USERID", nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "MOBILE", nullable = false, length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "EMAIL", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "ISSEND", nullable = false, length = 1)
	public String getIssend() {
		return this.issend;
	}

	public void setIssend(String issend) {
		this.issend = issend;
	}

	@Column(name = "ORDERID", nullable = false, length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SENDTIME", nullable = false, length = 0)
	public Date getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}

}
