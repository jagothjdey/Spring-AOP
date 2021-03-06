package com.spring.aop.springaop.aop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("com.spring.aop.springaop.aop.CommonJoinPointConfig.dataLayerExecution() && "
			+ "com.spring.aop.springaop.aop.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {}
	
//	@Pointcut("within(* com.spring.aop.springaop.data.*.*(..))")
//	public void allDataLayerMethod() {}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	@Pointcut("@annotation(com.spring.aop.springaop.aop.TrackTime)")
	public void trackTimeAnnotation() {}
}
