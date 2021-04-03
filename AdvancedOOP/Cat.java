package AdvancedOOP;

public class Cat extends Mammal {
  
  // override makeSound
  public String makeSound() {
    
    return "meow";
  }

  // Using super from a Child Method
  public String makeSound(Boolean bool){
    // Even if a child class overrides a method from the parent class, an object
    // from a child class can call its parent’s method
    return super.makeSound();
  }

  // child class cat unique method
  public String lives(){
    return "9 lives";
  }
}
