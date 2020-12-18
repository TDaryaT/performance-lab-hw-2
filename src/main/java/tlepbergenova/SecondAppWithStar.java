package tlepbergenova;

import tlepbergenova.Utils.dummyUtils.ReadProducer;
import tlepbergenova.Utils.dummyUtils.WorkWithDummy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SecondAppWithStar {
    public static void main(String[] args) throws FileNotFoundException {
        ReadProducer producer = new ReadProducer();
        if (args.length != 0) {
            producer.setInputStream(new FileInputStream(args[0]));
        }

        WorkWithDummy.thread(producer, false);
    }
}
