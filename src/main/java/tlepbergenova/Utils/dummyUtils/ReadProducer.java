package tlepbergenova.Utils.dummyUtils;

import ru.pflb.mq.dummy.interfaces.Producer;
import tlepbergenova.Utils.ListAddUtils;

import java.io.InputStream;
import java.util.List;

public class ReadProducer implements DummyProducer {

    /**
     * inputStream with messages
     */
    private InputStream inputStream;

    /**
     * isInfinity true, if we read the file infinitely
     */
    private boolean isInfinity;

    public ReadProducer() {
        this.inputStream = ReadProducer
                .class
                .getClassLoader()
                .getResourceAsStream("messages.dat");
        this.isInfinity = false;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void setInfinity(boolean infinity) {
        isInfinity = infinity;
    }

    @Override
    public void setMessages(Producer producer, List<String> messages) {
        do {
            DummyProducer.super.setMessages(producer, messages);
        } while (isInfinity);
    }

    @Override
    public List<String> getMessages() {
        return ListAddUtils.addLines(inputStream);
    }
}