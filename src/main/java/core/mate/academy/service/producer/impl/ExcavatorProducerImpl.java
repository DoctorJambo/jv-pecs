package core.mate.academy.service.producer.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        firstExcavator.setColor("Red");
        firstExcavator.setName("JCB");
        firstExcavator.setHasBucket(true);

        Excavator secondExcavator = new Excavator();
        secondExcavator.setColor("Blue");
        secondExcavator.setName("DT-150");
        secondExcavator.setHasBucket(false);

        Excavator thirdExcavator = new Excavator();
        thirdExcavator.setColor("Black");
        thirdExcavator.setName("JCB");
        thirdExcavator.setHasBucket(false);

        excavators.add(firstExcavator);
        excavators.add(secondExcavator);
        excavators.add(thirdExcavator);

        return excavators;
    }
}
