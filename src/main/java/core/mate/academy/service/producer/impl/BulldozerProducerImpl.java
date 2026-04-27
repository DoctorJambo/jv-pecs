package core.mate.academy.service.producer.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setColor("White");
        firstBulldozer.setName("JCB");
        firstBulldozer.setHasBlade(true);
        firstBulldozer.setTypeOfUndercarriage("Tracked undercarriage");

        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setColor("Blue");
        secondBulldozer.setName("DT-150");
        secondBulldozer.setHasBlade(false);
        secondBulldozer.setTypeOfUndercarriage("Wheeled undercarriage");

        Bulldozer thirdBulldozer = new Bulldozer();
        thirdBulldozer.setColor("Black");
        thirdBulldozer.setName("JCB");
        thirdBulldozer.setHasBlade(true);
        thirdBulldozer.setTypeOfUndercarriage("Wheeled undercarriage");

        bulldozers.add(firstBulldozer);
        bulldozers.add(secondBulldozer);
        bulldozers.add(thirdBulldozer);

        return bulldozers;
    }
}
