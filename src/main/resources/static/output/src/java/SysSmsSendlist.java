
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 21:19:07
 * @Version: 1.0
 */
public class SysSmsSendlistPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SYS_SMS_SENDLIST";
	//column alias
	public static final String ALIAS_SEND_ID = "SEND_ID";
	public static final String ALIAS_STATUS = "STATUS";
	public static final String ALIAS_SMS_TO = "SMS_TO";
	public static final String ALIAS_SMS_CONTENT = "SMS_CONTENT";
	public static final String ALIAS_SEND_STATUS = "SEND_STATUS";
	public static final String ALIAS_SEND_STATUSDESC = "SEND_STATUSDESC";
	public static final String ALIAS_SEND_CREATOR = "SEND_CREATOR";
	public static final String ALIAS_SEND_CREATORNAME = "SEND_CREATORNAME";
	public static final String ALIAS_SEND_AUDITOR = "SEND_AUDITOR";
	public static final String ALIAS_SEND_AUDITORNAME = "SEND_AUDITORNAME";
	public static final String ALIAS_CREAT_TIME = "CREAT_TIME";
	public static final String ALIAS_AUDIT_TIME = "AUDIT_TIME";

	/**
	 * SEND_ID
	 */
	private java.lang.String sendId;
	/**
	 * STATUS
	 */
	private java.lang.String status;
	/**
	 * SMS_TO
	 */
	private java.lang.String smsTo;
	/**
	 * SMS_CONTENT
	 */
	private java.lang.String smsContent;
	/**
	 * SEND_STATUS
	 */
	private java.lang.String sendStatus;
	/**
	 * SEND_STATUSDESC
	 */
	private java.lang.String sendStatusdesc;
	/**
	 * SEND_CREATOR
	 */
	private java.lang.String sendCreator;
	/**
	 * SEND_CREATORNAME
	 */
	private java.lang.String sendCreatorname;
	/**
	 * SEND_AUDITOR
	 */
	private java.lang.String sendAuditor;
	/**
	 * SEND_AUDITORNAME
	 */
	private java.lang.String sendAuditorname;
	/**
	 * CREAT_TIME
	 */
	private java.util.Date creatTime;

	private java.util.Date greaterThancreatTime;

	private java.util.Date lessThancreatTime;

	/**
	 * AUDIT_TIME
	 */
	private java.util.Date auditTime;

	private java.util.Date greaterThanauditTime;

	private java.util.Date lessThanauditTime;


	public java.lang.String getSendId() {
		return this.sendId;
	}

	public void setSendId(java.lang.String value) {
		this.sendId = value;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String value) {
		this.status = value;
	}

	public java.lang.String getSmsTo() {
		return this.smsTo;
	}

	public void setSmsTo(java.lang.String value) {
		this.smsTo = value;
	}

	public java.lang.String getSmsContent() {
		return this.smsContent;
	}

	public void setSmsContent(java.lang.String value) {
		this.smsContent = value;
	}

	public java.lang.String getSendStatus() {
		return this.sendStatus;
	}

	public void setSendStatus(java.lang.String value) {
		this.sendStatus = value;
	}

	public java.lang.String getSendStatusdesc() {
		return this.sendStatusdesc;
	}

	public void setSendStatusdesc(java.lang.String value) {
		this.sendStatusdesc = value;
	}

	public java.lang.String getSendCreator() {
		return this.sendCreator;
	}

	public void setSendCreator(java.lang.String value) {
		this.sendCreator = value;
	}

	public java.lang.String getSendCreatorname() {
		return this.sendCreatorname;
	}

	public void setSendCreatorname(java.lang.String value) {
		this.sendCreatorname = value;
	}

	public java.lang.String getSendAuditor() {
		return this.sendAuditor;
	}

	public void setSendAuditor(java.lang.String value) {
		this.sendAuditor = value;
	}

	public java.lang.String getSendAuditorname() {
		return this.sendAuditorname;
	}

	public void setSendAuditorname(java.lang.String value) {
		this.sendAuditorname = value;
	}

	public java.util.Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(java.util.Date value) {
		this.creatTime = value;
	}


	public java.util.Date getGreaterThanCreatTime() {
		return this.creatTime;
	}

	public java.util.Date getLessThanCreatTime() {
		return this.creatTime;
	}

	public void setGreaterThanCreatTime(java.util.Date value) {
		this.creatTime = value;
	}

	public void setLessThanCreatTime(java.util.Date value) {
		this.creatTime = value;
	}

	public java.util.Date getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(java.util.Date value) {
		this.auditTime = value;
	}


	public java.util.Date getGreaterThanAuditTime() {
		return this.auditTime;
	}

	public java.util.Date getLessThanAuditTime() {
		return this.auditTime;
	}

	public void setGreaterThanAuditTime(java.util.Date value) {
		this.auditTime = value;
	}

	public void setLessThanAuditTime(java.util.Date value) {
		this.auditTime = value;
	}

}

