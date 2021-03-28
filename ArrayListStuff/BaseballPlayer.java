package ArrayListStuff;

import java.util.Arrays;

/* 
Write a method called findTeamAverage that has one parameter: a BaseballPlayer array.
The method should return a double that is the team’s batting average. 
Compute the team average by dividing the total hits by the total at-bats. 
*Make sure a player exists before processing him. 
*Also, perform a check against zero before computing the team average. 
If the team total at-bats is 0, return a team batting average of 0.0. 
Finally, adapt your algorithm to work with an ArrayList of BaseballPlayer objects.
*/

/*Algorithm:
  1: Create a variable called totalHits and set it equal to 0
  2: Create a variable called totalAtBats and set it equal to 0
  3: Look at each player on the roster
  4: Get the number of hits for the player and add it to totalHits
  5: Get the number of atBats for the player and add it to totalAtBats
  6: Continue until you reach the end of the list
  7: Compute the teamBattingAverage by dividing the totalHits by the totalAtBats
  8: Return the teamBattingAverage
*/

public class BaseballPlayer {
  
  private int hits;
  private int atBats;

  public BaseballPlayer(int hits, int atBats) {
    this.hits = hits;
    this.atBats = atBats;
  }

  public int getHits() {
    return hits;
  }

  public void setHits(int hits) {
    this.hits = hits;
  }

  public int getAtBats() {
    return atBats;
  }

  public void setAtBats(int atBats) {
    this.atBats = atBats;
  }
  
  @Override
  public String toString() {
    return "BaseballPlayer [atBats=" + atBats + ", hits=" + hits + "]";
  }
  
  public static double findTeamAverage (BaseballPlayer[] arr){
    int totalAtBats = 0;
    int totalHits = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i]!= null){
        totalHits = totalHits + arr[i].getHits();
        totalAtBats = totalAtBats+ arr[i].getAtBats();
      }
    }
    if (totalAtBats == 0){
      return 0;
    }else{
      return (double) totalHits/totalAtBats;
    }
  }

  public static void main(String[] args) {

    BaseballPlayer[] roster = new BaseballPlayer[5];
    roster[0] = new BaseballPlayer(1, 2);
    roster[1] = new BaseballPlayer(1, 3);
    roster[2] = new BaseballPlayer(2, 4);
    roster[3] = new BaseballPlayer(2, 3);
    System.out.println(Arrays.toString(roster));
    System.out.println(findTeamAverage(roster));
     
  }
}
