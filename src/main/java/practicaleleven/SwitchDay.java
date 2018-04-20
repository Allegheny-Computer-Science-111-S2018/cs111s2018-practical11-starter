package practicaleleven;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** Program demonstrates usage of the switch statement.
*
* <p>Bugs: This program has bugs and is missing source code.
*
* @author Janyl Jumadinova
**/
public class SwitchDay {

  public static void main(String[] args) throws IOException {
    File file = new File("input/day.txt");
    Scanner scan = new Scanner(file);
    String day = scan.nextString();
    
    // TO DO: Using a switch statement, print whether 'day' is a weekday or a weekend day.
  }
}
