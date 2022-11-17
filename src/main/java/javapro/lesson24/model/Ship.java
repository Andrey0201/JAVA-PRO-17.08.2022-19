package javapro.lesson24.model;

import javapro.lesson24.servise.Transport;

public class Ship implements Transport {
    @Override
    public void cargoDelivery() {
        System.out.println("Cargo delivering by Ship!!!");
    }
}
