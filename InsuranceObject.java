import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InsuranceObject {
  private String name;
  private List<InsuranceItem> items = new ArrayList<InsuranceItem>();

  public InsuranceObject(String name) {
    this.name = name;
  }

  public InsuranceObject addItem(InsuranceItem item) {
    items.add(item);
    return this;
  }

  public BigDecimal sumOfType(RiskType type) {
    return items.stream().filter(i -> i.isType(type)).map(it -> it.getAmount()).reduce(BigDecimal.ZERO,
        BigDecimal::add);
  }
}
