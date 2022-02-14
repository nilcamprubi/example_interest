public class SimpleInterest {
  private double principal;
  private double rate;

  public SimpleInterest(double principal, double rate) {
    this.principal = principal;
    this.rate = rate;
  }

  public void simulate(int numYears) {
    double valueOfInvestment = principal;
    for (int year = 1; year <= numYears; year++) {
      double interest;  // interest this year
      interest = principal * rate / 100.0; // the difference with compound
      valueOfInvestment += interest;
      System.out.println("Value of the investment after "
              + year + " years is " + valueOfInvestment);
    }
  }
}
