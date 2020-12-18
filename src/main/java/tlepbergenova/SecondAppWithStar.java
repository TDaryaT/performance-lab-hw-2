package tlepbergenova;

import tlepbergenova.Utils.ListAddUtils;
import tlepbergenova.Utils.dummyUtils.DummyProducer;
import tlepbergenova.Utils.dummyUtils.ReadProducer;
import tlepbergenova.Utils.dummyUtils.WorkWithDummy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SecondAppWithStar {
    public static void main(String[] args) throws FileNotFoundException {

        ReadProducer producer = new ReadProducer();
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
