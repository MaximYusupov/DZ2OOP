package exercises;

import java.util.Date;

public abstract class WildAnimal extends Animal
{

    // Дикое животное
    // height    Высота
    // weight    Вес
    // eyeColor  Цвет глаз
    // sound     Звук, который издаёт животное
    // wlHabitat Место обитания
    // fDate     Дата нахождения

    public WildAnimal(Double height, Double weight, int eyeColor, String sound, String wlHabitat, Date fDate)
    {
        super(height, weight, eyeColor, sound);
        this.wlHabitat = wlHabitat;
        this.fDate = fDate;
    }

    public String getWlHabitat()
    {
        return wlHabitat;
    }

    public void setWlHabitat(String wlHabitat)
    {
        this.wlHabitat = wlHabitat;
    }

    public Date getfDate()
    {
        return fDate;
    }

    public void setfDate(Date fDate)
    {
        this.fDate = fDate;
    }

    private String wlHabitat;
    private Date fDate;
}
