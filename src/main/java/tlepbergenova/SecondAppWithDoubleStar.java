package tlepbergenova;

import tlepbergenova.Utils.dummyUtils.ReadProducer;
import tlepbergenova.Utils.dummyUtils.WorkWithDummy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SecondAppWithDoubleStar {
    public static void main(String[] args) throws FileNotFoundException {
        ReadProducer producer = new ReadProducer();
        producer.setInfinity(true);
        InputStream is;
        if (args.length != 0) {
            is = new FileInputStream(args[0]);
        } else {
            ClassLoader classLoader = SecondAppWithStar.class.getClassLoader();
            is = classLoader.getResourceAsStream("messages.dat");
        }
        producer.setInputStream(is);

        WorkWithDummy.thread(producer, false);
    }
}
