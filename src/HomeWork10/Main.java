package HomeWork10;

public class Main {

    public static void main(String[] args) {
        try {
            IPhone apple1 = new IPhone();
            IPhone android1 = new IPhone();


            apple1.color = "white";
            apple1.brand = "Apple";


            android1.color = null;
            android1.brand = "Android";

            System.out.println(apple1.hashCode());
            System.out.println(android1.hashCode());

            System.out.println(apple1.equals(android1));


        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }
}
//TODO: 1. Write your own exception that extends RuntimeException
//      2. In equals AND hashCode if phone has null color or null model -> throw your exception
//      3. In public static void main - catch your exception