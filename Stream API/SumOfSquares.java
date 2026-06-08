import java.util.*;

public class SumOfSquares {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    int SumOfSquaresOfEven = numbers.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(n -> n * n)
        .sum();

    System.out.println(SumOfSquaresOfEven);
  }
}
