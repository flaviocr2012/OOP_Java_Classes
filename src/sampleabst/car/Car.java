package sampleabst.car;

public abstract class Car {
    //1) Don't instantiate a new Car Class. -> You can't do this: Car Audi = new Car()
    //2) This class doesn't provide implementation for all methods

    protected int doors;

    public abstract void setDoors();


}
