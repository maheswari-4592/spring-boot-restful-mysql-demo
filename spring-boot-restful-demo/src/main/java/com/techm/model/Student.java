package com.techm.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Student 
{
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
