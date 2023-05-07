import exercises.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Zoo myZoo = new Zoo();
        Scanner scan = new Scanner(System.in);
        System.out.print("Меню: \n" +
        "1 - добавить  новое животное в зоопарк, \n" +
                "2 - убрать животные из зоопарка, \n" +
                "3 - информацию о конкретном животном(введите его номер), \n" +
                "4 - заставить животное издать звук(введите номер животного)\n" +
                "5 - информация о всех животных в зоопарке на данный момент, \n" +
                "6 - заставить всех животных издать звук, \n" +
                "7 - проверка на полёт животного, \n" +
                "8 - погладить, \n" +
                "9 - дрессировать. \n" +
                "Введите команду: ");
        int ex = scan.nextInt();
        switch (ex)
        {
            case 1:
                myZoo.addAnimal(new Chicken(25.1, 1.9, 0xFF0000));
                break;
            case 2:
                System.out.println("Кого уберём из зоопарка? ");
                ex = scan.nextInt();
                myZoo.killAnimal(ex);
                break;
            case 3:
                System.out.println("Какое животное нас интересует? ");
                ex = scan.nextInt();
                myZoo.getInfo(ex);
                break;
            case 4:
                System.out.println("Какое животное заставить издать звук? ");
                ex = scan.nextInt();
                myZoo.kickAnimal(ex);
                break;
            case 5:
                myZoo.printAllAnimals();
                break;
            case 6:
                myZoo.kickAllAnimals();
                break;
            case 7:
                System.out.println("Какое животное проверить на полёт? ");
                ex = scan.nextInt();
                myZoo.doFly(ex);
                break;
            case 8:
                System.out.println("К какому животному проявить ласку? ");
                ex = scan.nextInt();
                myZoo.toShowKindness(ex);
                break;
            case 9:
                System.out.println("Кого будем дрессировать? ");
                ex = scan.nextInt();
                myZoo.doTrain(ex);
                break;

        }

    }
}