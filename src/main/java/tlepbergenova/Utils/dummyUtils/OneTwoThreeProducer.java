package tlepbergenova.Utils.dummyUtils;

import java.util.LinkedList;
import java.util.List;

public class OneTwoThreeProducer implements DummyProducer {
    @Override
    public List<String> getMessages() {
        List<String> messages = new LinkedList<>();
        messages.add("РАЗ");
        messages.add("ДВА");
        messages.add("ТРИ");
        return messages;
    }
}
