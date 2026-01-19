import java.util.Scanner;
public class AttendanceStatusEvaluator{
  public Static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an single Positive Integer");
    int Attendance= sc.nextInt();
    if(Attendance > 85){
      System.out.println("Excellent");
    }
    else if (Attendance
