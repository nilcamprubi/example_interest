public class CompoundInterest2 extends Interest {
  public CompoundInterest2(double principal, double rate) {
    super(principal, rate);
  }

  protected double applyRate() {
    return valueOfInvestment * rate / 100.0;
  }
}

