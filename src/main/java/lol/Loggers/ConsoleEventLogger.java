package lol.Loggers;

/**
 * Created by Violetta on 2017-08-06.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(String msg) {
        System.out.println(msg);
    }

}
