package edu.info498.review;

public class Husky extends Dog implements Huggable {

  public Husky(String name) {
    super(name, "Husky");
  }

  public void bark() {
    System.out.println(this+" says: Woof!");
  }
}
