package HW3Extra.SRP;

public class SalaryCalculator {
    private int baseSalary;
    public SalaryCalculator(int baseSalary){
        this.baseSalary = baseSalary;
    }
    public int calculateSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
        }
}
