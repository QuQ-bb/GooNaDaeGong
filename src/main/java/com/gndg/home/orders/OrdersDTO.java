package com.gndg.home.orders;

import java.sql.Date;
import java.util.List;

import com.gndg.home.cancel.CancelDTO;
import com.gndg.home.cancel.ExchangeDTO;
import com.gndg.home.cancel.RefundDTO;
import com.gndg.home.item.ItemDTO;
import com.gndg.home.item.ItemFileDTO;
import com.gndg.home.pay.PayDTO;

public class OrdersDTO {
	
	private Long merchant_uid;
	private String user_id;
	private Long ord_payment;
	private String ord_status;
	private Date ord_date;
	private Long ord_total1;
	private Long ord_delfree;
	private Long ord_total2;
	private String ord_name;
	private String ord_post;
	private String ord_addr;
	private String ord_addr2;
	private String ord_phone;
	private String ord_memo;
	
	private List<GoodsOrdersDTO> goodsOrdersDTOs;
	private CancelDTO cancelDTO;
	private ExchangeDTO exchangeDTO;
	private RefundDTO refundDTO;
	
//	mypage join용
	private PayDTO payDTO;
    private List<ItemDTO> itemDTOs;
    private List<ItemFileDTO> itemFileDTOs;



	public CancelDTO getCancelDTO() {
		return cancelDTO;
	}
	public void setCancelDTO(CancelDTO cancelDTO) {
		this.cancelDTO = cancelDTO;
	}
	public ExchangeDTO getExchangeDTO() {
		return exchangeDTO;
	}
	public void setExchangeDTO(ExchangeDTO exchangeDTO) {
		this.exchangeDTO = exchangeDTO;
	}
	public RefundDTO getRefundDTO() {
		return refundDTO;
	}
	public void setRefundDTO(RefundDTO refundDTO) {
		this.refundDTO = refundDTO;
	}
	public List<GoodsOrdersDTO> getGoodsOrdersDTOs() {
		return goodsOrdersDTOs;
	}
	public void setGoodsOrdersDTOs(List<GoodsOrdersDTO> goodsOrdersDTOs) {
		this.goodsOrdersDTOs = goodsOrdersDTOs;
	}

	
	public Long getMerchant_uid() {
		return merchant_uid;
	}
	public void setMerchant_uid(Long merchant_uid) {
		this.merchant_uid = merchant_uid;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Long getOrd_payment() {
		return ord_payment;
	}
	public void setOrd_payment(Long ord_payment) {
		this.ord_payment = ord_payment;
	}
	public String getOrd_status() {
		return ord_status;
	}
	public void setOrd_status(String ord_status) {
		this.ord_status = ord_status;
	}
	public Date getOrd_date() {
		return ord_date;
	}
	public void setOrd_date(Date ord_date) {
		this.ord_date = ord_date;
	}
	public Long getOrd_total1() {
		return ord_total1;
	}
	public void setOrd_total1(Long ord_total1) {
		this.ord_total1 = ord_total1;
	}
	public Long getOrd_delfree() {
		return ord_delfree;
	}
	public void setOrd_delfree(Long ord_delfree) {
		this.ord_delfree = ord_delfree;
	}
	public Long getOrd_total2() {
		return ord_total2;
	}
	public void setOrd_total2(Long ord_total2) {
		this.ord_total2 = ord_total2;
	}
	public String getOrd_name() {
		return ord_name;
	}
	public void setOrd_name(String ord_name) {
		this.ord_name = ord_name;
	}
	public String getOrd_post() {
		return ord_post;
	}
	public PayDTO getPayDTO() {
        return payDTO;
    }
    public void setPayDTO(PayDTO payDTO) {
        this.payDTO = payDTO;
    }
    public List<ItemDTO> getItemDTOs() {
        return itemDTOs;
    }
    public void setItemDTOs(List<ItemDTO> itemDTOs) {
        this.itemDTOs = itemDTOs;
    }
    public List<ItemFileDTO> getItemFileDTOs() {
        return itemFileDTOs;
    }
    public void setItemFileDTOs(List<ItemFileDTO> itemFileDTOs) {
        this.itemFileDTOs = itemFileDTOs;
    }
    public void setOrd_post(String ord_post) {
		this.ord_post = ord_post;
	}
	public String getOrd_addr() {
		return ord_addr;
	}
	public void setOrd_addr(String ord_addr) {
		this.ord_addr = ord_addr;
	}
	public String getOrd_addr2() {
		return ord_addr2;
	}
	public void setOrd_addr2(String ord_addr2) {
		this.ord_addr2 = ord_addr2;
	}
	public String getOrd_phone() {
		return ord_phone;
	}
	public void setOrd_phone(String ord_phone) {
		this.ord_phone = ord_phone;
	}
	public String getOrd_memo() {
		return ord_memo;
	}
	public void setOrd_memo(String ord_memo) {
		this.ord_memo = ord_memo;
	}


	
	
	

}
