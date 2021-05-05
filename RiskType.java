import java.math.BigDecimal;

public enum RiskType {
  FIRE("100", "0.024", "0.014"), TEFT("15", "0.05", "0.11");
  private BigDecimal threshold, base, agressive;

  private RiskType(String threshold, String lux, String base) {
    this.threshold = new BigDecimal(threshold);
    this.base = new BigDecimal(base);
    this.agressive = new BigDecimal(lux);
  }

  public BigDecimal appyCoefficient(BigDecimal sum) {
    return sum.multiply(sum.compareTo(threshold) > 0 ? agressive : base);
  }
}
