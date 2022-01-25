import java.util.Scanner;

public class HiddenWord {
  private String word;

  public HiddenWord(String word){
    this.word = word;
  }

  public String getHint(String guess){
    String hint = "";

    for(int i = 0; i < guess.length(); i++){
      // letter in the guess
      String guessLetter = guess.substring(i, i+1);
      // corresponding letter in the word/hint
      String wordLetter = word.substring(i, i+1);

      if(guessLetter.equals(wordLetter)){
        hint += guessLetter;
      }else if(word.indexOf(guessLetter) != -1){
        hint += "+";
      }else{
        hint += "*";
      }
    }
    return hint;
  }

  public static void main(String[] args) {
    // initiate the game with a word
    HiddenWord puzzle = new HiddenWord("HARPS");

    for (int i = 0; i < 5; i++){
      // ask user to input
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please take a guess of the word:");
      String userGuess = userInput.nextLine();
      // return hint to the console
      System.out.println(puzzle.getHint(userGuess));
      //userInput.close();
    }
     
    
    
  }
}
