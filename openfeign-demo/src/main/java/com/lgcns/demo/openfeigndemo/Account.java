package com.lgcns.demo.openfeigndemo;

public class Account {
	private String acntNo;
	private String cstmId;

	public String getAcntNo() {
		return acntNo;
	}

	public void setAcntNo(String acntNo) {
		this.acntNo = acntNo;
	}

	public String getCstmNm() {
		return cstmNm;
	}

	public void setCstmNm(String cstmNm) {
		this.cstmNm = cstmNm;
	}

	public String getAcntNm() {
		return acntNm;
	}

	public void setAcntNm(String acntNm) {
		this.acntNm = acntNm;
	}

	public String getNewDtm() {
		return newDtm;
	}

	public void setNewDtm(String newDtm) {
		this.newDtm = newDtm;
	}

	public Long getAcntBlnc() {
		return acntBlnc;
	}

	public void setAcntBlnc(Long acntBlnc) {
		this.acntBlnc = acntBlnc;
	}

	private String cstmNm;
	private String acntNm;
	private String newDtm;
	private Long acntBlnc;
}
