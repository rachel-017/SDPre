import java.util.Scanner;
public class Objective4Lab2 {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Add a single digit number");
    int num1 = keyboard.nextInt();
    System.out.println("Add a second single digit number");
    int num2 = keyboard.nextInt();
    System.out.println("Add a final single digit number");
    int num3 = keyboard.nextInt();
    System.out.println("Add a decimal number");
    double dub1 = keyboard.nextDouble();
    System.out.println("Add a second decimal number");
    double dub2 = keyboard.nextDouble();
    System.out.println("Add a final decimal number");
    double dub3 = keyboard.nextDouble();
    double numt = num1 + num2 + num3;
    double dubt = dub1 + dub2 + dub3;
    System.out.println(num1+ "+" + num2 + "+" + num3 + "=" +numt);
    System.out.println(dub1+ "+"+dub2+"+"+dub3+"="+dubt);
  }
}
