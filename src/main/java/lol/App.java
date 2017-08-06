package lol;

import lol.Beans.Client;
import lol.Loggers.ConsoleEventLogger;
import lol.Loggers.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Violetta on 2017-08-06.
 */
public class App {

    private Client client;
    private EventLogger eventLogger;

    App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public App() {
    }

    public void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml"); // we create context ApplicationContext is interface) and show, where it should look for spring.xml file
        App app = (App) ctx.getBean("app"); // after that we get bean by bean name
        app.logEvent("Some event for 1");
        app.logEvent("Some event for 2");
    }
}