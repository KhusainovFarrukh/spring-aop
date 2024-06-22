package kh.farrukh.springaop.customcache.external.phone;

import org.springframework.stereotype.Component;

@Component
public class PhoneGetter {

  public Phone getPhone(String name, String model) {
    System.out.println("Getting phone");
    return new Phone(name, model);
  }

}
