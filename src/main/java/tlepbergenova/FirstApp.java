package tlepbergenova;

import tlepbergenova.Utils.dummyUtils.OneTwoThreeProducer;
import tlepbergenova.Utils.dummyUtils.WorkWithDummy;

public class FirstApp {
    public static void main(String[] args) {
        WorkWithDummy.thread(new OneTwoThreeProducer(), false);
    }
}
