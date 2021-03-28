package SortAndSearch;
import java.util.ArrayList;

/*Q1 - Sequential Search
Write a method called searchTitleUsingList that has two parameters: a string array and a string that represents the search target. 
The method should return the index of the target string if it is found and -1 if it does not find the target string. 
*/

// supplement reading - 7.5.3. Runtimes

/*Solution 1 - Algorithm : Look at every item in the list
1: Create a variable called foundIndex and set it equal to -1
2: Look at each of the titles in the array one at a time
3: Compare each title to the target title
4: If the title is equal to the target title, then assign foundIndex to value of the current index
5: Continue looking until you reach the end of the list
6: Return the value of foundIndex
*/

/*Solution 2 - Algorithm: Stop looking if you find the search target
 1: Look at each of the titles in the array one at a time
 2: Compare the target title to each of the titles
 3: If the title is equal to the target title, then stop looking and return the current index
 4: Continue looking until you reach the end of the list
 5: Return -1
 */

public class SequentialSearch {

  public int searchTitleUsingList(ArrayList<String> titles, String target){
    int foundIndex = -1;
    for (int i = 0; i < titles.size(); i++){
      if(titles.get(i).equals(target)){
        
        foundIndex = i;
        //return foundIndex; 

      }
    }
    return foundIndex;
  }

  public int searchTitleUsingArray(String[] titles, String target){
    int foundIndex = -1;
    for(int i = 0; i < titles.length; i++){
      if (titles[i].equals(target)){
        foundIndex = i;
      }
    }
    return foundIndex;
  }

  public static void main(String[] args) {
    String[] st = {"1", "2", "3", "4", "5"};
    SequentialSearch s1 = new SequentialSearch();
    System.out.println(s1.searchTitleUsingArray(st, "4"));
  }
}
