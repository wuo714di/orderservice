import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * @author changqing
 * @date 2019-09-17 11:04
 * @description:  测试UUID这个工具类，生成唯一的标识符，32位
 * 让分布式系统中的所有元素，都能有唯一的辨识信息，
 * 而不需要通过中央控制端来做辨识信息的指定。
 * 如此一来，每个人都可以创建不与其它人冲突的UUID
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UUIDDemo.class)
public class UUIDDemo {
    @Test
    public  void main() {
        String s = UUID.randomUUID().toString();
        System.out.println(s);

        System.out.println(s.replaceAll("-",""));
        System.out.println(s.replaceAll("-","").length());
    }
}
