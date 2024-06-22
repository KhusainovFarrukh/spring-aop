package kh.farrukh.springaop.firstaspect.bean;

public class Poem {

  private String name;

  public Poem(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    System.out.println("Poem name is set to " + name);
  }

  public String setAndGetName(String name) {
    this.name = name + " (modified)";
    System.out.println("Poem name is set to " + this.name + " and returned");
    return this.name;
  }

}
