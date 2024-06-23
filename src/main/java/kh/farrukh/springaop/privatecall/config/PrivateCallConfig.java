package kh.farrukh.springaop.privatecall.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("kh.farrukh.springaop.privatecall")
public class PrivateCallConfig {

}
