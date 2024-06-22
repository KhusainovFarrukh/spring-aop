package kh.farrukh.springaop.customcache.external.laptop;

import org.springframework.stereotype.Component;

@Component
public class LaptopGetter {

    public Laptop getLaptop(String name) {
        System.out.println("Getting laptop");
        return new Laptop(name);
    }

}
