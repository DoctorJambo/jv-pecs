package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producer.impl.BulldozerProducerImpl;
import core.mate.academy.service.producer.impl.ExcavatorProducerImpl;
import core.mate.academy.service.producer.impl.TruckProducerImpl;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        BulldozerProducerImpl bulldozerProducer = new BulldozerProducerImpl();
        ExcavatorProducerImpl excavatorProducer = new ExcavatorProducerImpl();
        TruckProducerImpl truckProducer = new TruckProducerImpl();

        if (type == Bulldozer.class) {
            List<Machine> bulldozer = new ArrayList<>();
            bulldozer.addAll(bulldozerProducer.get());
            return bulldozer;
        }

        if (type == Excavator.class) {
            List<Machine> excavator = new ArrayList<>();
            excavator.addAll(excavatorProducer.get());
            return excavator;
        }

        if (type == Truck.class) {
            List<Machine> trucks = new ArrayList<>();
            trucks.addAll(truckProducer.get());
            return trucks;
        }

        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
