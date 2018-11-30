package com.spring.aop.springaop.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodCalculationAspect {
	
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("com.spring.aop.springaop.aop.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime-startTime;
		logger.info("Time taken by {} method is {}",joinPoint,timeTaken);
		
	}
	
}
