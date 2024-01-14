package exercisesClasses;

public class RaindropConverter {

	public String convert(int number) {
        String raindrop = "";
        
        if (number % 3 == 0) {
            raindrop = raindrop + "Pling";
        } if (number % 5 == 0) {
            raindrop = raindrop + "Plang";
        } if (number % 7 == 0) {
            raindrop = raindrop + "Plong";
        } 

        if (raindrop == "") {
            return number + "";
        } else {return raindrop;}
    }
}
