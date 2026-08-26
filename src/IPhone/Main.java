package IPhone;

public class Main {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        Apple apple = new Apple();
        unlock(samsung);
        unlock(apple);

    }

    public static void unlock(IPhone Iphone) {
        Iphone.unlock();

    }


}
