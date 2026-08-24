package IPhone;

public class Samsung implements IPhone, FingerPrint {
    @Override
    public void unlock() {
        System.out.println("Samsung unlocks");
    }
    @Override
    public void FingerPrint() {
        System.out.println("Samsung unlocks with Finger print");
    }
    @Override public void FaceID() {
        System.out.println("Samsung doesn`t have FaceID");
    }
}
