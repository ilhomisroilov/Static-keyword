import java.util.Scanner;

import static java.lang.Math.sqrt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  static double e=2.71828182846;
  static double p=3.14159265359;
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Radiusni kiriting: ");
      double radius = scanner.nextDouble();
      circle(radius);
      System.out.print("A ni kiriting:");
      double a = scanner.nextDouble();
      daraja(a);
      System.out.println("Uchburchak tomonlarini kiriting.");
      System.out.print("X=");
      double x = scanner.nextDouble();
      System.out.print("Y=");
      double y = scanner.nextDouble();
      System.out.print("Z=");
      double z = scanner.nextDouble();
      triangle(x, y, z);
  }
  public static void circle(double radius) {
      double area = p* radius * radius;
      System.out.println("Aylananing radiusi" + area);
  }
  public static void daraja(double a){
      double x=Math.pow(e, a);
      System.out.println("E ning a darajasi e^a="+x);
  }
  public static void triangle(double a, double b, double c){
      double hperimetr=(a+b+c)/2;
      double area=Math.sqrt(hperimetr*(hperimetr-a)*(hperimetr-b)*(hperimetr-c));
      System.out.println("Uchburchak yuzi="+area);
  }
}