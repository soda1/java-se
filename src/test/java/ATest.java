import org.junit.Test;

public class ATest {


    @Test
    public void test01() {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Math.round(-11.5));

    }

    @Test
    public void test02() {
        int i = -230;
        int i1 = 100;
        int i2 = 100;
        int i3 = -230;

        System.out.println(i == i3);
        System.out.println(i1 == i2);
    }
}
