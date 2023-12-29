package com.test1;

public class UsrToTableMap {
	private long empCpde;
	private String empId;
	private String tableId;
	private Integer seqId;
	private String groupType;
	private String groupId;
	private String ncType;
	private String errSvrty;
	private String creationDate;
	private String modifiedDate;

	public UsrToTableMap() {

	}

	public UsrToTableMap(long empCpde, String empId, String tableId, Integer seqId, String groupType, String groupId,
			String ncType, String errSvrty, String creationDate, String modifiedDate) {
		super();
		this.empCpde = empCpde;
		this.empId = empId;
		this.tableId = tableId;
		this.seqId = seqId;
		this.groupType = groupType;
		this.groupId = groupId;
		this.ncType = ncType;
		this.errSvrty = errSvrty;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public long getEmpCpde() {
		return empCpde;
	}

	public void setEmpCpde(long empCpde) {
		this.empCpde = empCpde;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public Integer getSeqId() {
		return seqId;
	}

	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getNcType() {
		return ncType;
	}

	public void setNcType(String ncType) {
		this.ncType = ncType;
	}

	public String getErrSvrty() {
		return errSvrty;
	}

	public void setErrSvrty(String errSvrty) {
		this.errSvrty = errSvrty;
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

}
