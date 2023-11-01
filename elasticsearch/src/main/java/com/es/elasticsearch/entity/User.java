package com.es.elasticsearch.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.format.annotation.DateTimeFormat;


@Document(indexName = "userinformation_elasticsearch")
public class User {

	@Id
	@Field(type = FieldType.Keyword, name = "id")
	private String id;

	@Field(type = FieldType.Text, name = "firstName")
	private String firstName;

	@Field(type = FieldType.Text, name = "lastName")
	private String lastName;

	@Field(type = FieldType.Text, name = "email")
	private String email;

	@Field(type = FieldType.Long, name = "mobileNumber")
	private long mobileNumber;

	@Field(type = FieldType.Text, name = "gender")
	private String gender;

	@Field(type = FieldType.Date, name = "createDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;

	@Field(type = FieldType.Date, name = "updateDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateDate;

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
