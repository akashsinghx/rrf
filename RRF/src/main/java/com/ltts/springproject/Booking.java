package com.ltts.springproject;

import javax.persistence.Id;
import javax.persistence.Entity;
 
@Entity

public class Booking {
	private long profile_Id;
	/*
	 * private int ps_id; private String email_id;
	 */
	  private String name;
	  private int exp;
	  private String Skills;
	  
	  
	  public Booking() {
		}
	  
	  @Id

	public long getProfile_Id() {
		return profile_Id;
	}

	public void setProfile_Id(long profile_Id) {
		this.profile_Id = profile_Id;
	}

	/*
	 * public int getPs_id() { return ps_id; }
	 * 
	 * public void setPs_id(int ps_id) { this.ps_id = ps_id; }
	 * 
	 * public String getEmail_id() { return email_id; }
	 * 
	 * public void setEmail_id(String email_id) { this.email_id = email_id; }
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 */
	


	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getSkills() {
		return Skills;
	}

	public void setSkills(String skills) {
		Skills = skills;
	}

	
	
	    
}
