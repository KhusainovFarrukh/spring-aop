package kh.farrukh.springaop.customcache.external.phone;

import java.util.UUID;

public class Phone {

  private final UUID requestId = UUID.randomUUID();
  private String name;
  private String model;

  public Phone(String name, String model) {
    this.name = name;
    this.model = model;
  }

  public String getName() {
    return name;
  }

  public String getModel() {
    return model;
  }

  public UUID getRequestId() {
    return requestId;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Phone{" +
        "name='" + name + '\'' +
        ", model='" + model + '\'' +
        ", requestId='" + requestId + '\'' +
        '}';
  }

}
