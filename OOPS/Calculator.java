
class Calculate {
  public int add(int a, int b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

}

class AdvanceCalculate extends Calculate {
  @Override
  public int add(int a, int b) {
    System.out.println("From advance calcualtor");
    return a + b;
  }
}

public class Calculator {
  public static void main(String[] args) {
    Calculate calc = new AdvanceCalculate();

    System.out.println(calc.add(5, 6));

    System.out.println(calc.add(4, 5, 6));
  }
}
