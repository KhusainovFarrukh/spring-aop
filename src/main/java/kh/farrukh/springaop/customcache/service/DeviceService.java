package kh.farrukh.springaop.customcache.service;

import kh.farrukh.springaop.customcache.external.laptop.LaptopGetter;
import kh.farrukh.springaop.customcache.external.phone.PhoneGetter;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

  private final PhoneGetter phoneGetter;
  private final LaptopGetter laptopGetter;

  public DeviceService(PhoneGetter phoneGetter, LaptopGetter laptopGetter) {
    this.phoneGetter = phoneGetter;
    this.laptopGetter = laptopGetter;
  }

  public void printPhone(String name, String model) {
    System.out.println(phoneGetter.getPhone(name, model));
  }

  public void printLaptop(String name) {
    System.out.println(laptopGetter.getLaptop(name));
  }

}
