public class MainWithArgs {
  public static void main(String[] args) {
    double principal = Double.parseDouble(args[0]); // initial capital
    double rate = Double.parseDouble(args[1]); // percent annual interest rate
    int numYears = Integer.parseInt(args[2]); // number of years passed

    System.out.println("Principal=" + principal + ", Rate= "
      + rate + "%, Years=" + numYears);
    double valueOfInvestment = principal;
    for (int year = 1 ; year <= numYears ; year++) {
      double interest;  // interest for this year
      interest = valueOfInvestment * rate/100.0;
      valueOfInvestment += interest;
      System.out.println("Value of the investment after "
              + year + " years is " + valueOfInvestment);
    }
  }
}

