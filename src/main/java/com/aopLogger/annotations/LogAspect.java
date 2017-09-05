package com.aopLogger.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class LogAspect {

	@Around(value = "execution(@com.aopLogger.annotations.Loggable * *(Long)) && args(userId)")
    public void log(ProceedingJoinPoint pjp, Long userId) throws Throwable {
        System.out.println(pjp.getTarget());
		
    }
}
