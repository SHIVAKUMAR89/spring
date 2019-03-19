package com.beans;

import java.util.Date;

public class BookIssuedInfo {
	
	private long code;
	private long userId;
	private boolean reserveStatus;
	private Date issueDate;
	private Date returnDate;
	
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	
	public java.sql.Date getIssueDatee() {
	    return new java.sql.Date(this.issueDate.getTime());
	}
	
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public java.sql.Date getReturnDatee() {
	    return new java.sql.Date(this.returnDate.getTime());
	}
	
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public boolean getReserveStatus() {
		return reserveStatus;
	}
	public void setReserveStatus(boolean reserveStatus) {
		this.reserveStatus = reserveStatus;
	}
	
}
