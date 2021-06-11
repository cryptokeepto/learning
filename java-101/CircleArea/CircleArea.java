import java.util.Scanner;

class CircleArea {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("คุณชื่ออะไร = ");
    String name = kb.nextLine();
    System.out.print("รัสมี = ");
    int r = kb.nextInt();
    double pi = 3.14159;
    String msg = "พื่นที่วงกลม ";
    double area = pi * r * r;
    System.out.println("สวัดดี = " + name);
    System.out.println(msg + r + " = " + area);
  }
}
