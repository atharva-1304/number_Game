package number_Game;
import java.util.Scanner;

public class Number_game {
   //this is a simple nuber game
  public static void main(String[] args) {
    Scanner  Sc = new Scanner(System.in);
    int MyNum = (int) (Math.random() * 100);
    int UseerNumber;
   
    do {
      System.out.println("enter a number: (1-100)");
      UseerNumber = Sc.nextInt();
      if (MyNum == UseerNumber) {
        System.out.println("you win");
        break;
      } else if (UseerNumber > MyNum) {
        System.out.println("large number");
      } else {
        System.out.println("number is smalll:");
      }
    } while (UseerNumber >= 0);
    System.out.println("my number:");
    System.out.println(MyNum);
    Sc.close();
  }
}
