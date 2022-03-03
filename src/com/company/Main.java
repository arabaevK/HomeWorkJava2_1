package com.company;

public class Main {

    public static void main(String[] args) {
        Model model = new Model("1", "1", "1,", Color.BLACK);
        System.out.println(model.getInfo());
        BMW bmw = new BMW("V8", "Mechanic", "E60", Color.BLACK, 3.6, 2005);
        System.out.println(bmw.getInfo());
        bmw.signal("бип");
    }
}
