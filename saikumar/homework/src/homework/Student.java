package homework;
import java.util.Scanner;
public class Student {
double sno;
String sname;
void storeData(double n, String s) {
 sno = n;
 sname = s;
}
public String displayData()
{
 String output;
 output = String.format("sno = %f\n sname = %s",sno,sname);
 return output;
}
}
  class MyStudent
{
 public static void main(String args[])
 {
  double no;
  String name;
  Scanner s = new Scanner(System.in);
  Student R = new Student();
  System.out.println("Enter Sno and sname");
  no = s.nextDouble();
  name =s.next();
  R.storeData(no, name);
  System.out.println(R.displayData());
 
  
 }
}