package com.onlineorder.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Payment {
	@Id
	@Column(name="paymentid")
private Integer paymentId;
	@Column(name="paymentmode")
private String paymentMode;
	@Column(name="amount")
private Double amount;
	
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(Integer paymentId, String paymentMode, Double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.amount = amount;
		//this.paymentStatus=paymentStatus;
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentMode=" + paymentMode + ", amount=" + amount
				+  "]";
	}
	
	
}
