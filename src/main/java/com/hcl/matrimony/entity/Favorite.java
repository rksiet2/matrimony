package com.hcl.matrimony.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="favorite")
public class Favorite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="favorite_id")
	private Long favoriteId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private Long userId;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="favorite_user_id")
	private User favoriteUserId;
	
	@Column(name="updated_date")
	private LocalDate updatedDate;

}