
package factory;


public class CarFactory  {
        public static Car createCar(String type) {
        if (type.equalsIgnoreCase("sedan")) {
            return new Sedan();
        } else if (type.equalsIgnoreCase("suv")) {
            return new SUV();
        } else {
            throw new IllegalArgumentException("Invalid car type.");
        }
    }
}
