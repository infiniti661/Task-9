import taxes.USNprofit;
import taxes.USNprofitMinusCost;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company("Астронавт", new USNprofit());
        company1.shiftMoney(120000);
        company1.shiftMoney(-80000);
        company1.payTaxes();

        Company company2 = new Company("Березка", new USNprofitMinusCost());
        company2.shiftMoney(300000);
        company2.shiftMoney(-180000);
        company2.payTaxes();


        company2.setTaxSystem(new USNprofit());
        company2.shiftMoney(500000);
        company2.shiftMoney(-300000);
        company2.payTaxes();

    }
}