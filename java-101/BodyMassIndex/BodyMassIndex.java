import java.util.Scanner;

class BodyMassIndex {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("weight (kg) = ");
    double weight = kb.nextDouble();
    System.out.print("height (cm) = ");
    double height = kb.nextDouble();
    double hm = height / 100.0;
    double bmi = weight / (hm * hm);
    System.out.println("bmi = " + bmi);
  }
}
