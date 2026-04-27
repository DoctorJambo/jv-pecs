package core.mate.academy.service.producer.impl;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Machine> {
    private final List<Machine> trucks = new ArrayList<>();

    @Override
    public List<Machine> get() {
        Truck firstTruck = new Truck(false);
        firstTruck.setColor("Orange");
        firstTruck.setName("Dodge RAM");

        Truck secondTruck = new Truck(true);
        secondTruck.setColor("Blue");
        secondTruck.setName("Ford F-350");

        Truck thirdTruck = new Truck(false);
        thirdTruck.setColor("Black");
        thirdTruck.setName("Ford F-150");

        trucks.add(firstTruck);
        trucks.add(secondTruck);
        trucks.add(thirdTruck);

        return trucks;
    }
}
