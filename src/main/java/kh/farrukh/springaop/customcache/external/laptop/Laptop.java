package kh.farrukh.springaop.customcache.external.laptop;

import java.util.UUID;

public class Laptop {

  private final UUID requestId = UUID.randomUUID();
  private String name;

  public Laptop(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public UUID getRequestId() {
    return requestId;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Laptop{" +
        "name='" + name + '\'' +
        ", requestId='" + requestId + '\'' +
        '}';
  }

}
