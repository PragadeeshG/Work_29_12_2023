package com.test1;

public class ApplicationAccess {
	private long reqId;
	private String loginName;
	private String aplicationName;
	private String accessUrl;
	private String accessTime;
	private String responseStatus;
	private String responseTime;
	private String reqParams;
	private String paramValues;

	public ApplicationAccess() {

	}

	public ApplicationAccess(long reqId, String loginName, String aplicationName, String accessUrl, String accessTime,
			String responseStatus, String responseTime, String reqParams, String paramValues) {
		super();
		this.reqId = reqId;
		this.loginName = loginName;
		this.aplicationName = aplicationName;
		this.accessUrl = accessUrl;
		this.accessTime = accessTime;
		this.responseStatus = responseStatus;
		this.responseTime = responseTime;
		this.reqParams = reqParams;
		this.paramValues = paramValues;
	}

	public long getReqId() {
		return reqId;
	}

	public void setReqId(long reqId) {
		this.reqId = reqId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getAplicationName() {
		return aplicationName;
	}

	public void setAplicationName(String aplicationName) {
		this.aplicationName = aplicationName;
	}

	public String getAccessUrl() {
		return accessUrl;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}

	public String getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(String accessTime) {
		this.accessTime = accessTime;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getReqParams() {
		return reqParams;
	}

	public void setReqParams(String reqParams) {
		this.reqParams = reqParams;
	}

	public String getParamValues() {
		return paramValues;
	}

	public void setParamValues(String paramValues) {
		this.paramValues = paramValues;
	}

}
