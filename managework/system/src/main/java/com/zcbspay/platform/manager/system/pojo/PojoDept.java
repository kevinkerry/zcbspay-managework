package com.zcbspay.platform.manager.system.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDept entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_DEPT")
public class PojoDept implements java.io.Serializable {

	private static final long serialVersionUID = -4501697449117436974L;
	private Long deptId;
	private String deptCode;
	private String deptName;
	private Long organId;
	private String creator;
	private Timestamp crateTime;
	private String status;
	private String notes;
	private String remarks;

	public PojoDept() {
	}
	public PojoDept(String deptCode, String deptName, Long organId,
			String creator, Timestamp crateTime, String status, String notes,
			String remarks) {
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.organId = organId;
		this.creator = creator;
		this.crateTime = crateTime;
		this.status = status;
		this.notes = notes;
		this.remarks = remarks;
	}

	@Id
	@GeneratedValue
	@Column(name = "DEPT_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	@Column(name = "DEPT_CODE", length = 4)
	public String getDeptCode() {
		return this.deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Column(name = "DEPT_NAME", length = 64)
	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Column(name = "ORGAN_ID", precision = 10, scale = 0)
	public Long getOrganId() {
		return this.organId;
	}

	public void setOrganId(Long organId) {
		this.organId = organId;
	}

	@Column(name = "CREATOR", length = 32)
	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Column(name = "CRATE_TIME", length = 7)
	public Timestamp getCrateTime() {
		return this.crateTime;
	}

	public void setCrateTime(Timestamp crateTime) {
		this.crateTime = crateTime;
	}

	@Column(name = "STATUS", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "NOTES", length = 128)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "REMARKS", length = 128)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}