package kh.farrukh.springaop.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import org.springframework.cglib.core.ReflectUtils;

public class CGLibUtils {

  public static void initGeneratedClassHandler(String targetPath) {
    File dir = new File(targetPath);
    dir.mkdirs();
    ReflectUtils.setGeneratedClassHandler((String className, byte[] classContent) -> {
      saveClass(className, classContent, dir);
    });
  }

  private static void saveClass(String className, byte[] classContent, File dir) {
    var path = className.split("\\.");
    var fileName = path[path.length - 1];

    for (int i = 0; i < path.length - 2; i++) {
      dir = new File(dir, path[i]);
      dir.mkdirs();
    }

    try (FileOutputStream out = new FileOutputStream(new File(dir, fileName + ".class"))) {
      out.write(classContent);
    } catch (IOException e) {
      throw new UncheckedIOException("Error while storing " + className, e);
    }
  }

}
