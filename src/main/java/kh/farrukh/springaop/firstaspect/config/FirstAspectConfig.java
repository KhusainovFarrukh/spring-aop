package kh.farrukh.springaop.firstaspect.config;

import kh.farrukh.springaop.firstaspect.bean.Poem;
import kh.farrukh.springaop.firstaspect.bean.WritingTool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kh.farrukh.springaop.firstaspect")
public class FirstAspectConfig {

  @Bean
  public Poem poem() {
    return new Poem("The Road Not Taken");
  }

  @Bean
  public WritingTool writingTool() {
    return new WritingTool("Pen");
  }

}
