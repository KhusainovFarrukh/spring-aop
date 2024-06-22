package kh.farrukh.springaop.customcache;

import kh.farrukh.springaop.customcache.config.CustomCacheAppConfig;
import kh.farrukh.springaop.customcache.service.DeviceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomCacheApp {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(CustomCacheAppConfig.class);

    var deviceService = context.getBean(DeviceService.class);

    for (int i = 0; i < 5; i++) {
      deviceService.printPhone("Samsung", "Galaxy S" + i % 2);
      deviceService.printLaptop("MacBook Pro");
    }
  }

}
