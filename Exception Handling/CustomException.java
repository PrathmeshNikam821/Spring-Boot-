// import java.util.*;
// import java.io.*; 

public class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }

  public CustomException(double available, double requested) {
    super(String.format("Insufficent funds: requested %.2f , avialable %.2f", requested, available));
  }

}
