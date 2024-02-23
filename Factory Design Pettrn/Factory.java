
package factory;


public class Factory {

   
    public static void main(String[] args) {
   Car sedan = CarFactory.createCar("sedan");
        sedan.drive();  // Output: Driving a sedan car.
        
        Car suv = CarFactory.createCar("suv");
        suv.drive();    // Output: Driving an SUV car.
    }
}

    
