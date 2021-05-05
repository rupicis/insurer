import java.math.BigDecimal;

class InsuranceItem {
  private String name;
  private BigDecimal amount;
  private RiskType type;

  public InsuranceItem(RiskType type, String name, String sum) {
    super();
    this.name = name;
    this.amount = new BigDecimal(sum);
    this.type = type;
  }

  public boolean isType(RiskType type) {
    return this.type == type;
  }

  public BigDecimal getAmount() {
    return amount;
  }
}
