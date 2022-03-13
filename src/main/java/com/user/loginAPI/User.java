package com.user.loginAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TBL")
public class User {
	
	
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
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public int getWrong_login_attempt() {
		return wrong_login_attempt;
	}
	public void setWrong_login_attempt(int wrong_login_attempt) {
		this.wrong_login_attempt = wrong_login_attempt;
	}
	public int getToday_login_Attempt() {
		return today_login_Attempt;
	}
	public void setToday_login_Attempt(int today_login_Attempt) {
		this.today_login_Attempt = today_login_Attempt;
	}
	public String getIs_now_login() {
		return is_now_login;
	}
	public void setIs_now_login(String is_now_login) {
		this.is_now_login = is_now_login;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId; 
	private String userName;
	private String phoneNo;
	private String passWord;
	private String oldPassword;
	private String userToken;
	private int wrong_login_attempt;
	private int today_login_Attempt;
	private String is_now_login;
	private String datetime;
	
	@ManyToOne
	private Booking booking;
	
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public User() {
		// Constructor without any argument
		
	}
	public User(int userId, String userName, String phoneNo, String passWord, String oldPassword, String userToken, int wrong_login_attempt,
			int today_login_Attempt, String is_now_login, String dateTime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.passWord = passWord;
		this.oldPassword = oldPassword;
		this.userToken = userToken;
		this.wrong_login_attempt = wrong_login_attempt;
		this.today_login_Attempt = today_login_Attempt;
		this.is_now_login = is_now_login;
		this.datetime = dateTime;
		
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
