package com.org.hibernate.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER", catalog = "gppr")
public class User {
	private Integer id;
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer mobileNumber;
	private char gender;
	private Integer type;
	private String password;
	private String passwordOLD;
	private Date createdDate;
	private Date updatedDate;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    
	@Column(name = "USERID", unique = true,length = 10, nullable = false)
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "FIRSTNAME", length = 50, nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "MIDDLENAME", length = 50)
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	@Column(name = "LASTNAME", length = 50, nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "MOBILENUMBER", length = 12, nullable = false)
	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Column(name = "GENDER", length = 1, nullable = false)
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	@Column(name = "TYPPE", length = 3)
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	@Column(name = "PASSWORD", length = 16, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "PASSWORDOLD", length = 16)
	public String getPasswordOLD() {
		return passwordOLD;
	}
    
	public void setPasswordOLD(String passwordOLD) {
		this.passwordOLD = passwordOLD;
	}
	
	@Column(name = "CREATEDDATE")
	public Date getCreatedDate() {
		return createdDate;
	}
   
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "UPDATEDDATE")
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", type=" + type
				+ ", password=" + password + ", passwordOLD=" + passwordOLD + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

}
