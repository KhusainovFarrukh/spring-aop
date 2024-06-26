package kh.farrukh.springaop.firstaspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GetNameLoggingAspect {

//  @Before("execution(public String kh.farrukh.springaop.firstaspect.bean.Poem.getName())")
//  private void logGetName() {
//    System.out.println("getName() method is called");
//  }

//  @Before("getterMethods()")
//  private void logGetters() {
//    System.out.println("Getter method is called");
//  }

//  @Before("getterMethods()")
//  private void logGettersAdditional() {
//    System.out.println("Getter method is called (Additional advice)");
//  }

//  @Before("poemGetters()")
//  private void logPoemGetters(JoinPoint joinPoint) {
//    System.out.println(joinPoint.toShortString() + " is called on object " + joinPoint.getTarget());
//  }

//  @Before(value = "strArgMethodsWithinBean(str)", argNames = "str")
//  private void logStrArgMethodsWithinBean(String str) {
//    System.out.println("Setter call with value=" + str);
//  }

//  @After(value = "strArgMethodsWithinBean(str)", argNames = "str")
//  private void logStrArgMethodsWithinBean(String str) {
//    System.out.println("SetAndGetCall call with value=" + str);
//  }

//  @AfterThrowing(value = "strArgMethodsWithinBean(str)", argNames = "str,ex", throwing = "ex")
//  private void logStrArgMethodsWithinBean(String str, RuntimeException ex) {
//    System.out.println("SetAndGetCall exception=" + ex + " with value=" + str);
//  }
//
//  @AfterReturning(value = "strArgMethodsWithinBean(str)", argNames = "str,out", returning = "out")
//  private void logStrArgMethodsWithinBean(String str, String out) {
//    System.out.println("SetAndGetCall return=" + out + " with value=" + str);
//  }

  @Around(value = "strArgMethodsWithinBean(String)", argNames = "joinPoint")
  private Object logStrArgMethodsWithinBean(ProceedingJoinPoint joinPoint) {
    System.out.println("Before advice");

    Object result;
    try {
      result = joinPoint.proceed() + " {from around}";
      System.out.println("After returning advice");
    } catch (Throwable e) {
      System.out.println("After throwing advice");
      throw new RuntimeException(e);
    }

    System.out.println("After advice");

    return result;
  }

  @Pointcut(value = "strArgMethods(str) && withinBean()", argNames = "str")
  private void strArgMethodsWithinBean(String str) {
  }

  @Pointcut("args(str)")
  private void strArgMethods(String str) {
  }

  @Pointcut("within(kh.farrukh.springaop.firstaspect.bean..*)")
  private void withinBean() {
  }

  @Pointcut("execution(public * get*())")
  private void getterMethods() {
  }

  @Pointcut("within(kh.farrukh.springaop.firstaspect.bean.Poem)")
  private void withinPoem() {
  }

  @Pointcut("withinPoem() && getterMethods()")
  private void poemGetters() {
  }

}
