package exercises;

import java.util.Date;

public class Dog extends Pet
{

    // Собака
    // height         Высота в холке
    // weight         Масса
    // eyeColor       Цвет глаз
    // name           Кличка
    // breed          Порода
    // isVaccinations Наличие вакцинации
    // coatColor      Цвет шерсти
    // bDate          Дата рождения
    // hasTraining    Наличие дрессировки

    public Dog(Double height, Double weight, int eyeColor, String name, String breed, boolean isVaccinations, int coatColor, Date bDate, boolean hasTraining)
    {
        super(height, weight, eyeColor, "gaf gaf", name, breed, isVaccinations, coatColor, bDate);
        this.hasTraining = hasTraining;
    }

    public boolean isHasTraining()
    {
        return hasTraining;
    }

    private boolean hasTraining;

    public void doTrain()
    {
        if (!hasTraining)
            hasTraining = Math.random() > 0.3;
    }

    @Override
    public void printInfo()
    {
        System.out.println(
                "Класс = Собаки (домашние животные)\n" +
                        "Имя = " + getName() + "\n" +
                        "Порода = " + getBreed() + "\n" +
                        "Дата рождения = " + getbDate() + "\n" +
                        "Вакцинация = " + (isVaccinations() ? "есть" : "отсутствует") + "\n" +
                        "Цвет шерсти = " + getCoatColor() + "\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота в холке = " + getHeight() + "\n" +
                        "Дрессировка = " + (hasTraining ? "есть" : "отсутствует")
        );
    }

    @Override
    public void showKindness()
    {
        System.out.println("fawning!");
    }
}
