package tlepbergenova.dummyUtils;

import java.util.LinkedList;
import java.util.List;

public class WorkWithDummy {

    public static void thread(Runnable runnable, boolean daemon) {
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(daemon);
        brokerThread.start();
    }

    public static class OneTwoThreeProducer implements DummyProducer {
        @Override
        public List<String> getMessages() {
            List<String> messages = new LinkedList<>();
            messages.add("РАЗ");
            messages.add("ДВА");
            messages.add("ТРИ");
            return messages;
        }
    }

    public static class ReadProducer implements DummyProducer {
        @Override
        public List<String> getMessages() {
            return null;
        }
    }
}
