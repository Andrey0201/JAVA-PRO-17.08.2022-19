package com.javapro.lesson24;

import com.javapro.lesson24.factory.ShipFactory;
import com.javapro.lesson24.factory.TrainFactory;
import com.javapro.lesson24.factory.TruckFactory;
import com.javapro.lesson24.servise.Transport;
import com.javapro.lesson24.servise.TransportFactory;
import com.javapro.lesson24.servise.TransportType;
import lombok.NonNull;

public class DeliveryApp {
    public static void main(String[] args) {
        TransportFactory transportFactory = createTransportByType(TransportType.Ship);
        Transport transport = transportFactory.create();
        transport.cargoDelivery();
    }

    public static TransportFactory createTransportByType(@NonNull TransportType type) {
        TransportFactory transportFactory = null;
        switch (type) {
            case Train -> transportFactory = new TrainFactory();
            case Ship -> transportFactory = new ShipFactory();
            case Truck -> transportFactory = new TruckFactory();
        }
        return transportFactory;
    }

}