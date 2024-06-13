package com.techm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student 
{      
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Integer stid;
	   private String stname;
	   public Student(Integer stid, String stname) {
			super();
			this.stid = stid;
			this.stname = stname;
		}
	
		public Integer getStid() {
			return stid;
		}
		public void setStid(Integer stid) {
			this.stid = stid;
		}
		public String getStname() {
			return stname;
		}
		public void setStname(String stname) {
			this.stname = stname;
		}
		@Override
		public String toString() {
			return "Student [stid=" + stid + ", stname=" + stname + "]";
		}
		public Student()
		{
		
		}
}