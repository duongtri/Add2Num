import addtwonum.NumberException;
import addtwonum.IReceiver;
import addtwonum.MyBigNumber;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Hy's PC
 */
public class MyBigNumberTest implements IReceiver {

    public static int i = 1;

    public MyBigNumberTest() {
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test
    public void testSum1() {
        String str1 = "10";
        String str2 = "10";
        String expResult = "20";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum2() {
        String str1 = "99";
        String str2 = "99";
        String expResult = "198";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum3() {
        String str1 = "999";
        String str2 = "99";
        String expResult = "1098";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum4() {
        String str1 = "99";
        String str2 = "999";
        String expResult = "1098";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        assertEquals(expResult, result);

    }

    @Test
    public void testSum5() {
        expected.expect(NumberException.class);
        expected.expectMessage("3");
        String str1 = "21-";
        String str2 = "10";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
    }

    @Test
    public void testSum6() {
        expected.expect(NumberException.class);
        expected.expectMessage("1");
        String str1 = "21";
        String str2 = "";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
    }

    @Override
    public void send(String msg) {
        System.out.println("Case" + i + ":");
        i++;
    }

}
