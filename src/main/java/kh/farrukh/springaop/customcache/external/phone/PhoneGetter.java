package kh.farrukh.springaop.customcache.external.phone;

import kh.farrukh.springaop.customcache.cache.Cache;
import org.springframework.stereotype.Component;

@Component
public class PhoneGetter {

  @Cache
  public Phone getPhone(String name, String model) {
    System.out.println("Getting phone");
    return new Phone(name, model);
  }

}
