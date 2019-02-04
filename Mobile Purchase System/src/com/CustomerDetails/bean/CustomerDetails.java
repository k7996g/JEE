package com.CustomerDetails.bean;

import java.time.LocalDateTime;

public class CustomerDetails {
	private String cusName;
	private String cusMailId;
	private String cusPhoneNo;
	private int purchaseId;
	private LocalDateTime purchaseDate;
	private int cusMobileId;

	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetails(String cusName, String cusMailId, String cusPhoneNo, int purchaseId, LocalDateTime purchaseDate,
			int cusMobileId) {
		super();
		this.cusName = cusName;
		this.cusMailId = cusMailId;
		this.cusPhoneNo = cusPhoneNo;
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
		this.cusMobileId = cusMobileId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusMailId() {
		return cusMailId;
	}

	public void setCusMailId(String cusMailId) {
		this.cusMailId = cusMailId;
	}

	public String getCusPhoneNo() {
		return cusPhoneNo;
	}

	public void setCusPhoneNo(String cusPhoneNo) {
		this.cusPhoneNo = cusPhoneNo;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getCusMobileId() {
		return cusMobileId;
	}

	public void setCusMobileId(int cusMobileId) {
		this.cusMobileId = cusMobileId;
	}

}
