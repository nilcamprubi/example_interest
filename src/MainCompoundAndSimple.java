public class MainCompoundAndSimple {
  public static void main(String[] args) {
    double principal = 6000; // initial capital
    double rate = 3.0; // percent annual interest rate
    int numYears = 5; // number of years passed

    System.out.println("Principal=" + principal + ", Rate= "
            + rate + "%, Years=" + numYears);
    System.out.println("Compound interest");
    CompoundInterest compoundInterest = new CompoundInterest(principal, rate);
    compoundInterest.simulate(numYears);
    System.out.println("Simple interest");
    SimpleInterest simpleInterest = new SimpleInterest(principal, rate);
    simpleInterest.simulate(numYears);
  }
}
