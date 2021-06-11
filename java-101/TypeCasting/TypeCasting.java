class TypeCasting {
  public static void main(String[] args) {
    int a = 10;
    double b = 2;
    double result = (int) a / b;
    String s = "1", t = "1.7";
    System.out.println(Integer.parseInt(s) + 20);
    System.out.println(s + 20);
    System.out.println(Double.parseDouble(t) + 0.1);
  }
}
