package exercises;

public abstract class Bird extends Animal
{
    // Птицы
    // height    Высота
    // weight    Вес
    // eyeColor  Цвет глаз
    // sound     Звук, который издаёт животное
    // flightAlt Высота полёта

    public Bird(Double height, Double weight, int eyeColor, String sound, Double flightAlt)
    {
        super(height, weight, eyeColor, sound);
        this.flightAlt = flightAlt;
    }

    public Double getFlightAlt()
    {
        return flightAlt;
    }

    public void setFlightAlt(Double flightAlt)

    {
        this.flightAlt = flightAlt;
    }

    private Double flightAlt;

    public void doFlight()
    {
        if (flightAlt > 0)
            System.out.println("Flying at altitude " + flightAlt);
        else
            System.out.println("Too low!");
    }
}
