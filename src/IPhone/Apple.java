package IPhone;

public class Apple implements IPhone, FaceID {
    @Override
    public void unlock() {
        System.out.println("Apple unlocks");
    }
    @Override
    public void FaceID() {
        System.out.println("Apple unlocks with FaceID");
    }
    @Override
    public void FingerPrint() {
        System.out.println("Apple does not have FingerPrint");
    }

}
