import java.util.Scanner;

/**
  Find the number of different ways to climb an n-stage
  ladder when each step is either one or two stages.
  (For example, a 3-stage ladder can be
  three ways: 1-1-1, 1-2, and 2-1)
**/
public class Nth_Step {
  public static int Nth (int n) {
    if ( (n == 0) || (n == 1) ) {return 1;} // there's only one step
    if (n == 2) {return 2;} // there's two different steps
    else {
      return Nth(n - 1) + Nth(n - 2) + Nth(n - 3); // Many different steps
    }
  }

public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int steps;

  System.out.print ("Enter the ladder: ")
  steps = input.nextInt();

  System.out.print("Steps: " + Nth(steps) );

  // Closing the Scanner object
  input.close;
  }
}
