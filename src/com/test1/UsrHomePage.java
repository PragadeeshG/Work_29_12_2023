package com.test1;

public class UsrHomePage {
	private long id;
	private String loginId;
	private String homePageName;
	private String homePageUrl;
	private boolean newUser;
	private String userInExt;
	private String userAudit;
	private long auditId;
	private String pageType;
	private long errorCode;
	private String creationDate;
	private String description;
	private String lastUpdated;

	public UsrHomePage() {

	}

	public UsrHomePage(long id, String loginId, String homePageName, String homePageUrl, boolean newUser,
			String userInExt, String userAudit, long auditId, String pageType, long errorCode, String creationDate,
			String description, String lastUpdated) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.homePageName = homePageName;
		this.homePageUrl = homePageUrl;
		this.newUser = newUser;
		this.userInExt = userInExt;
		this.userAudit = userAudit;
		this.auditId = auditId;
		this.pageType = pageType;
		this.errorCode = errorCode;
		this.creationDate = creationDate;
		this.description = description;
		this.lastUpdated = lastUpdated;
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

	public String getHomePageName() {
		return homePageName;
	}

	public void setHomePageName(String homePageName) {
		this.homePageName = homePageName;
	}

	public String getHomePageUrl() {
		return homePageUrl;
	}

	public void setHomePageUrl(String homePageUrl) {
		this.homePageUrl = homePageUrl;
	}

	public boolean isNewUser() {
		return newUser;
	}

	public void setNewUser(boolean newUser) {
		this.newUser = newUser;
	}

	public String getUserInExt() {
		return userInExt;
	}

	public void setUserInExt(String userInExt) {
		this.userInExt = userInExt;
	}

	public String getUserAudit() {
		return userAudit;
	}

	public void setUserAudit(String userAudit) {
		this.userAudit = userAudit;
	}

	public long getAuditId() {
		return auditId;
	}

	public void setAuditId(long auditId) {
		this.auditId = auditId;
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
