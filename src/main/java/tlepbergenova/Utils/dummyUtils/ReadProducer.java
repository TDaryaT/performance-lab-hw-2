package tlepbergenova.Utils.dummyUtils;

import ru.pflb.mq.dummy.interfaces.Producer;
import tlepbergenova.Utils.ListAddUtils;

import java.io.InputStream;
import java.util.List;

public class ReadProducer implements DummyProducer {

    private InputStream inputStream;

    private boolean isInfinity;

    public ReadProducer(InputStream inputStream) {
        this.inputStream = inputStream;
        this.isInfinity = false;
    }

    public ReadProducer() {
        this.isInfinity = false;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
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

        return ListAddUtils.addLines(inputStream);
    }
}