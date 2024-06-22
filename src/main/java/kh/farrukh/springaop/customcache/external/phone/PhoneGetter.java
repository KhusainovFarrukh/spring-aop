package kh.farrukh.springaop.customcache.external.phone;

import java.time.Duration;
import kh.farrukh.springaop.customcache.cache.Cache;
import org.springframework.stereotype.Component;

@Component
public class PhoneGetter {

  @Cache
  public Phone getPhone(String name, String model) {
    System.out.println("Getting phone");
    try {
      Thread.sleep(Duration.ofSeconds(2L));
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return new Phone(name, model);
  }

}
