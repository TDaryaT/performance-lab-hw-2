package tlepbergenova;

import tlepbergenova.Utils.dummyUtils.ReadProducer;
import tlepbergenova.Utils.dummyUtils.WorkWithDummy;

import java.io.InputStream;

public class SecondApp {
    public static void main(String[] args) {
        ClassLoader classLoader = SecondAppWithStar.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("messages.dat");
        ReadProducer producer = new ReadProducer();
        producer.setInputStream(is);
        WorkWithDummy.thread(producer, false);
    }
}