package tlepbergenova.Utils.dummyUtils;

import ru.pflb.mq.dummy.interfaces.Producer;
import tlepbergenova.Utils.ListAddUtils;

import java.util.List;

public class ReadProducer implements DummyProducer {

    private String path;

    private boolean isInfinity;

    public ReadProducer() {
        this.path = this.getClass()
                .getResource("/messages.dat")
                .getPath();
        this.isInfinity = false;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setInfinity(boolean infinity) {
        isInfinity = infinity;
    }

    @Override
    public void setMessages(Producer producer) {
        do {
            DummyProducer.super.setMessages(producer);
        } while (isInfinity);
    }

    @Override
    public List<String> getMessages() {

        return ListAddUtils.addLines(path);
    }
}