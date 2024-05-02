public class PermanentHire extends SalariedWorker{
    private double monthlyBonus;
    private PermanentHire(){}

    public PermanentHire(String name, int social) {
        super(name, social);
    }

    public PermanentHire(String name, int social, double monthlyPay, double monthlyBonus) {
        super(name, social, monthlyPay);
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public double calculateWeeklyPay(){
        return super.calculateWeeklyPay() + monthlyBonus;
    }
}
