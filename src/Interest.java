public abstract class Interest {
  protected double principal;
  protected double rate;

  public Interest(double principal, double rate) {
    this.principal = principal;
    this.rate = rate;
  }

  public abstract void simulate(int numYears);
}
