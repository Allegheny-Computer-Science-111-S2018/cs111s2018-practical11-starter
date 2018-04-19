package practicaleleven;

/** Program illustrates how to call static methods a class
* from a method in the same class. Static methods are the methods
* that can be called without creating an instance of the object.
*
* <p>Bugs: This program has bugs and is missing source code.
*
* @author Janyl Jumadinova.
*/
public class CallingMethodsInSameClass {

  public static void main(String args) {
    printOne();
    printOne();
    printTwo();
    // TO DO: add printThree() method call
  }

  public static void printOne() {
    System.out.println("Nothing is impossible, the word itself says \"I'm possible\" !");
  }

  public static void printTwo() {
    printOne();
    printOne();
  }

  // TO DO: write a new method called printThree() that calls method printTwo() one time
}
