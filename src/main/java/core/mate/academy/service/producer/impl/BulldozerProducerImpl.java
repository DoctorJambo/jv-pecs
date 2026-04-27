package core.mate.academy.service.producer.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Machine> {
    private final List<Machine> bulldozers = new ArrayList<>();

    @Override
    public List<Machine> get() {
        Bulldozer firstBulldozer = new Bulldozer(true, "Tracked undercarriage");
        firstBulldozer.setColor("White");
        firstBulldozer.setName("JCB");

        Bulldozer secondBulldozer = new Bulldozer(false, "Wheeled undercarriage");
        secondBulldozer.setColor("Blue");
        secondBulldozer.setName("DT-150");

        Bulldozer thirdBulldozer = new Bulldozer(true, "Wheeled undercarriage");
        thirdBulldozer.setColor("Black");
        thirdBulldozer.setName("JCB");

        bulldozers.add(firstBulldozer);
        bulldozers.add(secondBulldozer);
        bulldozers.add(thirdBulldozer);

        return bulldozers;
    }
}
