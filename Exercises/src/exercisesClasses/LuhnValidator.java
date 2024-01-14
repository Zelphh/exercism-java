package exercisesClasses;

public class LuhnValidator {

    public boolean isValid(String candidate) {
            try {
                String str = candidate.replace(" ", "");
                if (str.length() <= 1) {return false;}
    			
    			for (int i=str.length()-2; i>=0; i-=2) {
    	            int value = Integer.parseInt(String.valueOf(str.charAt(i))) * 2;
    	            if (value > 9) {
    	            	value -= 9;
    	            }
    	            
    	            str = str.substring(0, i) + String.valueOf(value)+str.substring(i+1);
                }
    			int sum = 0;
    			for (int i=0; i<str.length(); i++) {
    				int value = Integer.parseInt(String.valueOf(str.charAt(i)));
    				sum += value;
    			}
    			
    			if (sum % 10 == 0) {
    				return true;
    			} else {return false;} 
		
		} catch (Exception e) {return false;}
    }
}
