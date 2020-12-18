package tlepbergenova;

import tlepbergenova.Utils.dummyUtils.ReadProducer;
import tlepbergenova.Utils.dummyUtils.WorkWithDummy;

public class SecondAppWithDoubleStar {
    public static void main(String[] args) {
        ReadProducer producer = new ReadProducer();
        producer.setInfinity(true);
        if (args.length != 0) {
            producer.setPath(args[0]);
        }

        WorkWithDummy.thread(producer, false);
    }
}
