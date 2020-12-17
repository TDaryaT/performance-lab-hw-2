package tlepbergenova.dummyUtils;

import ru.pflb.mq.dummy.exception.DummyException;
import ru.pflb.mq.dummy.implementation.ConnectionImpl;
import ru.pflb.mq.dummy.interfaces.Connection;
import ru.pflb.mq.dummy.interfaces.Destination;
import ru.pflb.mq.dummy.interfaces.Producer;
import ru.pflb.mq.dummy.interfaces.Session;

import java.util.List;

interface DummyProducer extends Runnable{
    List<String> getMessages();

    @Override
    default void run() {
        try {
            // Create a Connection
            Connection connection = new ConnectionImpl();
            connection.start();

            // Create a Session
            Session session = connection.createSession(true);

            // Create the destination (Topic or Queue)
            Destination destination = session.createDestination("myQueue");

            // Create a MessageProducer from the Session to the Topic or Queue
            Producer producer = session.createProducer(destination);

            // Create a messages
            List<String> messages = getMessages();

            // Tell the producer to send the message
            for (String message : messages) {
                producer.send(message);
                Thread.sleep(2000);
            }

            // Clean up
            session.close();
            connection.close();
        } catch (DummyException | InterruptedException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
