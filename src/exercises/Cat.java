package exercises;

import java.util.Date;

public class Cat extends Pet
{

    // Для кошек с шерстью
    // height         Высота в холке
    // weight         Масса
    // eyeColor       Цвет глаз
    // name           Кличка
    // breed          Порода
    // isVaccinations Отметка о вакцинации
    // bDate          Дата рождения
    // coatColor      Цвет шерсти

    public Cat(Double height, Double weight, int eyeColor, String name, String breed, boolean isVaccinations, Date bDate, int coatColor)
    {
        super(height, weight, eyeColor, "meow", name, breed, isVaccinations, coatColor, bDate);
        isFluffy = true;
    }

    //Для лысых кошек
    // height         Высота в холке
    // weight         Масса
    // eyeColor       Цвет глаз
    // name           Кличка
    // breed          Порода
    // isVaccinations Отметка о вакцинации
    // bDate          Дата рождения

    public Cat(Double height, Double weight, int eyeColor, String name, String breed, boolean isVaccinations, Date bDate)
    {
        super(height, weight, eyeColor, "meow meow", name, breed, isVaccinations, 0, bDate);
        isFluffy = false;
    }

    @Override
    public void printInfo()
    {
        System.out.println(
                "Класс = Кошки (домашние животные)\n" +
                        "Имя = " + getName() + "\n" +
                        "Порода = " + getBreed() + "\n" +
                        "Дата рождения = " + getbDate() + "\n" +
                        "Вакцинация = " + (isVaccinations() ? "есть" : "отсутствует") + "\n" +
                        "Наличие шерсти = " + (isFluffy ? "есть\nЦвет шерсти = " + getCoatColor() : "отсутствует") + "\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота в холке = " + getHeight()
        );
    }

    @Override
    public void showKindness()
    {
        System.out.println("Murrr Murrr!");
    }

    public boolean isFluffy()
    {
        return isFluffy;
    }

    private boolean isFluffy;

}
