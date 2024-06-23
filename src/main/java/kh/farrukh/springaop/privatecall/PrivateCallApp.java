package kh.farrukh.springaop.privatecall;

import kh.farrukh.springaop.privatecall.config.PrivateCallConfig;
import kh.farrukh.springaop.privatecall.service.PrivateCallService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrivateCallApp {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(PrivateCallConfig.class);

    var service = context.getBean(PrivateCallService.class);
    service.somePublicMethod();
  }

}
