package kz.training.learn.collection.aircompany;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airport {
    List<Airplane> airport  = new ArrayList(){{
            ;
            add(new CargoPlane(900, 8000, 2009, 350));
            add(new PassengerPlane(920, 300, 9000, 480));
            add(new CargoPlane(850, 11000, 1649, 450));
            add(new PassengerPlane(920, 280, 10000, 520));
            add(new CargoPlane(700, 7000, 1260, 340));
            add(new PassengerPlane(920, 220, 12000, 600));
            add(new CargoPlane(800, 7900, 649, 400));
            add(new PassengerPlane(880, 240, 10500, 380));
        }};

    public int getFullCapacity(){
        int fullCapacity = 0;
        for (Airplane airplane : airport){
            if(airplane instanceof PassengerPlane)
                fullCapacity += ((PassengerPlane) airplane).getCapacity();
        }
        return fullCapacity;
    }
    public double getFullCarrying(){
        int fullCarrying = 0;
        
        for (Airplane airplane : airport){
            if(airplane instanceof CargoPlane)
                fullCarrying += ((CargoPlane) airplane).getCarrying();
        }
        return fullCarrying;
    }
    public void sortRangeFlight(){

        airport.sort(Comparator.comparingLong(Airplane ::getRangeFlight));
    }

    public List<Airplane> rangeFuelConsumption(int minConsumption, int maxConsumption){

        List<Airplane> airplanes = new ArrayList<>();

        for (Airplane airplane : airport){

            if (airplane.getFuelConsumption() >= minConsumption &&
            airplane.getFuelConsumption() <= maxConsumption){
                airplanes.add(airplane);
            }
        }
        return  airplanes;
    }
    public void printList(){
        airport.forEach(System.out ::println);
    }
}
