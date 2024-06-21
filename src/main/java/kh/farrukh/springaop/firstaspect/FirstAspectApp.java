package kh.farrukh.springaop.firstaspect;

import kh.farrukh.springaop.firstaspect.bean.Writer;
import kh.farrukh.springaop.firstaspect.config.FirstAspectConfig;
import kh.farrukh.springaop.util.CGLibUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstAspectApp {

  public static void main(String[] args) {
    CGLibUtils.initGeneratedClassHandler("build/generated/cglib");
    var context = new AnnotationConfigApplicationContext(FirstAspectConfig.class);

    var writer = context.getBean(Writer.class);
    writer.think();
    writer.findTool();
    writer.write();
  }

}
