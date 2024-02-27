package factoryExam;

public class BMW implements CarWasher.AbstractCar {
    @Override
    public void wash() {
        System.out.println("BMW wash");
    }
}
