public class Bookkeper extends Human
{
    private int yearGraduation;
    private int income;

    public int getYearGraduation() {
        return yearGraduation;
    }
    public int getIncome() {
        return income;
    }
    public void setYearGraduation(int yearGraduation) {
        this.yearGraduation = yearGraduation;
    }
    public void setIncome(int income) {
        this.income = income;
    }
    public Bookkeper(String lastName, String firstName, int age, int yearGraduation, int income) {
        super(lastName, firstName, age);
        setYearGraduation(yearGraduation);
        setIncome(income);
        System.out.println("BConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public Bookkeper(String lastName, String firstName, int age) {
        super(lastName, firstName, age);
    }
    @Override
    public String toString() {
        return super.toString() + " " + yearGraduation + " " + income;
    }
}