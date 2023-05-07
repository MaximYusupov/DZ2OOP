package exercises;

import java.util.Date;

public class Tiger extends WildAnimal
{

    // Тигры
    // height    Высота в холке
    // weight    Масса
    // eyeColor  Цвет глаз
    // wlHabitat Ареал обитания
    // fDate     Дата нахождения

    public Tiger(Double height, Double weight, int eyeColor, String wlHabitat, Date fDate)
    {
        super(height, weight, eyeColor, "Rrrria", wlHabitat, fDate);
    }

    @Override
    public void printInfo()
    {
        System.out.println(
                "Класс = Тигры (дикие животные)\n" +
                        "Дата нахождения = " + getfDate() + "\n" +
                        "Ареал обитания = " + getWlHabitat() + "\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота в холке = " + getHeight()
        );
    }
}
