package kh.farrukh.springaop.firstaspect.bean;

import org.springframework.stereotype.Component;

@Component
public class Writer {

  private final WritingTool writingTool;
  private final Poem poem;

  public Writer(WritingTool writingTool, Poem poem) {
    this.writingTool = writingTool;
    this.poem = poem;
  }

  public void think() {
    System.out.println("Thinking poem " + poem.getName());
  }

  public void findTool() {
    System.out.println("Finding tool " + writingTool.getName());
  }

  public void write() {
    System.out.println("Writing poem " + poem.getName() + " with " + writingTool.getName());
  }

  public Poem getPoem() {
    return poem;
  }

  public WritingTool getWritingTool() {
    return writingTool;
  }

}
