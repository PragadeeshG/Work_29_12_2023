package com.test1;

public class UsrSecurityAudit {
	private long id;
	private String loginId;
	private Integer remoteAddress;
	private String operation;
	private String securityAccess;
	private boolean auditAvail;
	private String auditProcess;
	private String auditResult;
	private String creationDate;
	private String timeOfAudit;
	private String maxDurationFunction;

	public UsrSecurityAudit() {

	}

	public UsrSecurityAudit(long id, String loginId, Integer remoteAddress, String operation, String securityAccess,
			boolean auditAvail, String auditProcess, String auditResult, String creationDate, String timeOfAudit,
			String maxDurationFunction) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.remoteAddress = remoteAddress;
		this.operation = operation;
		this.securityAccess = securityAccess;
		this.auditAvail = auditAvail;
		this.auditProcess = auditProcess;
		this.auditResult = auditResult;
		this.creationDate = creationDate;
		this.timeOfAudit = timeOfAudit;
		this.maxDurationFunction = maxDurationFunction;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public Integer getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(Integer remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getSecurityAccess() {
		return securityAccess;
	}

	public void setSecurityAccess(String securityAccess) {
		this.securityAccess = securityAccess;
	}

	public boolean isAuditAvail() {
		return auditAvail;
	}

	public void setAuditAvail(boolean auditAvail) {
		this.auditAvail = auditAvail;
	}

	public String getAuditProcess() {
		return auditProcess;
	}

	public void setAuditProcess(String auditProcess) {
		this.auditProcess = auditProcess;
	}

	public String getAuditResult() {
		return auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getTimeOfAudit() {
		return timeOfAudit;
	}

	public void setTimeOfAudit(String timeOfAudit) {
		this.timeOfAudit = timeOfAudit;
	}

	public String getMaxDurationFunction() {
		return maxDurationFunction;
	}

	public void setMaxDurationFunction(String maxDurationFunction) {
		this.maxDurationFunction = maxDurationFunction;
	}

}
