package kh.farrukh.springaop.customcache.cache;

import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CacheAspect {

  private final Map<String, Object> cache = new HashMap<>();

  @Around("cacheAnnotation()")
  public Object cache(ProceedingJoinPoint joinPoint) {
    var className = joinPoint.getSignature().getDeclaringTypeName();
    var methodName = joinPoint.getSignature().getName();
    var args = joinPoint.getArgs();
    var keyBuilder = new StringBuilder();
    keyBuilder.append(className).append(".").append(methodName);
    for (var arg : args) {
      keyBuilder.append(".").append(arg);
    }
    var key = keyBuilder.toString();

    if (cache.containsKey(key)) {
      return cache.get(key);
    }

    try {
      var result = joinPoint.proceed();
      cache.put(key, result);
      return result;
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }

  @Pointcut("@annotation(Cache)")
  public void cacheAnnotation() {
  }

  public Map<String, Object> getCache() {
    return this.cache;
  }
}
