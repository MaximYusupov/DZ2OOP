package exercises;

public class Stork extends Bird
{

    // Аист
    // height    Высота
    // weight    Вес
    // eyeColor  Цвет глаз
    // flightAlt Высота полёта

    public Stork(Double height, Double weight, int eyeColor, Double flightAlt)
    {
        super(height, weight, eyeColor, "loud clicking", flightAlt);
    }

    @Override
    public void printInfo()
    {
        System.out.println(
                "Класс = Аист (птицы)\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота = " + getHeight() + "\n" +
                        "Высота полёта = " + getFlightAlt()
        );
    }
}
