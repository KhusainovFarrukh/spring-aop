package kh.farrukh.springaop.customcache.external.laptop;

import java.time.Duration;
import kh.farrukh.springaop.customcache.cache.Cache;
import org.springframework.stereotype.Component;

@Component
public class LaptopGetter {

    @Cache
    public Laptop getLaptop(String name) {
        System.out.println("Getting laptop");
        try {
            Thread.sleep(Duration.ofSeconds(3L));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Laptop(name);
    }

}
