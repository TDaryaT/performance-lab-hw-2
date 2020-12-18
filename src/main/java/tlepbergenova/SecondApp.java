package tlepbergenova;

import tlepbergenova.Utils.dummyUtils.ReadProducer;
import tlepbergenova.Utils.dummyUtils.WorkWithDummy;

public class SecondApp {
    public static void main(String[] args) {
        WorkWithDummy.thread(new ReadProducer(), false);
    }
}