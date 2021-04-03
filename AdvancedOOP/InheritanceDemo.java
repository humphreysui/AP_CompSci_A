package AdvancedOOP;

import java.util.ArrayList;

public class InheritanceDemo {
  /*
   * in Java, a class has the ability to extend another class. That is, a child
   * class (subclass) has the ability to extend a parent class (superclass).
   * 
   * When a child class extends a parent class, it inherits the instance variables
   * and methods of the parent class. This means that the child objects
   * automatically get these methods without having to define them for themselves.
   * 
   * the child class gets its own set of instance variables that are separate from
   * the parent class. The instance variables for the parent and the instance
   * variables for the child are two different sets of instance variables. The
   * child class can only access the private instance variables of the parent by
   * using the accessor and mutator methods from the parent class.
   * 
   */

  /*
   * The keyword extends is used to identify that inheritance is taking place. A
   * child class can only extend one parent class. However, there is no limit to
   * how many *classes can exist in a class hierarchy.
   */

  // override method and polymorphism

   /**
    * In Java, a child class is allowed to override a method of a parent class.
    * This means that even though the child inherited a certain way to do something
    * from its parent, it can do it in a different way if it wants to. This is an
    * example of polymorphism. The decision of when to use the overridden method by
    * all objects that extend a superclass is made when the program is compiled and
    * this process is called static binding.
    * 
    */

  public static void main(String[] args) {
    

    Dog dog1 = new Dog();
    System.out.println(dog1.getName());
    System.out.println(dog1.getHairColor());
    System.out.println(dog1.isVertebrate());

    Dog dog2 = new Dog("white", "pup");
    System.out.println(dog2.getHairColor());
    System.out.println(dog2.getName());
    System.out.println(dog2.isVertebrate());

    // call override methods
    Mammal m1 = new Mammal();
    System.out.println(m1.makeSound());
    System.out.println(dog2.makeSound());
    Cat cat2 = new Cat();
    System.out.println(cat2.makeSound()); 
    
    // dynamic binding 
    /*
     * what if we want to add different mammals into a list. note an arrayList can
     * only hold one type!
     * 
     * Each Mammal object makeSound is decided while the program is running (known
     * as run-time) and this process is called dynamic binding.
     * 
     */

    Mammal mammal = new Mammal();
    Mammal cat = new Cat();
    Mammal dog = new Dog();
    ArrayList<Mammal> mammalList = new ArrayList<Mammal>();
    mammalList.add(mammal);
    mammalList.add(cat);
    mammalList.add(dog);
    for(Mammal m : mammalList){
      System.out.println(m.makeSound());
    }

    // Reference Variables and Hierarchy
    /*
    Mammal someMammal =  new Cat();   // correct
    Cat someMammal = new Mammal();    // error: type mismatch
    */

    // invoke parent method in child cat class
    System.out.println(cat2.makeSound(true));
    

    // Parent Reference on a Child Object
    /*
     * A child object has the ability to perform all the public methods of its
     * parent class. However, a parent does not have the ability to do what the
     * child does if the child action is original.
     * 
     * Also, if a child object has a parent reference variable, the child does not
     * have the ability to perform any of the unique methods that are defined in its
     * own class.
     */
    Mammal c1 = new Cat();
    Cat c2 = new Cat();
    System.out.println(c2.lives());
    // System.out.println(c1.lives());  // illegal - compile-error

    // downcasting 
    System.out.println( ((Cat) c1).lives() );

    // You are not allowed to cast a parent reference object to a child if the object is a parent.
    Mammal c3 = new Mammal();
    // System.out.println(((Cat) c3).lives()); // error: ClassCastException


    // Read 9.7

    // the Object class
    // equals & override toString()

    // downcasting Object class
    System.out.println(bark(dog));


  }

  public static String bark (Object animal){
    return ((Dog)animal).makeSound();
  }



}
