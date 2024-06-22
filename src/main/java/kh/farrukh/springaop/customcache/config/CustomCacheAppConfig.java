package kh.farrukh.springaop.customcache.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("kh.farrukh.springaop.customcache")
public class CustomCacheAppConfig {

}
