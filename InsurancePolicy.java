import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class InsurancePolicy {
  private String id;
  private PolicyStatus status;
  private List<InsuranceObject> objects = new ArrayList<InsuranceObject>();

  public InsurancePolicy(String id, PolicyStatus status) {
    this.id = id;
    this.status = status;
  }

  public InsurancePolicy addObject(InsuranceObject obj) {
    objects.add(obj);
    return this;
  }

  public BigDecimal getPremium() {
    BigDecimal total = BigDecimal.ZERO;
    for (RiskType risk : RiskType.values()) {
      BigDecimal sum = objects.stream().map(i -> i.sumOfType(risk)).reduce(BigDecimal.ZERO, BigDecimal::add);
      total = total.add(risk.appyCoefficient(sum));
    }
    return total.setScale(2, RoundingMode.HALF_UP);
  }

}
