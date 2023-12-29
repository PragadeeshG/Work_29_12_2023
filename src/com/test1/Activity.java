package com.test1;

public class Activity {
	private String name;
	private String activityType;
	private String activityUri;
	private String crId;
	private String creationCrId;
	private Integer modifiedCrId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Activity() {

	}

	public Activity(String name, String activityType, String activityUri, String crId, String creationCrId,
			Integer modifiedCrId, String creationDate, String modifiedDate, String entityState) {
		super();
		this.name = name;
		this.activityType = activityType;
		this.activityUri = activityUri;
		this.crId = crId;
		this.creationCrId = creationCrId;
		this.modifiedCrId = modifiedCrId;
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

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getActivityUri() {
		return activityUri;
	}

	public void setActivityUri(String activityUri) {
		this.activityUri = activityUri;
	}

	public String getCrId() {
		return crId;
	}

	public void setCrId(String crId) {
		this.crId = crId;
	}

	public String getCreationCrId() {
		return creationCrId;
	}

	public void setCreationCrId(String creationCrId) {
		this.creationCrId = creationCrId;
	}

	public Integer getModifiedCrId() {
		return modifiedCrId;
	}

	public void setModifiedCrId(Integer modifiedCrId) {
		this.modifiedCrId = modifiedCrId;
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
