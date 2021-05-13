import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection;
    while(true){
      System.out.println("___Menu___");
      System.out.println("1: Say Hello");
      System.out.println("2. List My Favorite Foods");
      System.out.println("3. Exit");
      selection = scanner.nextInt();

      if(selection <= 2){
        System.out.println("Hello World");
        System.out.println("Apples, Bananas, Coconuts");
      }
      else{
        System.out.println("Goodbye");
        scanner.close();
      }

    }
  }
}
