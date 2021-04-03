package AdvancedOOP;

public class Dog extends Mammal {
  
  private String name;

  // no-argument
  public Dog(){
    super();
  }

  // access parent class 
  public Dog(String hairColor, String name) {
    super(hairColor);
    this.name = name;
  }
  // getter and setter
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  // override makeSound
  public String makeSound(){
    return "woof";
  }
  
}
