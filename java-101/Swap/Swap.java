class Swap {
  public static void main(String[] args) {
    int a = 9;
    int b = 8;
    System.out.println("a = " + a + ", b = " + b);
    // Swap here
    int c = a; // Keep old variable a 
    a = b;
    b = c;

    // Swap here
    System.out.println("a = " + a + ", b = " + b);
  }
}
