package HomeWork9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IPhone apple1 = new IPhone();
        IPhone apple2 = new IPhone();
        IPhone apple3 = new IPhone();
        IPhone android1 = new IPhone();
        IPhone android2 = new IPhone();
        IPhone android3 = new IPhone();



        apple1.color = "white";
        apple1.brand = "Apple";

        apple2.color = "golden";
        apple2.brand = "Apple";

        apple3.color = "white";
        apple3.brand = "Apple";

        android1.color = "green";
        android1.brand = "Android";

        android2.color = "green";
        android2.brand = "Android";

        android3.color = "black";
        android3.brand = "Android";


        System.out.println(apple1.hashCode());
        System.out.println(apple2.hashCode());
        System.out.println(apple3.hashCode());
        System.out.println(android1.hashCode());
        System.out.println(android2.hashCode());
        System.out.println(android3.hashCode());

        System.out.println(apple1.equals(android1));
        System.out.println(android1 == android2);
        System.out.println(apple1 == apple3);
        System.out.println(apple2.equals(apple3));
        System.out.println(android2.equals(android3));




    }
}
//TODO: For class Android and Apple, add color, model;
//TODO: add equals and hascode for both
//TODO: compare green android vs white apple
//TODO: compare green android vs another green android
//TODO: compare white apple vs another white apple
//TODO: compare golden apple vs another white apple
//TODO: compare black android vs green android