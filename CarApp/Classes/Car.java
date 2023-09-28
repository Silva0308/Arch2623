package CarApp.Classes;

import java.awt.*;

import CarApp.Enumerators.TypeCar;
import CarApp.Enumerators.TypeFuel;
import CarApp.Enumerators.TypeGearBox;;

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuel;
    private TypeGearBox gearbox;
    private float engineCap;

    public Car(String make,
               String model,
               Color color,
               TypeCar bodyType,
               int numberWheels,
               TypeFuel fuel,
               TypeGearBox gearbox,
               float engineCap) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.engineCap = engineCap;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }

    public TypeGearBox getGearbox() {
        return gearbox;
    }

    public void setGearbox(TypeGearBox gearbox) {
        this.gearbox = gearbox;
    }

    public float getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(float engineCap) {
        this.engineCap = engineCap;
    }

    public void movement() {
    }

    public void maintenance() {
    }

    public boolean turnLights() {
        return true;
    }

    public boolean trnWrpps() {
        return true;
    }

    
}
