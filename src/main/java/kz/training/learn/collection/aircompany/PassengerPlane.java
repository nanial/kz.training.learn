package kz.training.learn.collection.aircompany;


public class PassengerPlane extends Airplane {

    private int capacity;

    public PassengerPlane(long maxSpeed, int capacity, long rangeFlight, int fuel) {
        super(maxSpeed, rangeFlight, fuel);
        this.capacity = capacity;
    }

    @Override
    public void start() {

    }

    @Override
    public void landing() {

    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public long getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public long getRangeFlight() {
        return super.getRangeFlight();
    }

    public int getFuelConsumption(){
        return super.getFuelConsumption();
    }
    @Override
    public String toString() {
        return "PassengerPlane{"+ " id = "  + super.getId() +
                " capacity=" + getCapacity() + " MaxSpeed = " + getMaxSpeed() +
                " RangeFlight = " + getRangeFlight() +
                " FuelConsumption = " + getFuelConsumption() +
                '}';
    }
}
