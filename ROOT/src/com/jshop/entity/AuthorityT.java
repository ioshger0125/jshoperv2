package com.jshop.entity;

// Generated 2012-8-27 13:29:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AuthorityT generated by hbm2java
 */
public class AuthorityT implements java.io.Serializable {

	private String autid;
	private String chpagename;
	private String enpagename;
	private String operate;
	private Date createtime;
	private String roleid;

	public AuthorityT() {
	}

	public AuthorityT(String autid, String chpagename, String enpagename,
			String operate, Date createtime) {
		this.autid = autid;
		this.chpagename = chpagename;
		this.enpagename = enpagename;
		this.operate = operate;
		this.createtime = createtime;
	}

	public AuthorityT(String autid, String chpagename, String enpagename,
			String operate, Date createtime, String roleid) {
		this.autid = autid;
		this.chpagename = chpagename;
		this.enpagename = enpagename;
		this.operate = operate;
		this.createtime = createtime;
		this.roleid = roleid;
	}

	public String getAutid() {
		return this.autid;
	}

	public void setAutid(String autid) {
		this.autid = autid;
	}

	public String getChpagename() {
		return this.chpagename;
	}

	public void setChpagename(String chpagename) {
		this.chpagename = chpagename;
	}

	public String getEnpagename() {
		return this.enpagename;
	}

	public void setEnpagename(String enpagename) {
		this.enpagename = enpagename;
	}

	public String getOperate() {
		return this.operate;
	}

	public void setOperate(String operate) {
		this.operate = operate;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

}
