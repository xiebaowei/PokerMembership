package com.itheima.springmvc.pojo;

import java.util.Date;

public class Memberships {

	private Integer id;

    private String name;

    private Float count;

    private Date createtime;

    private String detail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getCount() {
		return count;
	}

	public void setCount(Float count) {
		this.count = count;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Memberships [id=" + id + ", name=" + name + ", count=" + count
				+ ", createtime=" + createtime + ", detail=" + detail + "]";
	}

    
    
}
