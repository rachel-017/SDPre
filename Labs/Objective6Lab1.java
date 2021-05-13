public class Objective6Lab1 {
  public static void main(String[] args) {
    int month = 6;
    String monthNam;
    switch (month){
      case 1:
        monthNam = "January";
        break;
      case 2:
        monthNam = "Febuary";
        break;
      case 3:
        monthNam = "March";
        break;
      case 4:
        monthNam = "April";
        break;
      case 5:
        monthNam = "May";
        break;
      case 6:
        monthNam = "June";
        break;
      default:
        monthNam = "Invalid month";
    }
    System.out.println(monthNam);
  }
}
