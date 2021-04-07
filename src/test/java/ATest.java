import org.junit.Test;

public class ATest {


    @Test
    public void test01() {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Math.round(-11.5));

    }

    @Test
    public void test02() {
        //基本类型缓存
        Integer i = -123;
        Integer i1 = -123;
        Integer i2 = 330;
        Integer i4 = 330;
        System.out.println(i == i1);
        System.out.println(i2 == i4);
    }
}
