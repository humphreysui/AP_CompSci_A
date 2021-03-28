package ArrayListStuff;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    
    /* 
      ArrayList Syntax:
      ArrayList<Type> name = new ArrayList<Type>();
    */ 

    // generic type <Type>: ArrayList todo = new ArrayList<String>();

    // 1. create a todo list and get the size of the list
    ArrayList<String> todo = new ArrayList<String>();
    System.out.println(todo.size());

    // 2. set the list to null and check the size again
    /*
     * todo = null; 
     * System.out.println(todo.size());
     */

    // 3. add values to the list and print the list and its size
    todo.add("homework");
    todo.add("shopping");
    System.out.println(todo);  
    System.out.println(todo.size()); 

    /*
      ArrayLists can only hold objects like String and the wrapper classes Integer and Double. 
      They cannot hold primitive types like int, double, etc. 
      To create ArrayLists of integer values, use Integer as the type.
    */

    // 4. example of a Integer ArrayList
    ArrayList<Integer> intList = new ArrayList<Integer>();
    System.out.println(intList.size());

    // *5. challenge: Digits

    // 6. create an ArrayList called 'studentInfoList' and add objects (create a Student class, a student object has-a ID, name, age instance variables, student object should be able to be printed out with all given fields) to an ArrayList

    ArrayList<Student> studentInfoList = new ArrayList<Student>();
    Student s1 = new Student(1, "Kev", 21);
    System.out.println(s1);
    studentInfoList.add(s1);
    studentInfoList.add(new Student(2, "Chris", 20));
    studentInfoList.add(new Student(3, "Viv", 19));
    System.out.println(studentInfoList);

    /* You can also store objects in Array - later BaseballPlayer example */

    // 7. add any object at a given index to ArrayList
    ArrayList<Integer> exampleList = new ArrayList<Integer>();
    exampleList.add(1);
    System.out.println(exampleList);
    exampleList.add(2);
    System.out.println(exampleList);
    exampleList.add(1, 3);
    System.out.println(exampleList);
    exampleList.add(1, 4);
    System.out.println(exampleList);
    System.out.println(exampleList.size());

    // 8. remove an object at a given index from an ArrayList  
    exampleList.remove(1);
    System.out.println(exampleList);
    System.out.println(exampleList.size());

    // 9. get and set a value at a given index from an ArrayList
    exampleList.get(0);
    exampleList.set(2, 100);
    System.out.println(exampleList);

    /* Java Quick Reference Review */

    // 10. traverse ArrayList using foreach loop
    // Do not use the enhanced for each loop if you want to add or remove elements when traversing a list
    for(Integer i: exampleList){
      System.out.println(i);
    } 

    // 11. traverse ArrayList using for loop
    for(int i = 0; i<exampleList.size(); i++){
      System.out.println(exampleList.get(i));
    }

    // *12. challange 7.3.3, add another myList.add("Ethan"); 

    // *13. unexpected results when adding and removing inside a loop that traverses an ArrayList 
    
    //generate a list arr[1,2,4,5,6] traverse the list and remove all even numbers

    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(1);
    arr.add(2);
    arr.add(4);
    arr.add(5);
    arr.add(6);
    System.out.println(arr);

    /*
    int i = 0; 
    while(i<arr.size()){ 
      if(arr.get(i)%2==0){ 
        arr.remove(i); 
      }else {
        i++; 
      } 
    }
    */

    // you can't modify the increment/decrement in for loop in the way you do to while loop using if statement

    /* 
    // error
     for(int i = 0; i<arr.size(); i++){ 
      if(arr.get(i)%2 == 0) { 
        arr.remove(i); 
      } 
    }
     */

    //idea 1: iterate backwards
    
    for(int i = arr.size() - 1; i >= 0; i--){
      if(arr.get(i)%2==0){
        System.out.println("removing element at index: " + i + " ,arr now is:" + arr);
        arr.remove(i);
      }
    }
    System.out.println(arr);

    // idea 2: decrement index

    
    for(int i = 0; i<arr.size(); i++){
      if(arr.get(i)%2 == 0) {
        arr.remove(i);
        i--;
      }
    }
    
    // 14. advanced accumulating - BaseballPlayer

    // 15. searching  
     
    // 16. sorting (ongoing)

    // *17. challange 7.3.5 & 2018_FRQ_2

  }
}
