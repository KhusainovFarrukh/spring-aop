package kh.farrukh.springaop.privatecall.service;

import org.springframework.stereotype.Service;

@Service
public class PrivateCallService {

  public void somePublicMethod() {
    System.out.println("Public method is called");
    somePrivateMethod();
  }

  private void somePrivateMethod() {
    System.out.println("Private method is called");
  }

}
