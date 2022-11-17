package javapro.lesson24.factory;

import javapro.lesson24.servise.Transport;
import javapro.lesson24.servise.TransportFactory;
import javapro.lesson24.model.Train;

public class TrainFactory implements TransportFactory {
    @Override
    public Transport create() {
        return new Train();
    }
}