package factoryExam;

public class CarWasher {
    public static void main(String[] args) {
        AbstractCar car = CArFActory.getCar("Bmw");
        car.wash();
    }

    public  interface AbstractCar {
        public abstract void wash();
    }
}
