package exercisesClasses;

import java.math.BigInteger;

public class Grains {

	public BigInteger grainsOnSquare(final int square) {

		if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        
        BigInteger grains = BigInteger.valueOf(1);

        for (int i = 1; i < square; i++) {
            grains = grains.multiply(BigInteger.valueOf(2));
        }

        return grains;
    }

	public BigInteger grainsOnBoard() {
		
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger db = BigInteger.valueOf(1);
        
        for(int i=0;i < 64; i++) {
            sum = sum.add(db);
            db = db.multiply(BigInteger.valueOf(2));
        }
        return sum;
    }
	
	public BigInteger grainsOnBoardUntilSquare(int square) {
		BigInteger sum = BigInteger.valueOf(0);
		
		for (int i=1; i <= square; i++) {
			sum = sum.add(grainsOnSquare(i));
		}
		
		return sum;
	}
}
