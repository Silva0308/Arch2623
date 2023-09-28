package CarApp.Classes;

import java.awt.Color;

import CarApp.Enumerators.TypeCar;
import CarApp.Enumerators.TypeFuel;
import CarApp.Enumerators.TypeGearBox;
import CarApp.Intefaces.iRefueling;
import CarApp.Intefaces.iWiping;

public class Pickup extends Car implements iRefueling, iWiping{

    private int loadCapacity;

    public Pickup(String make, String model, Color color, int numberWheels, TypeFuel fuel,
            TypeGearBox gearbox, float engineCap, int loadCapacity) {
        super(make, model, color, TypeCar.PICKUP, numberWheels, fuel, gearbox, engineCap);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel(){
        System.out.println("Pickup fueling");
    }

    @Override
    public void wipWindshield() {
    }

    @Override
    public void wipHeadlights() {
    }

    @Override
    public void wipMirrors() {
    }
    
}
