public abstract class Interest {
  protected double principal;
  protected double rate;
  protected double valueOfInvestment;

  public Interest(double principal, double rate) {
    this.principal = principal;
    this.rate = rate;
  }

  public void simulate(int numYears) {
    valueOfInvestment = principal;
    for (int year = 1; year <= numYears; year++) {
      double interest;  // interest this year
      interest = applyRate();
      valueOfInvestment += interest;
      System.out.println("Value of the investment after "
              + year + " years is " + valueOfInvestment);
    }
  }

  protected abstract double applyRate();
}
