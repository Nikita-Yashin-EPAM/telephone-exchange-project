package telephone.exchange.station.model;

public class Customer extends BaseEntity{
    private String name;
    private double moneyReserve;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyReserve() {
        return moneyReserve;
    }

    public void setMoneyReserve(double moneyReserve) {
        this.moneyReserve = moneyReserve;
    }
}
