import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionL3T0Test0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test002");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test003");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.Class<?> wildcardClass3 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test004");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        vCardBean0.setFax("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test005");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        java.lang.String str2 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test006");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getOrganization();
        java.lang.Class<?> wildcardClass4 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test007");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getOrganization();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test008");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test009");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        java.lang.String str4 = vCardBean0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test010");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getOrganization();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test011");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getTitle();
        java.lang.String str6 = vCardBean0.getVCard();
        vCardBean0.setOrganization("hi!");
        java.lang.String str9 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test012");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setOrganization("hi!");
        java.lang.String str8 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test013");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getOrganization();
        java.lang.String str4 = vCardBean0.getOrganization();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test014");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getPhone();
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFirstName();
        vCardBean0.setOrganization("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test015");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setMiddleName("hi!");
        vCardBean0.setFirstName("");
        java.lang.String str7 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test016");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setFormattedName("");
        vCardBean0.setMiddleName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test017");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setEmail("");
        vCardBean0.setFormattedName("hi!");
        java.lang.String str7 = vCardBean0.getFormattedName();
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test018");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getVCard();
        vCardBean0.setMiddleName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test019");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test020");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setPhone("hi!");
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test021");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setEmail("");
        vCardBean0.setFormattedName("hi!");
        java.lang.String str7 = vCardBean0.getFormattedName();
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test022");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getOrganization();
        java.lang.String str5 = vCardBean0.getOrganization();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test023");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getOrganization();
        vCardBean0.setFax("");
        vCardBean0.setPhone("hi!");
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test024");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        vCardBean0.setFax("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test025");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getTitle();
        vCardBean0.setLastName("");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test026");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setEmail("hi!");
        java.lang.String str5 = vCardBean0.getMiddleName();
        java.lang.String str6 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test027");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        java.lang.String str2 = vCardBean0.getOrganization();
        vCardBean0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test028");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getVCard();
        java.lang.String str2 = vCardBean0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test029");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        vCardBean0.setFax("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test030");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setEmail("hi!");
        java.lang.String str5 = vCardBean0.getMiddleName();
        java.lang.String str6 = vCardBean0.getMiddleName();
        vCardBean0.setFormattedName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test031");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test032");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getPhone();
        vCardBean0.setEmail("");
        java.lang.String str10 = vCardBean0.getPhone();
        vCardBean0.setFormattedName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test033");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getTitle();
        vCardBean0.setFormattedName("");
        vCardBean0.setLastName("hi!");
        java.lang.String str6 = vCardBean0.getTitle();
        vCardBean0.setMiddleName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test034");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getOrganization();
        vCardBean0.setFax("");
        java.lang.String str6 = vCardBean0.getFormattedName();
        java.lang.String str7 = vCardBean0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test035");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getTitle();
        vCardBean0.setFormattedName("");
        vCardBean0.setVCard("hi!");
        java.lang.String str6 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test036");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getLastName();
        vCardBean0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test037");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setPhone("hi!");
        java.lang.String str6 = vCardBean0.getFirstName();
        java.lang.String str7 = vCardBean0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test038");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setFormattedName("");
        java.lang.String str5 = vCardBean0.getFirstName();
        java.lang.String str6 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test039");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFirstName();
        java.lang.String str6 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test040");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getFormattedName();
        vCardBean0.setTitle("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test041");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setMiddleName("hi!");
        java.lang.String str5 = vCardBean0.getLastName();
        java.lang.String str6 = vCardBean0.getOrganization();
        vCardBean0.setEmail("hi!");
        java.lang.String str9 = vCardBean0.getEmail();
        java.lang.String str10 = vCardBean0.getFax();
        vCardBean0.setFax("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test042");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getTitle();
        vCardBean0.setEmail("hi!");
        java.lang.String str4 = vCardBean0.getFormattedName();
        vCardBean0.setMiddleName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test043");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getOrganization();
        vCardBean0.setFax("");
        java.lang.String str6 = vCardBean0.getFormattedName();
        java.lang.Class<?> wildcardClass7 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test044");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setEmail("hi!");
        java.lang.String str5 = vCardBean0.getFax();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test045");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test046");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.Class<?> wildcardClass9 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test047");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getLastName();
        java.lang.String str4 = vCardBean0.getEmail();
        vCardBean0.setLastName("hi!");
        java.lang.String str7 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test048");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setPhone("hi!");
        java.lang.String str6 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test049");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getFirstName();
        java.lang.String str4 = vCardBean0.getFormattedName();
        java.lang.String str5 = vCardBean0.getOrganization();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test050");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        vCardBean0.setOrganization("hi!");
        java.lang.String str4 = vCardBean0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test051");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getVCard();
        vCardBean0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test052");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFirstName();
        java.lang.String str12 = vCardBean0.getFirstName();
        vCardBean0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test053");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        vCardBean0.setLastName("hi!");
        java.lang.String str7 = vCardBean0.getFax();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test054");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setTitle("");
        vCardBean0.setFirstName("");
        vCardBean0.setMiddleName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test055");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getPhone();
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFirstName();
        vCardBean0.setTitle("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test056");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setEmail("");
        vCardBean0.setFormattedName("hi!");
        java.lang.String str7 = vCardBean0.getFormattedName();
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test057");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        java.lang.String str4 = vCardBean0.getFirstName();
        java.lang.String str5 = vCardBean0.getTitle();
        vCardBean0.setLastName("hi!");
        java.lang.String str8 = vCardBean0.getEmail();
        vCardBean0.setFormattedName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test058");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getOrganization();
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test059");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setOrganization("hi!");
        java.lang.String str8 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test060");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setMiddleName("hi!");
        vCardBean0.setFirstName("");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test061");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getPhone();
        vCardBean0.setEmail("");
        vCardBean0.setTitle("hi!");
        java.lang.String str12 = vCardBean0.getFax();
        vCardBean0.setOrganization("hi!");
        boolean boolean15 = vCardBean0.isValidVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test062");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setMiddleName("hi!");
        java.lang.String str5 = vCardBean0.getLastName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test063");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        vCardBean0.setEmail("hi!");
        java.lang.String str11 = vCardBean0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test064");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFirstName();
        java.lang.String str12 = vCardBean0.getTitle();
        vCardBean0.setPhone("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test065");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getLastName();
        java.lang.String str4 = vCardBean0.getEmail();
        vCardBean0.setVCard("");
        vCardBean0.setFormattedName("hi!");
        boolean boolean9 = vCardBean0.isValidVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test066");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFirstName();
        java.lang.String str12 = vCardBean0.getFirstName();
        java.lang.String str13 = vCardBean0.getPhone();
        java.lang.String str14 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test067");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFirstName();
        java.lang.String str12 = vCardBean0.getMiddleName();
        boolean boolean13 = vCardBean0.isValidVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test068");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getOrganization();
        java.lang.String str4 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test069");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        vCardBean0.setFirstName("hi!");
        java.lang.String str6 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test070");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        vCardBean0.setTitle("");
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test071");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getOrganization();
        vCardBean0.setFormattedName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test072");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getPhone();
        vCardBean0.setTitle("");
        java.lang.String str10 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test073");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getPhone();
        vCardBean0.setEmail("");
        java.lang.String str10 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test074");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        vCardBean0.setPhone("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test075");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test076");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setPhone("hi!");
        java.lang.String str6 = vCardBean0.getFormattedName();
        java.lang.Class<?> wildcardClass7 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test077");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        vCardBean0.setFirstName("hi!");
        java.lang.String str6 = vCardBean0.getMiddleName();
        java.lang.Class<?> wildcardClass7 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test078");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setEmail("");
        vCardBean0.setFormattedName("hi!");
        java.lang.String str7 = vCardBean0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test079");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getLastName();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test080");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getTitle();
        vCardBean0.setTitle("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test081");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setMiddleName("hi!");
        java.lang.String str5 = vCardBean0.getLastName();
        java.lang.String str6 = vCardBean0.getOrganization();
        vCardBean0.setEmail("hi!");
        java.lang.String str9 = vCardBean0.getEmail();
        vCardBean0.setFax("");
        java.lang.String str12 = vCardBean0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test082");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getTitle();
        vCardBean0.setEmail("hi!");
        vCardBean0.setMiddleName("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test083");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        vCardBean0.setOrganization("hi!");
        java.lang.String str4 = vCardBean0.getFirstName();
        java.lang.String str5 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test084");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getVCard();
        java.lang.String str8 = vCardBean0.getTitle();
        java.lang.String str9 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test085");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        java.lang.String str4 = vCardBean0.getFirstName();
        java.lang.String str5 = vCardBean0.getTitle();
        vCardBean0.setLastName("hi!");
        java.lang.String str8 = vCardBean0.getEmail();
        java.lang.String str9 = vCardBean0.getFormattedName();
        java.lang.String str10 = vCardBean0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test086");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getFirstName();
        java.lang.String str4 = vCardBean0.getFormattedName();
        java.lang.String str5 = vCardBean0.getTitle();
        java.lang.String str6 = vCardBean0.getFirstName();
        vCardBean0.setOrganization("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test087");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFirstName();
        java.lang.String str12 = vCardBean0.getFirstName();
        java.lang.String str13 = vCardBean0.getPhone();
        vCardBean0.setMiddleName("hi!");
        java.lang.String str16 = vCardBean0.getOrganization();
        vCardBean0.setTitle("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test088");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getTitle();
        java.lang.String str6 = vCardBean0.getVCard();
        vCardBean0.setOrganization("hi!");
        vCardBean0.setFax("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test089");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFirstName();
        boolean boolean6 = vCardBean0.isValidVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test090");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        vCardBean0.setFirstName("hi!");
        boolean boolean11 = vCardBean0.isValidVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test091");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getTitle();
        vCardBean0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test092");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test093");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setFirstName("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test094");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getLastName();
        java.lang.String str3 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test095");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setPhone("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test096");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setMiddleName("hi!");
        java.lang.String str5 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test097");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setTitle("");
        vCardBean0.setOrganization("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test098");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getLastName();
        java.lang.String str4 = vCardBean0.getFax();
        vCardBean0.setTitle("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test099");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        java.lang.String str4 = vCardBean0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test100");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getVCard();
        java.lang.String str11 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test101");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        java.lang.String str2 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        vCardBean0.setPhone("hi!");
        java.lang.String str7 = vCardBean0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test102");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setPhone("hi!");
        java.lang.String str6 = vCardBean0.getFormattedName();
        java.lang.String str7 = vCardBean0.getMiddleName();
        java.lang.Class<?> wildcardClass8 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test103");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getTitle();
        java.lang.String str6 = vCardBean0.getVCard();
        java.lang.String str7 = vCardBean0.toString();
        java.lang.String str8 = vCardBean0.getOrganization();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test104");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getVCard();
        java.lang.String str8 = vCardBean0.getVCard();
        java.lang.Class<?> wildcardClass9 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test105");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getOrganization();
        vCardBean0.setFax("");
        java.lang.String str6 = vCardBean0.getFormattedName();
        vCardBean0.setTitle("hi!");
        java.lang.String str9 = vCardBean0.getOrganization();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test106");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getTitle();
        vCardBean0.setFirstName("");
        vCardBean0.setMiddleName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test107");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setMiddleName("hi!");
        java.lang.String str5 = vCardBean0.getLastName();
        java.lang.String str6 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test108");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getFirstName();
        java.lang.String str4 = vCardBean0.getFormattedName();
        java.lang.String str5 = vCardBean0.getTitle();
        java.lang.String str6 = vCardBean0.getFirstName();
        vCardBean0.setEmail("hi!");
        vCardBean0.setPhone("");
        java.lang.String str11 = vCardBean0.getTitle();
        java.lang.String str12 = vCardBean0.getFirstName();
        java.lang.String str13 = vCardBean0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test109");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getFormattedName();
        vCardBean0.setFormattedName("hi!");
        java.lang.String str7 = vCardBean0.getFax();
        java.lang.String str8 = vCardBean0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test110");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        vCardBean0.setFirstName("hi!");
        vCardBean0.setLastName("hi!");
        java.lang.String str8 = vCardBean0.getEmail();
        vCardBean0.setTitle("");
        vCardBean0.setOrganization("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test111");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFirstName();
        java.lang.String str12 = vCardBean0.getFirstName();
        boolean boolean13 = vCardBean0.isValidVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test112");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getTitle();
        vCardBean0.setFormattedName("");
        java.lang.String str4 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test113");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getTitle();
        vCardBean0.setFormattedName("");
        vCardBean0.setLastName("hi!");
        java.lang.String str6 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test114");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        vCardBean0.setEmail("hi!");
        java.lang.String str11 = vCardBean0.getFax();
        java.lang.String str12 = vCardBean0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test115");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        vCardBean0.setEmail("hi!");
        vCardBean0.setTitle("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test116");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getTitle();
        vCardBean0.setFirstName("");
        vCardBean0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test117");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setEmail("");
        vCardBean0.setFormattedName("hi!");
        java.lang.String str7 = vCardBean0.getFormattedName();
        java.lang.String str8 = vCardBean0.getFirstName();
        vCardBean0.setPhone("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test118");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test119");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        java.lang.String str8 = vCardBean0.getFirstName();
        java.lang.String str9 = vCardBean0.getFax();
        java.lang.String str10 = vCardBean0.getVCard();
        java.lang.String str11 = vCardBean0.getFax();
        java.lang.String str12 = vCardBean0.getFirstName();
        vCardBean0.setVCard("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test120");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setPhone("hi!");
        java.lang.String str6 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test121");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setPhone("hi!");
        java.lang.String str6 = vCardBean0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test122");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getTitle();
        java.lang.String str6 = vCardBean0.getVCard();
        java.lang.String str7 = vCardBean0.toString();
        java.lang.String str8 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test123");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFirstName();
        java.lang.String str6 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test124");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        vCardBean0.setEmail("");
        vCardBean0.setMiddleName("hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test125");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setFormattedName("");
        java.lang.String str5 = vCardBean0.getFirstName();
        vCardBean0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test126");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        java.lang.String str2 = vCardBean0.getFormattedName();
        vCardBean0.setFax("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test127");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getTitle();
        java.lang.String str6 = vCardBean0.getVCard();
        java.lang.String str7 = vCardBean0.getVCard();
        vCardBean0.setFax("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test128");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getTitle();
        vCardBean0.setFormattedName("");
        vCardBean0.setLastName("hi!");
        java.lang.String str6 = vCardBean0.getTitle();
        java.lang.String str7 = vCardBean0.toString();
        vCardBean0.setTitle("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test129");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setEmail("hi!");
        java.lang.String str5 = vCardBean0.getMiddleName();
        java.lang.String str6 = vCardBean0.getMiddleName();
        java.lang.String str7 = vCardBean0.getMiddleName();
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test130");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getLastName();
        java.lang.String str4 = vCardBean0.getEmail();
        vCardBean0.setVCard("");
        vCardBean0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test131");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        java.lang.String str2 = vCardBean0.getFormattedName();
        vCardBean0.setFirstName("");
        vCardBean0.setPhone("hi!");
        vCardBean0.setFormattedName("");
        vCardBean0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test132");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        java.lang.String str5 = vCardBean0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test133");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        java.lang.String str3 = vCardBean0.getLastName();
        java.lang.String str4 = vCardBean0.getEmail();
        vCardBean0.setVCard("");
        vCardBean0.setFormattedName("hi!");
        vCardBean0.setMiddleName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test134");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        vCardBean0.setLastName("hi!");
        java.lang.String str7 = vCardBean0.getFirstName();
        java.lang.String str8 = vCardBean0.getMiddleName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test135");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        vCardBean0.setLastName("hi!");
        vCardBean0.setMiddleName("");
        vCardBean0.setVCard("hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test136");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getVCard();
        java.lang.String str8 = vCardBean0.getTitle();
        vCardBean0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test137");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setMiddleName("hi!");
        vCardBean0.setFirstName("");
        java.lang.String str7 = vCardBean0.getFax();
        vCardBean0.setMiddleName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test138");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setFormattedName("");
        vCardBean0.setOrganization("");
        java.lang.String str7 = vCardBean0.getLastName();
        java.lang.String str8 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test139");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getPhone();
        vCardBean0.setTitle("");
        vCardBean0.setFax("hi!");
        java.lang.String str12 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test140");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setPhone("hi!");
        java.lang.String str6 = vCardBean0.getFormattedName();
        java.lang.String str7 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test141");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        vCardBean0.setFirstName("hi!");
        java.lang.String str6 = vCardBean0.getVCard();
        vCardBean0.setTitle("");
        java.lang.String str9 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test142");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.toString();
        vCardBean0.setMiddleName("hi!");
        java.lang.String str5 = vCardBean0.getLastName();
        java.lang.String str6 = vCardBean0.getOrganization();
        vCardBean0.setEmail("hi!");
        java.lang.String str9 = vCardBean0.getEmail();
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFirstName();
        java.lang.String str12 = vCardBean0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test143");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        java.lang.String str7 = vCardBean0.getPhone();
        vCardBean0.setEmail("");
        vCardBean0.setTitle("hi!");
        java.lang.String str12 = vCardBean0.getFax();
        java.lang.String str13 = vCardBean0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test144");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFirstName();
        java.lang.String str2 = vCardBean0.getTitle();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getOrganization();
        vCardBean0.setTitle("");
        java.lang.String str9 = vCardBean0.getVCard();
        java.lang.String str10 = vCardBean0.getVCard();
        java.lang.String str11 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test145");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFirstName("hi!");
        vCardBean0.setEmail("");
        java.lang.String str7 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test146");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getEmail();
        vCardBean0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL3T0Test0.test147");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("hi!");
        vCardBean0.setFirstName("hi!");
        vCardBean0.setFirstName("hi!");
        java.lang.String str8 = vCardBean0.getOrganization();
        vCardBean0.setVCard("");
        vCardBean0.setTitle("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }
}

