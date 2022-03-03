package com.company;


public class Model extends Car {
    private String model;
    private Color color;

    public Model(String motor, String kkp, String model, Color color) {
        super(motor, kkp);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void signal(){
        System.out.println("бип бип");
    }

    public final void signal(String signal){
        System.out.println(signal);
    }

    public String getInfo() {
        return "\nMotor: " + getMotor() + "\nKPP: "+ getKkp() +  "\nModel: "  + model + "\nColor: " + color;
    }
}
