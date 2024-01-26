package com.restful.restapp.entites;

public class Student {
   private long rollcall;
   private String name;
   private int marks;
   private int number;
   private String parentName;
public Student(long rollcall, String name, int marks, int number, String parentName) {
	super();
	this.rollcall = rollcall;
	this.name = name;
	this.marks = marks;
	this.number = number;
	this.parentName = parentName;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public long getRollcall() {
	return rollcall;
}
public void setRollcall(long rollcall) {
	this.rollcall = rollcall;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getParentName() {
	return parentName;
}
public void setParentName(String parentName) {
	this.parentName = parentName;
}
@Override
public String toString() {
	return "Student [rollcall=" + rollcall + ", name=" + name + ", marks=" + marks + ", number=" + number
			+ ", parentName=" + parentName + "]";
}
}
