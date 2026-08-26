package HomeWork9;

import org.prog.session9.Car;

public class IPhone {
    public String brand;
    public String color;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IPhone) {
            IPhone Iphone = (IPhone) obj;
            boolean isEqual = this.color.equals(Iphone.color)
                    && this.brand.equals(Iphone.brand);
            return isEqual;
        }
        return false;

    }


    @Override
    public int hashCode() {
        return (this.color + this.brand).hashCode();
    }




}
