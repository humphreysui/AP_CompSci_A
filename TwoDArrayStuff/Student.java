package TwoDArrayStuff;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
  int ID;
  String name;
  public int age;

  public Student(int ID, String name, int age){
    this.ID = ID;
    this.name = name;
    this.age = age;
  }

  public String toString(){
    return ID + " " + name + " " + age;
  }

  public void changeAge(int age) {
    this.age = age;
  }
  public static void main(String[] args) {
    
    Student s1 = new Student(1, "Ada", 10);
    Student s2 = new Student(2, "Bob", 11);
    Student s3 = new Student(3, "Chris", 12);
    Student s4 = new Student(4, "Dave", 13);
    Student s5 = new Student(5, "Eve", 14);
    Student s6 = new Student(6, "Faye", 15);

    // add object to arrayList
    ArrayList<Student> studentInfoList = new ArrayList<Student>();
    studentInfoList.add(s1);
    studentInfoList.add(s2);
    studentInfoList.add(s3);
    System.out.println(studentInfoList);

    // you can add object to 2D arrays
    Student[][] studentMatrix = { { s1, s2 }, { s3, s4 }, { s5, s6 } };
    for (Student[] roster : studentMatrix) {
      for (Student student : roster) {
        student.changeAge(18);
      }
    }
    System.out.println(Arrays.deepToString(studentMatrix));

    
  }
}
