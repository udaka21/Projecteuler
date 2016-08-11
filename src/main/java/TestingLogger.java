import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Created by udaka on 8/4/16.
 */
public class TestingLogger {
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(TestingLogger.class.getName());

    public static void main(String[] args) throws IOException, SQLException {
       // log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    }
}
