package factoryExam;

public class CArFActory {
    public static CarWasher.AbstractCar getCar(String carName) {
        if (carName.equals("Bmw")) {
            return new BMW();
        } else {
            return null;
        }

    }
}
