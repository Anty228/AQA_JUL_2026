package HomeWork10;

public class IPhone {
    public String brand;
    public String color;

    @Override
    public boolean equals(Object obj) {

        if (color == null) {
            throw new MyException("Color is null");
        }

        if (obj instanceof IPhone) {
            IPhone iphone = (IPhone) obj;

            return this.color.equals(iphone.color);
        }

        return false;
    }

    @Override
    public int hashCode() {

        if (color == null) {
            throw new MyException("Color is null");
        }

        return (this.color + this.brand).hashCode();
    }
}


