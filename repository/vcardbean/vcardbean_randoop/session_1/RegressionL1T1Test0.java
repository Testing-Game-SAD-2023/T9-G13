import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionL1T1Test0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T1Test0.test1");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setVCard("hi!");
        vCardBean0.setVCard("");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T1Test0.test2");
        VCardBean vCardBean0 = new VCardBean();
        boolean boolean1 = vCardBean0.isValidVCard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T1Test0.test3");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setLastName("hi!");
        vCardBean0.setTitle("");
        java.lang.String str5 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T1Test0.test4");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        java.lang.String str2 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T1Test0.test5");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFormattedName("hi!");
    }
}

