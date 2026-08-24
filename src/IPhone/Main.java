package IPhone;

public class Main {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        Apple apple = new Apple();
        unlock(samsung);
        unlock(apple);
        FaceID(apple);
        FingerPrint(samsung);

    }

    public static void unlock(IPhone Iphone) {
        Iphone.unlock();

    }

    public static void FaceID(Apple FaceID) {
        FaceID.FaceID();
    }

    public static void FingerPrint(Samsung FingerPrint) {
        FingerPrint.FingerPrint();
    }
}
