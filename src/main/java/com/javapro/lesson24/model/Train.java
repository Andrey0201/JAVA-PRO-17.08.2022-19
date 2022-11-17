package com.javapro.lesson24.model;

import com.javapro.lesson24.servise.Transport;

public class Train implements Transport {
    @Override
    public void cargoDelivery() {
        System.out.println("Cargo delivering by Train!!!");
    }
}
