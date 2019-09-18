import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author changqing
 * @date 2019-09-18 10:46
 * @description: 正则表达式是判断是否符合命名规则。
 */
@SpringBootTest(classes = MatchDemo.class)
@RunWith(SpringRunner.class)
public class MatchDemo {
    @Test
    public void match(){
        String  s ="WB0056!!";
        boolean matches = s.matches("[A-Z0-9]+");
        System.out.println(matches);

    }
}
