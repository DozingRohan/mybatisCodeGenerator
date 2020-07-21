
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 21:19:07
 * @Version: 1.0
 */
public class SysMailSendlistPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SYS_MAIL_SENDLIST";
	//column alias
	public static final String ALIAS_SEND_ID = "SEND_ID";
	public static final String ALIAS_STATUS = "STATUS";
	public static final String ALIAS_MAIL_FROM = "MAIL_FROM";
	public static final String ALIAS_MAIL_TO = "目标邮件地址";
	public static final String ALIAS_MAIL_CC = "MAIL_CC";
	public static final String ALIAS_MAIL_BCC = "MAIL_BCC";
	public static final String ALIAS_MAIL_SUBJECT = "MAIL_SUBJECT";
	public static final String ALIAS_MAIL_CONTENT = "MAIL_CONTENT";
	public static final String ALIAS_MAIL_ATT = "MAIL_ATT";
	public static final String ALIAS_SEND_STATUS = "SEND_STATUS";
	public static final String ALIAS_SEND_STATUSDESC = "SEND_STATUSDESC";
	public static final String ALIAS_SEND_CREATOR = "SEND_CREATOR";
	public static final String ALIAS_SEND_CREATORNAME = "SEND_CREATORNAME";
	public static final String ALIAS_SEND_AUDITOR = "SEND_AUDITOR";
	public static final String ALIAS_SEND_AUDITORNAME = "SEND_AUDITORNAME";
	public static final String ALIAS_CREAT_TIME = "CREAT_TIME";
	public static final String ALIAS_AUDIT_TIME = "AUDIT_TIME";
	public static final String ALIAS_TPLT_NAME = "TPLT_NAME";

	/**
	 * SEND_ID
	 */
	private java.lang.String sendId;
	/**
	 * STATUS
	 */
	private java.lang.String status;
	/**
	 * MAIL_FROM
	 */
	private java.lang.String mailFrom;
	/**
	 * 目标邮件地址
	 */
	private java.lang.String mailTo;
	/**
	 * MAIL_CC
	 */
	private java.lang.String mailCc;
	/**
	 * MAIL_BCC
	 */
	private java.lang.String mailBcc;
	/**
	 * MAIL_SUBJECT
	 */
	private java.lang.String mailSubject;
	/**
	 * MAIL_CONTENT
	 */
	private java.lang.String mailContent;
	/**
	 * MAIL_ATT
	 */
	private java.lang.String mailAtt;
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

	/**
	 * TPLT_NAME
	 */
	private java.lang.String tpltName;

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

	public java.lang.String getMailFrom() {
		return this.mailFrom;
	}

	public void setMailFrom(java.lang.String value) {
		this.mailFrom = value;
	}

	public java.lang.String getMailTo() {
		return this.mailTo;
	}

	public void setMailTo(java.lang.String value) {
		this.mailTo = value;
	}

	public java.lang.String getMailCc() {
		return this.mailCc;
	}

	public void setMailCc(java.lang.String value) {
		this.mailCc = value;
	}

	public java.lang.String getMailBcc() {
		return this.mailBcc;
	}

	public void setMailBcc(java.lang.String value) {
		this.mailBcc = value;
	}

	public java.lang.String getMailSubject() {
		return this.mailSubject;
	}

	public void setMailSubject(java.lang.String value) {
		this.mailSubject = value;
	}

	public java.lang.String getMailContent() {
		return this.mailContent;
	}

	public void setMailContent(java.lang.String value) {
		this.mailContent = value;
	}

	public java.lang.String getMailAtt() {
		return this.mailAtt;
	}

	public void setMailAtt(java.lang.String value) {
		this.mailAtt = value;
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

	public java.lang.String getTpltName() {
		return this.tpltName;
	}

	public void setTpltName(java.lang.String value) {
		this.tpltName = value;
	}

}

