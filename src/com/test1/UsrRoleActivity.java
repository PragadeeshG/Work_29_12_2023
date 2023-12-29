package com.test1;

public class UsrRoleActivity {
	private String name;
	private String templateName;
	private Integer templateId;
	private String activityName;
	private String roleId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UsrRoleActivity() {

	}

	public UsrRoleActivity(String name, String templateName, Integer templateId, String activityName, String roleId,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.name = name;
		this.templateName = templateName;
		this.templateId = templateId;
		this.activityName = activityName;
		this.roleId = roleId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
