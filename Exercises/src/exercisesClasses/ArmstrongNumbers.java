package exercisesClasses;

import java.lang.Math;

public class ArmstrongNumbers {

    public boolean isArmstrongNumber(int numberToCheck) {
        String str = String.valueOf(numberToCheck);

        int length = str.length();
        int sum = 0;
        
        for (int i=0;i<length;i++) {
            sum += Math.pow(Integer.valueOf(String.valueOf(str.charAt(i))), length);
        }
        return sum == numberToCheck;
    }
}
