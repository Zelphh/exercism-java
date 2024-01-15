package exercisesClasses;

import java.lang.Math;

public class Darts {
    public int score(double xOfDart, double yOfDart) {
        double d = Math.sqrt(Math.pow((0 - xOfDart), 2) + Math.pow((0 - yOfDart), 2));

        int score;

        if (d > 10) {
            score = 0;
        } else if (d > 5) {
            score = 1;
        } else if (d > 1 && d <= 5) {
            score = 5;
        } else {score = 10;}
        
        return score;
    }
}
