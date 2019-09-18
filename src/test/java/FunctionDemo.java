import com.yun.order.service.FunctionCompute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.function.Function;

/**
 * @author changqing
 * @date 2019-09-18 11:17
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FunctionCompute.class)
public class FunctionDemo {
    @Autowired
    private FunctionCompute functionCompute;
    /**
    *
    * @throws
    * @author changqing
    * @data 2019/9/18 14:29
    * @descript: lambada表达式，来实现函数式接口，
    */
    @Test
    public void compute(){
        int compute = functionCompute.compute(5, (Integer value) -> value *5);
        System.out.println(new Date(System.currentTimeMillis())+":计算的结果为："+compute);
    }

}
