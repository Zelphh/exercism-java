package exercisesClasses;

public class Hamming {
	
    private String leftStrand;
    private String rightStrand;

	public Hamming(String leftStrand, String rightStrand) {
	    this.leftStrand = leftStrand;
	    this.rightStrand = rightStrand;
	    getHammingDistance();
	}
	
	public int getHammingDistance() {
	    boolean equalDistance = leftStrand.length() == rightStrand.length();
	    
	    if (!equalDistance) {
	        throw new IllegalArgumentException("strands must be of equal length");
	    }
	    
	    int count = 0;
	    for (int i=0; i<leftStrand.length();i++) {
	        if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
	            count += 1;
	        }
	    }
	    return count;
	}
}
