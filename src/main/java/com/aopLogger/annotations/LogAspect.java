package com.aopLogger.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LogAspect {

	@Around(value = "execution(@com.aopLogger.annotations.Loggable * *(Long)) && args(userId)")
    public Object log(ProceedingJoinPoint pjp, Long userId) throws Throwable {
		System.out.println("Calling method : " + pjp.getSignature() + " with argument userId="+ userId + " Start");
		Object result= pjp.proceed();
        System.out.println("Calling method : " + pjp.getSignature() + " End");
		return result;
    }
}
