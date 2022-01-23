import com.designpatterns.creational.Factory.Vehicle;
import com.designpatterns.creational.Factory.VehicleFactory;
import com.designpatterns.creational.Factory.VehicleType;
import com.designpatterns.creational.Singleton.SingletonExample;

public class Main {

    public static void main(String[] args) {

        // Singleton
        SingletonExample singletonExample = SingletonExample.getSingletonObject();
        System.out.println(singletonExample.doSomething());

        // Factory
        Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR);
        Vehicle bike = VehicleFactory.getVehicle(VehicleType.BIKE);
        System.out.println(car.drive());
        System.out.println(bike.drive());

    }
}
