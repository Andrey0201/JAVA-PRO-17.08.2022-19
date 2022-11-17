package com.javapro.lesson24.factory;

import com.javapro.lesson24.model.Truck;
import com.javapro.lesson24.servise.Transport;
import com.javapro.lesson24.servise.TransportFactory;

public class TruckFactory implements TransportFactory {
    @Override
    public Transport create() {
        return new Truck();
    }
}
