package kh.farrukh.springaop.firstaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GetNameLoggingAspect {

  @Before("execution(public String getName())")
  private void logGetName() {
    System.out.println("getName() method is called");
  }

}
