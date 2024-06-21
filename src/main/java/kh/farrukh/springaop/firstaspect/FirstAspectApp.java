package kh.farrukh.springaop.firstaspect;

import kh.farrukh.springaop.firstaspect.bean.Writer;
import kh.farrukh.springaop.firstaspect.config.FirstAspectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstAspectApp {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(FirstAspectConfig.class);

    var writer = context.getBean(Writer.class);
    writer.think();
    writer.findTool();
    writer.write();
  }

}
