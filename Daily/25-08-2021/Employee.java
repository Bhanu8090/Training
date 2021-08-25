package com.bs.employee;

public class Employee{
	private int eid;
	private String ename;
	private int sal;
	
	public Employee(int eid, String ename, int sal) {
		this.eid = eid;
		this.ename = ename;
		this.sal=sal;
	}
	
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "  sal=" + sal + "]";
	}


}
	
