package AdvancedOOP;

public class Mammal {
  private boolean vertebrate;
  private String hairColor;

  // no-argument constructor
  public Mammal(){
    vertebrate = true;
  }
  // one-para constructor
  public Mammal(String hairColor){
    this.hairColor = hairColor;
    vertebrate = true;
  }

  // getter and setter

  public boolean isVertebrate() {
    return vertebrate;
  }
  // set vertebrate is unnecessary
  /* 
  public void setVertebrate(boolean vertebrate) {
    this.vertebrate = vertebrate;
  } 
  */
  public String getHairColor() {
    return hairColor;
  }
  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  // makeSound() method
  public String makeSound(){
    return "All mammal making sound";
  }
  
  
  
  
}
