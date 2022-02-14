public class Main {
  public static void main(String[] args) {
    double principal = 6000; // initial capital
    double rate = 3.0; // percent annual interest rate
    int numYears = 5; // number of years passed

    System.out.println("Principal=" + principal + ", Rate="
      + rate + "%, Years=" + numYears);
    double valueOfInvestment = principal;
    for (int year = 1; year <= numYears; year++) {
      double interest;  // interest for this year
      interest = valueOfInvestment * rate / 100.0;
      valueOfInvestment += interest;
      System.out.println("Value of the investment after "
              + year + " years is " + valueOfInvestment);
    }
  }
}
