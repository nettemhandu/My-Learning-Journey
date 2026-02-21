public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double salaryResult = (daysSkipped >= 5) ? 0.85 : 1.0;
        return salaryResult;
    }

    public int bonusMultiplier(int productsSold) {
        int multiplier = (productsSold >= 20) ? 13 : 10;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        int units = productsSold * bonusMultiplier(productsSold);
        return units;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.00;
        double total = baseSalary * salaryMultiplier(daysSkipped);
        double bonus = total + bonusForProductsSold(productsSold);
        double result = bonus;
        result = (bonus >= 2000.00) ? 2000 : bonus;
        return result;
    } 
}
