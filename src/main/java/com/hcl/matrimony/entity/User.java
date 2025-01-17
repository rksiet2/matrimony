package com.hcl.matrimony.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;

	@Column(name="user_name")
	private String userName;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="mob_no")
	private Long mobNo;
	
	@Column(name="address")
	private String address;
	
	@Column(name="income")
	private int income;

}
