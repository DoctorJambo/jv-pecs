package core.mate.academy.service.producer.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private final List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        firstTruck.setColor("Orange");
        firstTruck.setName("Dodge RAM");
        firstTruck.setHasTrailer(true);

        Truck secondTruck = new Truck();
        secondTruck.setColor("Blue");
        secondTruck.setName("Ford F-350");
        secondTruck.setHasTrailer(true);

        Truck thirdTruck = new Truck();
        thirdTruck.setColor("Black");
        thirdTruck.setName("Ford F-150");
        thirdTruck.setHasTrailer(false);

        trucks.add(firstTruck);
        trucks.add(secondTruck);
        trucks.add(thirdTruck);

        return trucks;
    }
}
