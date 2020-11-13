package kz.training.learn.collection.aircompany;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Airplane implements Setting{
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private long maxSpeed;
    private long rangeFlight;
    private int fuelConsumption;

    public Airplane(long maxSpeed, long rangeFlight, int fuelConsumption) {
        this.id = count.incrementAndGet();
        this.maxSpeed = maxSpeed;
        this.rangeFlight = rangeFlight;
        this.fuelConsumption = fuelConsumption;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    public long getRangeFlight() {
        return rangeFlight;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
