package com.example.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "T_USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	private String siteid;
	
	private int userkind;
	
	private String userid;
	
	private String userpw;
	
	private String plainpw;
	
	private Timestamp regdate;
	
	private Timestamp pwmoddate;
}
