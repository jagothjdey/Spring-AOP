package com.spring.aop.springaop.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void afterReturning(JoinPoint joinPoint) {
		logger.info("Method before : {}",joinPoint);
	}
	
}
