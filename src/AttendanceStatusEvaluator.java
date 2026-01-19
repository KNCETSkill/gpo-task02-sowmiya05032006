import java.util.Scanner;
public class AttendanceStatusEvaluator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int attendance = sc.nextInt();
    if(attendance > 85) {
      System.out.println("Excellent");
    } else if (attendance >= 60 && attendance <= 85) {
      System.out.println("Satisfactory");
    } else {
      System.out.println("Poor");
    }
    sc.close();
  }
}
  
