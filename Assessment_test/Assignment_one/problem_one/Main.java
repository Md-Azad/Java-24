package Assessment_test.Assignment_one.problem_one;

public class Main {

    public static void main(String[] args) {
        double diameterOfEarth = 7600;
        double earthRadius = diameterOfEarth / 2;
        double earthVolume = CalculateVolume.calculateVolume(earthRadius);

        double diameterOfSun = 865000;
        double sunRadius = diameterOfSun / 2;
        double sunVolume = CalculateVolume.calculateVolume(sunRadius);

        double volumeRatio = sunVolume / earthVolume;

        System.out.println("Volume of the Earth in cubic miles: " + earthVolume + ", the valume of the sun is: "
                + sunVolume + " , cubic miles, and the ratio of the valume of the Sun to the volume of the Earch is: "
                + volumeRatio);
    }
}
