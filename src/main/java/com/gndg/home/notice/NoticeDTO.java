package com.gndg.home.notice;

import java.sql.Date;

public class NoticeDTO {
	private Long nt_num;
	private String user_id;
	private String nt_title;
	private String nt_contents;
	private Date nt_date;
	private String nt_yn;
	private Long code;
	public Long getNt_num() {
		return nt_num;
	}
	public void setNt_num(Long nt_num) {
		this.nt_num = nt_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getNt_title() {
		return nt_title;
	}
	public void setNt_title(String nt_title) {
		this.nt_title = nt_title;
	}
	public String getNt_contents() {
		return nt_contents;
	}
	public void setNt_contents(String nt_contents) {
		this.nt_contents = nt_contents;
	}
	public Date getNt_date() {
		return nt_date;
	}
	public void setNt_date(Date nt_date) {
		this.nt_date = nt_date;
	}
	public String getNt_yn() {
		return nt_yn;
	}
	public void setNt_yn(String nt_yn) {
		this.nt_yn = nt_yn;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	
	
	
	
	
	
	
	
	

}
