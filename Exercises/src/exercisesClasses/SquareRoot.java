package exercisesClasses;

public class SquareRoot {
	
    public double squareRoot(int x) {
    	
        double half = x/2;
        double num = 0;

        if (x == 1) {return 1;}
        
        for (;num-half != 0;){
            num = half;
            half = (num + (x/num)) / 2;
        }

        return half;
    }
}