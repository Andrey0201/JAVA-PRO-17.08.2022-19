package com.javapro.lesson24.factory;

import com.javapro.lesson24.servise.Transport;
import com.javapro.lesson24.servise.TransportFactory;
import com.javapro.lesson24.model.Ship;

public class ShipFactory implements TransportFactory {
    @Override
    public Transport create() {
        return new Ship();
    }
}
