package kh.farrukh.springaop.firstaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GetNameLoggingAspect {

//  @Before("execution(public String kh.farrukh.springaop.firstaspect.bean.Poem.getName())")
//  private void logGetName() {
//    System.out.println("getName() method is called");
//  }

  @Before("execution(public * get*(..))")
  private void logGetters() {
    System.out.println("Getter method is called");
  }

}
