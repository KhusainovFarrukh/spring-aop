package kh.farrukh.springaop.customcache.external.laptop;

import kh.farrukh.springaop.customcache.cache.Cache;
import org.springframework.stereotype.Component;

@Component
public class LaptopGetter {

    @Cache
    public Laptop getLaptop(String name) {
        System.out.println("Getting laptop");
        return new Laptop(name);
    }

}
