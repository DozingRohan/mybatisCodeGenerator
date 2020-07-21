
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 21:14:08
 * @Version: 1.0
 */
public class TblsendmaillogPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "TBLSENDMAILLOG";
	//column alias
	public static final String ALIAS_PACKAGENO = "PACKAGENO";
	public static final String ALIAS_NAME = "NAME";
	public static final String ALIAS_FILENAME = "FILENAME";
	public static final String ALIAS_RECEIVERIP = "RECEIVERIP";
	public static final String ALIAS_DB_TIMESTAMP = "DB_TIMESTAMP";
	public static final String ALIAS_SENDSTS = "SENDSTS";
	public static final String ALIAS_RETRYCOUNT = "RETRYCOUNT";
	public static final String ALIAS_FAILURECODE = "FAILURECODE";
	public static final String ALIAS_SENDERADDR = "SENDERADDR";
	public static final String ALIAS_RECEIVERADDR = "RECEIVERADDR";
	public static final String ALIAS_RECEIVERDOMAIN = "RECEIVERDOMAIN";
	public static final String ALIAS_FIRSTSENDTIME = "FIRSTSENDTIME";
	public static final String ALIAS_FINISHTIME = "FINISHTIME";
	public static final String ALIAS_SUBJECT = "SUBJECT";
	public static final String ALIAS_CREATOR = "CREATOR";

	/**
	 * PACKAGENO
	 */
	private java.lang.String packageno;
	/**
	 * NAME
	 */
	private java.lang.String name;
	/**
	 * FILENAME
	 */
	private java.lang.String filename;
	/**
	 * RECEIVERIP
	 */
	private java.lang.String receiverip;
	/**
	 * DB_TIMESTAMP
	 */
	private java.util.Date dbTimestamp;
	private java.util.Date greaterThandbTimestamp;

	private java.util.Date lessThandbTimestamp;

	/**
	 * SENDSTS
	 */
	private java.lang.String sendsts;
	/**
	 * RETRYCOUNT
	 */
	private java.math.BigDecimal retrycount;
	private java.math.BigDecimal greaterThanretrycount;

	private java.math.BigDecimal lessThanretrycount;

	/**
	 * FAILURECODE
	 */
	private java.lang.String failurecode;
	/**
	 * SENDERADDR
	 */
	private java.lang.String senderaddr;
	/**
	 * RECEIVERADDR
	 */
	private java.lang.String receiveraddr;
	/**
	 * RECEIVERDOMAIN
	 */
	private java.lang.String receiverdomain;
	/**
	 * FIRSTSENDTIME
	 */
	private java.util.Date firstsendtime;
	private java.util.Date greaterThanfirstsendtime;

	private java.util.Date lessThanfirstsendtime;

	/**
	 * FINISHTIME
	 */
	private java.util.Date finishtime;
	private java.util.Date greaterThanfinishtime;

	private java.util.Date lessThanfinishtime;

	/**
	 * SUBJECT
	 */
	private java.lang.String subject;
	/**
	 * CREATOR
	 */
	private java.lang.String creator;

	public java.lang.String getPackageno() {
		return this.packageno;
	}

	public void setPackageno(java.lang.String value) {
		this.packageno = value;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String value) {
		this.name = value;
	}

	public java.lang.String getFilename() {
		return this.filename;
	}

	public void setFilename(java.lang.String value) {
		this.filename = value;
	}

	public java.lang.String getReceiverip() {
		return this.receiverip;
	}

	public void setReceiverip(java.lang.String value) {
		this.receiverip = value;
	}

	public java.util.Date getDbTimestamp() {
		return this.dbTimestamp;
	}

	public void setDbTimestamp(java.util.Date value) {
		this.dbTimestamp = value;
	}

	public java.util.Date getGreaterThanDbTimestamp() {
		return this.dbTimestamp;
	}

	public java.util.Date getLessThanDbTimestamp() {
		return this.dbTimestamp;
	}

	public void setGreaterThanDbTimestamp(java.util.Date value) {
		this.dbTimestamp = value;
	}

	public void setLessThanDbTimestamp(java.util.Date value) {
		this.dbTimestamp = value;
	}

	public java.lang.String getSendsts() {
		return this.sendsts;
	}

	public void setSendsts(java.lang.String value) {
		this.sendsts = value;
	}

	public java.math.BigDecimal getRetrycount() {
		return this.retrycount;
	}

	public void setRetrycount(java.math.BigDecimal value) {
		this.retrycount = value;
	}

	public java.math.BigDecimal getGreaterThanRetrycount() {
		return this.retrycount;
	}

	public java.math.BigDecimal getLessThanRetrycount() {
		return this.retrycount;
	}

	public void setGreaterThanRetrycount(java.math.BigDecimal value) {
		this.retrycount = value;
	}

	public void setLessThanRetrycount(java.math.BigDecimal value) {
		this.retrycount = value;
	}

	public java.lang.String getFailurecode() {
		return this.failurecode;
	}

	public void setFailurecode(java.lang.String value) {
		this.failurecode = value;
	}

	public java.lang.String getSenderaddr() {
		return this.senderaddr;
	}

	public void setSenderaddr(java.lang.String value) {
		this.senderaddr = value;
	}

	public java.lang.String getReceiveraddr() {
		return this.receiveraddr;
	}

	public void setReceiveraddr(java.lang.String value) {
		this.receiveraddr = value;
	}

	public java.lang.String getReceiverdomain() {
		return this.receiverdomain;
	}

	public void setReceiverdomain(java.lang.String value) {
		this.receiverdomain = value;
	}

	public java.util.Date getFirstsendtime() {
		return this.firstsendtime;
	}

	public void setFirstsendtime(java.util.Date value) {
		this.firstsendtime = value;
	}

	public java.util.Date getGreaterThanFirstsendtime() {
		return this.firstsendtime;
	}

	public java.util.Date getLessThanFirstsendtime() {
		return this.firstsendtime;
	}

	public void setGreaterThanFirstsendtime(java.util.Date value) {
		this.firstsendtime = value;
	}

	public void setLessThanFirstsendtime(java.util.Date value) {
		this.firstsendtime = value;
	}

	public java.util.Date getFinishtime() {
		return this.finishtime;
	}

	public void setFinishtime(java.util.Date value) {
		this.finishtime = value;
	}

	public java.util.Date getGreaterThanFinishtime() {
		return this.finishtime;
	}

	public java.util.Date getLessThanFinishtime() {
		return this.finishtime;
	}

	public void setGreaterThanFinishtime(java.util.Date value) {
		this.finishtime = value;
	}

	public void setLessThanFinishtime(java.util.Date value) {
		this.finishtime = value;
	}

	public java.lang.String getSubject() {
		return this.subject;
	}

	public void setSubject(java.lang.String value) {
		this.subject = value;
	}

	public java.lang.String getCreator() {
		return this.creator;
	}

	public void setCreator(java.lang.String value) {
		this.creator = value;
	}

}

