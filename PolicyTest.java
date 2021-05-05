public class PolicyTest {
  public static void main(String... args) {

    InsurancePolicy testcase1 = new InsurancePolicy("My Pets", PolicyStatus.REGISTERED).addObject(
        new InsuranceObject("Dog")
            .addItem(new InsuranceItem(RiskType.FIRE, "Dog house", "100.00"))
            .addItem(new InsuranceItem(RiskType.TEFT, "Dog food", "8.00")));

    InsurancePolicy testcase2 = new InsurancePolicy("My Toys", PolicyStatus.REGISTERED).addObject(
        new InsuranceObject("Transport")
            .addItem(new InsuranceItem(RiskType.FIRE, "Garage", "500.00"))
            .addItem(new InsuranceItem(RiskType.TEFT, "Car", "102.51")));

    System.out.println(testcase1.getPremium());
    System.out.println(testcase2.getPremium());
  }
}
