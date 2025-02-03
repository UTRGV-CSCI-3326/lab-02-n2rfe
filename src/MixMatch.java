public class MixMatch {

  public static void main(String[] args) {

  String varString = "Hello, n2rfe!";
  char varChar = 'E';
  short varShort = 1000;
  int varInt = 2;
  long varLong = 100000L;
  float varFloat = 2.71f;
  double varDouble = 2.718281828459;
  boolean varBoolean = true;

  System.out.println(varString + " <- a string stores a sequence of characters");
  System.out.println(varChar + " <- a char stores a single character");
  System.out.println(varShort + " <- a short stores whole numbers from -2e15 to 2e15 -1");
  System.out.println(varInt + " <- an integer, stores whole numbers from -2e31 to 2e31 -1");
  System.out.println(varLong + " <- a long stores large whole numbers from -2e63 to 2e63 -1");
  System.out.println(varFloat + " <- a float stores decimal numbers with single precision (approx. -2e128 to 2e128)");
  System.out.println(varDouble + " <- a double stores decimal numbers with double precision (approx. -2e1024 to 2e1024)");
  System.out.println(varBoolean + " <- a boolean stores true or false values");

  System.out.println("Combination of some variables: " + varInt + " " + varBoolean + " " + varFloat);
  }
}
