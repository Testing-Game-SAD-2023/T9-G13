import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionL1T0Test0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test1");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getMiddleName();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setOrganization("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test2");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getMiddleName();
        vCardBean0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test3");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getMiddleName();
        java.lang.String str3 = vCardBean0.getEmail();
        java.lang.String str4 = vCardBean0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test4");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getEmail();
        java.lang.String str3 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test5");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getMiddleName();
        vCardBean0.setLastName("hi!");
        vCardBean0.setFax("hi!");
        vCardBean0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }
}

