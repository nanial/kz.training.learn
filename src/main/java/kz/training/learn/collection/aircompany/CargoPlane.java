package kz.training.learn.collection.aircompany;

import java.util.Comparator;

public class CargoPlane extends Airplane {
    private double carrying;

    public CargoPlane(long maxSpeed,long rangeFlight, double carrying, int fuel) {
        super(maxSpeed,rangeFlight, fuel);
        this.carrying = carrying;
    }

    @Override
    public void start() {

    }

    @Override
    public void landing() {

    }

    public long getMaxSpeed() {
        return super.getMaxSpeed();
    }

    public double getCarrying() {
        return carrying;
    }

    public long getRangeFlight() {
        return super.getRangeFlight();
    }

    @Override
    public String toString() {
        return "CargoPlane{" + " id = " + super.getId() +
                "carrying =" + getCarrying() + " MaxSpeed = " + getMaxSpeed() +
                " RangeFlight = " + getRangeFlight() +
                " FuelConsumption = " + getFuelConsumption() +
                '}';
    }

}
