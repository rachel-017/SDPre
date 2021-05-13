import java.util.Scanner;
public class Objective4Lab3 {
  public static void main(String[] args){
    int birthyear, currentYear;
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();
    currentYear = 2021;
    birthyear = currentYear - age;
    System.out.println("You were born in " +birthyear);
    input.close();
  }
}
