package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class userentity {
 @Id
 private int userid;
 private long phoneno;
 private String firstname;
 private String lastname;
 private String emailid;
public userentity() {
	super();
	// TODO Auto-generated constructor stub
}
public userentity(int userid, long phoneno, String firstname, String lastname, String emailid) {
	super();
	this.userid = userid;
	this.phoneno = phoneno;
	this.firstname = firstname;
	this.lastname = lastname;
	this.emailid = emailid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
}