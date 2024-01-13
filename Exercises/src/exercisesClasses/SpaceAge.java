package exercisesClasses;

public class SpaceAge {

    private double seconds;
    private int EarthYearSeconds = 31557600;

    public SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    public double getSeconds() {
        return this.seconds;
    }

    public double onEarth() {
        return getSeconds() / EarthYearSeconds;
    }

    public double onMercury() {
        return getSeconds() / (EarthYearSeconds * 0.2408467);
    }

    public double onVenus() {
        return getSeconds() / (EarthYearSeconds * 0.61519726);
    }

    public double onMars() {
        return getSeconds() / (EarthYearSeconds * 1.8808158);
    }

    public double onJupiter() {
        return getSeconds() / (EarthYearSeconds *  11.862615);
    }

    public double onSaturn() {
        return getSeconds() / (EarthYearSeconds * 29.447498);
    }

    public double onUranus() {
        return getSeconds() / (EarthYearSeconds * 84.016846);
    }

    public double onNeptune() {
        return getSeconds() / (EarthYearSeconds * 164.79132);
    }
}
