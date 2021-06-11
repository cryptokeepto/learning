import java.util.Scanner;

class Average {
  public static void main(String[] args) {
    double d, sum = 0;
    Scanner kb = new Scanner(System.in);
    System.out.print("Input 1 = ");
    d = kb.nextDouble();
    sum = sum + d;
    System.out.print("Input 2 = ");
    d = kb.nextDouble();
    sum = sum + d;
    System.out.print("Input 3 = ");
    d = kb.nextDouble();
    sum = sum + d;
    double avg = sum / 3.0;
    System.out.println("avg = " + avg);
  }
}
