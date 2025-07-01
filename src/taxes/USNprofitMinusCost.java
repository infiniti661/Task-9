package taxes;

public class USNprofitMinusCost extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) Math.round((debit - credit) * 0.15);
        return Math.max(tax, 0);
    }
}
