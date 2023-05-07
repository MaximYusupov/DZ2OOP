package exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Zoo
{
    public Zoo()
    {
        setTestData();
    }

    ArrayList<Animal> zooDB = new ArrayList<>();

    private void setTestData()
    {
        zooDB.add(new Cat(10.3, 7.1, 0x1b612f, "Тоша", "Персидский", false, new Date(120, 9, 30), 0xdb35d6));
        zooDB.add(new Cat(15.7, 4.8, 0x7468f7, "Васька", "Без породы", true, new Date(114, 1, 25)));
        zooDB.add(new Tiger(81.7, 60.4, 0xFF0000, "Приморском край", new Date(110, 11, 2)));
        zooDB.add(new Dog(24.4, 12.3, 0x5c4f1c, "Байкал", "Алабай", true, 0x12e012,new Date(118, 3, 12), false));
        zooDB.add(new Wolf(34.2, 10.3, 0xFF0000, "Остров Сахалин", new Date(119, 1, 7), true));
        zooDB.add(new Chicken(27.9, 1.5, 0xFF0000));
        zooDB.add(new Stork(125.1, 4.5, 0xFF0000, 3300.0));
    }

    public void addAnimal(Animal an)
    {
        zooDB.add(an);
        System.out.println("В зоопарке новое пополнение:");
        an.printInfo();
    }

    public void killAnimal(Integer index)
    {
        System.out.println("В зоопарке траур - с нами больше нет:");
        zooDB.get(index).printInfo();
        zooDB.remove(index);
    }

    public void getInfo(Integer index)
    {
        zooDB.get(index).printInfo();
    }

    public void kickAnimal(Integer index)
    {
        zooDB.get(index).makeSound();
    }

    public void printAllAnimals()
    {
        for (Animal an : zooDB)
        {
            an.printInfo();
            System.out.println("-----------------");
        }
    }

    public void kickAllAnimals()
    {
        for (Animal an : zooDB)
        {
            an.makeSound();
        }
    }

    public void doFly(Integer index)
    {
        if (zooDB.get(index) instanceof Bird)
            ((Bird) zooDB.get(index)).doFlight();
        else
            System.out.println("Это не птица!");
    }

    public void toShowKindness(Integer index)
    {
        if (zooDB.get(index) instanceof Pet)
            ((Pet) zooDB.get(index)).showKindness();
        else
            System.out.println("Это не домашний питомец!");
    }

    public void doTrain(Integer index)
    {
        if (zooDB.get(index) instanceof Dog)
        {
            System.out.println("Собака: " + (((Dog) zooDB.get(index)).isHasTraining() ? "" : "не") + "дрессирована");
            ((Dog) zooDB.get(index)).doTrain();
            System.out.println("Собака: " + (((Dog) zooDB.get(index)).isHasTraining() ? "" : "не") + "дрессирована");
        }
        else
            System.out.println("Данное животное не поддается тренировкам!");
    }
}
