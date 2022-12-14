package com.gndg.home.item;

import java.sql.Date;

public class ItemReviewDTO {
	private Long rv_num;
	private Long item_num;
	private String user_id;
	private String rv_title;
	private String rv_contents;
	private Date rv_date;
	private Long rv_star;
	private String fileName;
	
	private ItemDTO itemDTO;
	
	public Long getRv_num() {
		return rv_num;
	}
	public void setRv_num(Long rv_num) {
		this.rv_num = rv_num;
	}
	public Long getItem_num() {
		return item_num;
	}
	public void setItem_num(Long item_num) {
		this.item_num = item_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRv_title() {
		return rv_title;
	}
	public void setRv_title(String rv_title) {
		this.rv_title = rv_title;
	}
	public String getRv_contents() {
		return rv_contents;
	}
	public void setRv_contents(String rv_contents) {
		this.rv_contents = rv_contents;
	}
	public Date getRv_date() {
		return rv_date;
	}
	public void setRv_date(Date rv_date) {
		this.rv_date = rv_date;
	}
	public Long getRv_star() {
		return rv_star;
	}
	public void setRv_star(Long rv_star) {
		this.rv_star = rv_star;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
    public ItemDTO getItemDTO() {
        return itemDTO;
    }
    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }
    
    public void setReviewAddFile(Long item_num) {
    	this.item_num = item_num;
    }
	
}
