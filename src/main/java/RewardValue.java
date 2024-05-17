public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = (int) (cash / CONVERSION_RATE);
    }

    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = miles * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
