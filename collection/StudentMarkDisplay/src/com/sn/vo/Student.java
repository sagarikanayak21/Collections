package com.sn.vo;

public class Student {
	private Integer stdId;
	private String stdName;
	private String branch;
	private StudentMarks stdMarks;
	
	public Student(Integer stdId, String stdName, String branch, StudentMarks stdMarks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.branch = branch;
		this.stdMarks = stdMarks;
	}
	
	public Student() {
	}
	
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public StudentMarks getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(StudentMarks stdMarks) {
		this.stdMarks = stdMarks;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", branch=" + branch + ", stdMarks=" + stdMarks
				+ "]";
	}
}
