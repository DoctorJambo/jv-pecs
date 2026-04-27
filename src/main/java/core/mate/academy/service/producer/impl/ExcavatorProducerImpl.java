package core.mate.academy.service.producer.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Machine> {
    private final List<Machine> excavators = new ArrayList<>();

    @Override
    public List<Machine> get() {
        Excavator firstExcavator = new Excavator(true);
        firstExcavator.setColor("Red");
        firstExcavator.setName("JCB");

        Excavator secondExcavator = new Excavator(false);
        secondExcavator.setColor("Blue");
        secondExcavator.setName("DT-150");

        Excavator thirdExcavator = new Excavator(true);
        thirdExcavator.setColor("Black");
        thirdExcavator.setName("JCB");

        excavators.add(firstExcavator);
        excavators.add(secondExcavator);
        excavators.add(thirdExcavator);

        return excavators;
    }
}
