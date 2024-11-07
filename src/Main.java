import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //todo       MyClass деген класс тузунуз
//         Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//         Параметри эки башка болгон эки конструктор тузунуз
//         MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//         Эки объектке эки башка конструктор иштесин.
//         Объекттердин маанилерин консольго чыгарыныз.

        MyClass myClass3 = new MyClass();
        myClass3.name = "Nurjigit";
        myClass3.lastname = "Toktomushev";
        myClass3.food = "Burger";
        myClass3.hobby = "Football";

        String[] lessons = {"OOP", "Conditional operators", "Data types"};
        MyClass myClass1 = new MyClass("Guljamal", "Janybekova", LocalDate.of(1991, 6, 15), "plov", lessons);

        String[] lessons2 = {"Marketing", "Ekonomika"};
        MyClass myClass2 = new MyClass("Burmagul", "Janybekova", LocalDate.of(1997, 8, 9), "Sea foods", "Singing", lessons2);

        MyClass[] sisters = {myClass1, myClass2, myClass3};
        for (MyClass sister : sisters) {
            System.out.println("Aty:" + sister.name + "\n Familia: " + sister.lastname + "\n Jashy: " + sister.getAge() + "\n Jakshy korgon tamak: " + sister.food + "\n  Hobby: " + sister.hobby + "\n Sabaktar1: " + Arrays.toString(sister.lessons) + Arrays.toString(sister.lessons2));
        }


    }


}

