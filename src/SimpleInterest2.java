public class SimpleInterest2  extends Interest {
  public SimpleInterest2(double principal, double rate) {
    super(principal, rate);
  }

  protected double applyRate() {
    return principal * rate / 100.0;
  }
}
