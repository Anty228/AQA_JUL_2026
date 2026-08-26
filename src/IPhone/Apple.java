package IPhone;

public class Apple implements IPhone {
    @Override
    public void unlock() {
        System.out.println("Apple unlocks with FaceID");
    }

}
