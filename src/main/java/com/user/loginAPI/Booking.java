package com.user.loginAPI;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING_TBL")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId; 
	public Booking() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}


	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getBookingTimeSlot() {
		return bookingTimeSlot;
	}

	public void setBookingTimeSlot(String bookingTimeSlot) {
		this.bookingTimeSlot = bookingTimeSlot;
	}

	public String getBookingDatetime() {
		return bookingDatetime;
	}

	public void setBookingDatetime(String bookingDatetime) {
		this.bookingDatetime = bookingDatetime;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}


	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	private int userId;
	// Code to support relationship
	private String userName;
	private String phoneNo;
	private String bookingType;
	private String registrationNo;
	private String bookingTimeSlot;
	private String bookingDatetime;
	private String comments;
	
	@OneToMany(mappedBy = "booking")
	private List<User> users;
	
	public Booking(int bookingId, int userId, String userName, String phoneNo, String bookingType,
			String registrationNo, String bookingTimeSlot, String bookingDatetime, String comments) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.bookingType = bookingType;
		this.registrationNo = registrationNo;
		this.bookingTimeSlot = bookingTimeSlot;
		this.bookingDatetime = bookingDatetime;
		this.comments = comments;
	}
	
}
