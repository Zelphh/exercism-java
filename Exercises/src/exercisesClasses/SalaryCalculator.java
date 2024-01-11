package exercisesClasses;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean penalty = daysSkipped >= 5;
        
        double salaryPenalty = penalty? 0.85 : 1;   
        return salaryPenalty;
    }

    public int bonusMultiplier(int productsSold) {
        boolean multiplier = productsSold >= 20;

        int bonusMultiplier = multiplier? 13 : 10;

        return bonusMultiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        if (finalSalary > 2000) {finalSalary = 2000;}
        
        return finalSalary;
    } 
}
