public class PlanetWeightCalculator {

    public static void main(String[] args) {
        double earthWeight = 70.0; // weight on Earth in kg

        // Gravity ratios compared to Earth (relative gravity)
        double mercury = 0.38;
        double venus = 0.91;
        double mars = 0.38;
        double jupiter = 2.34;
        double saturn = 1.06;
        double uranus = 0.92;
        double neptune = 1.19;

        // Calculating weight on different planets
        System.out.println("Weight on Earth: " + earthWeight + " kg");
        System.out.println("Weight on Mercury: " + earthWeight * mercury + " kg");
        System.out.println("Weight on Venus: " + earthWeight * venus + " kg");
        System.out.println("Weight on Mars: " + earthWeight * mars + " kg");
        System.out.println("Weight on Jupiter: " + earthWeight * jupiter + " kg");
        System.out.println("Weight on Saturn: " + earthWeight * saturn + " kg");
        System.out.println("Weight on Uranus: " + earthWeight * uranus + " kg");
        System.out.println("Weight on Neptune: " + earthWeight * neptune + " kg");
    }
}
