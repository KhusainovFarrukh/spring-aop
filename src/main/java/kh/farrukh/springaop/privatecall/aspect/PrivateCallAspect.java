package kh.farrukh.springaop.privatecall.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrivateCallAspect {

  @Before("allMethodsOfPrivateCallService()")
  private void beforeAllMethodsOfPrivateCallService(JoinPoint joinPoint) {
    var methodName = joinPoint.getSignature().getName();
    System.out.println("Before method: " + methodName);
  }

  @Pointcut("execution(* kh.farrukh.springaop.privatecall.service.PrivateCallService.*(..))")
  public void allMethodsOfPrivateCallService() {
  }

}
