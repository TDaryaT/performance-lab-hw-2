package tlepbergenova;

import tlepbergenova.dummyUtils.WorkWithDummy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi maven!");
        WorkWithDummy.thread(new WorkWithDummy.OneTwoThreeProducer(), false);
    }
}
