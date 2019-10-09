import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author changqing
 * @date 2019-09-20 09:10
 * @description:
 */
@SpringBootTest(classes = JodaTimeDemo.class)
@RunWith(SpringRunner.class)
public class JodaTimeDemo {
    private final Logger logger= LoggerFactory.getLogger(JodaTimeDemo.class);
    @Test
    public void demoTest(){
        DateTime dateTime =new DateTime();
        logger.info(dateTime.toString());

    }
}
