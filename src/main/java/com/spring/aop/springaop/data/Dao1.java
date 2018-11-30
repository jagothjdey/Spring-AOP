package com.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.spring.aop.springaop.aop.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}
}
