import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionL2T0Test0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test02");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getOrganization();
        vCardBean0.setPhone("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test03");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.Class<?> wildcardClass4 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test04");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setMiddleName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test05");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setFormattedName("");
        java.lang.Class<?> wildcardClass6 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test06");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.toString();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test07");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getEmail();
        vCardBean0.setFormattedName("");
        vCardBean0.setOrganization("");
        vCardBean0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test08");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setPhone("");
        boolean boolean4 = vCardBean0.isValidVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test09");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getEmail();
        vCardBean0.setFax("");
        vCardBean0.setOrganization("");
        boolean boolean6 = vCardBean0.isValidVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test10");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setFax("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test11");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        java.lang.String str2 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test12");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("");
        boolean boolean7 = vCardBean0.isValidVCard();
        vCardBean0.setEmail("hi!");
        vCardBean0.setPhone("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test13");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setVCard("hi!");
        java.lang.String str4 = vCardBean0.getFax();
        java.lang.String str5 = vCardBean0.getFax();
        java.lang.String str6 = vCardBean0.getFormattedName();
        java.lang.String str7 = vCardBean0.getFormattedName();
        vCardBean0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test14");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getEmail();
        vCardBean0.setVCard("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test15");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        boolean boolean2 = vCardBean0.isValidVCard();
        vCardBean0.setMiddleName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test16");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test17");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test18");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        boolean boolean2 = vCardBean0.isValidVCard();
        vCardBean0.setOrganization("");
        java.lang.String str5 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test19");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getEmail();
        java.lang.Class<?> wildcardClass2 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test20");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getFirstName();
        java.lang.String str5 = vCardBean0.getLastName();
        java.lang.String str6 = vCardBean0.getFormattedName();
        java.lang.String str7 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test21");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setVCard("hi!");
        java.lang.String str4 = vCardBean0.getFax();
        java.lang.String str5 = vCardBean0.getFax();
        java.lang.String str6 = vCardBean0.getFax();
        vCardBean0.setPhone("hi!");
        java.lang.String str9 = vCardBean0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test22");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("");
        boolean boolean7 = vCardBean0.isValidVCard();
        vCardBean0.setOrganization("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test23");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setVCard("hi!");
        java.lang.String str4 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test24");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getEmail();
        vCardBean0.setFormattedName("");
        vCardBean0.setOrganization("");
        java.lang.String str6 = vCardBean0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test25");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        java.lang.String str5 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("");
        vCardBean0.setFax("");
        java.lang.String str10 = vCardBean0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test26");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setVCard("hi!");
        java.lang.String str4 = vCardBean0.getFax();
        java.lang.String str5 = vCardBean0.getFax();
        java.lang.String str6 = vCardBean0.getFax();
        vCardBean0.setPhone("hi!");
        vCardBean0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test27");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getEmail();
        vCardBean0.setMiddleName("hi!");
        vCardBean0.setFax("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test28");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        vCardBean0.setVCard("hi!");
        vCardBean0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test29");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        vCardBean0.setEmail("hi!");
        vCardBean0.setPhone("hi!");
        vCardBean0.setFax("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test30");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setFax("");
        vCardBean0.setPhone("");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test31");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        java.lang.String str5 = vCardBean0.getFax();
        java.lang.String str6 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test32");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        java.lang.String str5 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("");
        vCardBean0.setFax("");
        java.lang.String str10 = vCardBean0.getFax();
        java.lang.String str11 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test33");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setVCard("hi!");
        boolean boolean4 = vCardBean0.isValidVCard();
        java.lang.String str5 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test34");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        vCardBean0.setEmail("hi!");
        vCardBean0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test35");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getOrganization();
        java.lang.String str4 = vCardBean0.getMiddleName();
        vCardBean0.setTitle("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test36");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        boolean boolean2 = vCardBean0.isValidVCard();
        vCardBean0.setFirstName("hi!");
        vCardBean0.setFormattedName("");
        vCardBean0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test37");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setVCard("hi!");
        boolean boolean4 = vCardBean0.isValidVCard();
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.getMiddleName();
        java.lang.String str7 = vCardBean0.getTitle();
        java.lang.String str8 = vCardBean0.getFax();
        java.lang.String str9 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test38");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        boolean boolean2 = vCardBean0.isValidVCard();
        vCardBean0.setOrganization("");
        vCardBean0.setFormattedName("hi!");
        vCardBean0.setMiddleName("");
        java.lang.String str9 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test39");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setPhone("");
        java.lang.String str4 = vCardBean0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test40");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        java.lang.String str5 = vCardBean0.getMiddleName();
        java.lang.String str6 = vCardBean0.getLastName();
        java.lang.String str7 = vCardBean0.toString();
        vCardBean0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test41");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setFormattedName("");
        vCardBean0.setLastName("hi!");
        java.lang.String str8 = vCardBean0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test42");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        vCardBean0.setLastName("hi!");
        java.lang.String str5 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test43");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        vCardBean0.setEmail("hi!");
        vCardBean0.setPhone("hi!");
        vCardBean0.setTitle("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test44");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        boolean boolean2 = vCardBean0.isValidVCard();
        java.lang.String str3 = vCardBean0.getEmail();
        java.lang.String str4 = vCardBean0.toString();
        vCardBean0.setEmail("hi!");
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test45");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getFirstName();
        java.lang.String str5 = vCardBean0.getLastName();
        java.lang.String str6 = vCardBean0.getFormattedName();
        java.lang.String str7 = vCardBean0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test46");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getEmail();
        vCardBean0.setFax("");
        java.lang.String str4 = vCardBean0.getOrganization();
        vCardBean0.setPhone("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test47");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("");
        java.lang.String str7 = vCardBean0.getMiddleName();
        java.lang.String str8 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test48");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        java.lang.String str5 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("");
        java.lang.String str8 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test49");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getFormattedName();
        vCardBean0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test50");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        vCardBean0.setVCard("hi!");
        java.lang.String str7 = vCardBean0.getLastName();
        vCardBean0.setFirstName("hi!");
        java.lang.String str10 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test51");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setVCard("hi!");
        boolean boolean4 = vCardBean0.isValidVCard();
        java.lang.String str5 = vCardBean0.getFormattedName();
        java.lang.String str6 = vCardBean0.toString();
        java.lang.String str7 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test52");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        vCardBean0.setVCard("hi!");
        java.lang.String str4 = vCardBean0.getFax();
        java.lang.String str5 = vCardBean0.getFax();
        java.lang.String str6 = vCardBean0.getFax();
        vCardBean0.setPhone("hi!");
        boolean boolean9 = vCardBean0.isValidVCard();
        java.lang.String str10 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test53");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getFirstName();
        java.lang.String str5 = vCardBean0.getLastName();
        java.lang.String str6 = vCardBean0.getVCard();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test54");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getEmail();
        vCardBean0.setFax("");
        vCardBean0.setOrganization("");
        java.lang.String str6 = vCardBean0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test55");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getPhone();
        vCardBean0.setFormattedName("");
        vCardBean0.setLastName("hi!");
        java.lang.String str8 = vCardBean0.getEmail();
        vCardBean0.setEmail("");
        java.lang.String str11 = vCardBean0.getMiddleName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test56");
        VCardBean vCardBean0 = new VCardBean();
        vCardBean0.setPhone("");
        java.lang.String str3 = vCardBean0.getFirstName();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test57");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        java.lang.String str2 = vCardBean0.getOrganization();
        vCardBean0.setFormattedName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test58");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getEmail();
        vCardBean0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test59");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        java.lang.String str5 = vCardBean0.getMiddleName();
        vCardBean0.setTitle("hi!");
        java.lang.String str8 = vCardBean0.getMiddleName();
        vCardBean0.setLastName("");
        vCardBean0.setFax("");
        vCardBean0.setTitle("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test60");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        java.lang.String str5 = vCardBean0.getMiddleName();
        vCardBean0.setTitle("hi!");
        java.lang.String str8 = vCardBean0.getMiddleName();
        vCardBean0.setLastName("");
        vCardBean0.setFax("");
        vCardBean0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test61");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getLastName();
        java.lang.String str2 = vCardBean0.getOrganization();
        java.lang.String str3 = vCardBean0.getFormattedName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test62");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        java.lang.String str3 = vCardBean0.getPhone();
        java.lang.String str4 = vCardBean0.getMiddleName();
        vCardBean0.setMiddleName("");
        java.lang.String str7 = vCardBean0.getMiddleName();
        java.lang.Class<?> wildcardClass8 = vCardBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test63");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        vCardBean0.setPhone("");
        vCardBean0.setVCard("hi!");
        java.lang.String str7 = vCardBean0.getFax();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test64");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        vCardBean0.setEmail("hi!");
        vCardBean0.setEmail("");
        java.lang.String str7 = vCardBean0.getOrganization();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test65");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getPhone();
        java.lang.String str3 = vCardBean0.getOrganization();
        vCardBean0.setVCard("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test66");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        boolean boolean2 = vCardBean0.isValidVCard();
        java.lang.String str3 = vCardBean0.getEmail();
        java.lang.String str4 = vCardBean0.toString();
        vCardBean0.setVCard("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL2T0Test0.test67");
        VCardBean vCardBean0 = new VCardBean();
        java.lang.String str1 = vCardBean0.getFax();
        java.lang.String str2 = vCardBean0.getVCard();
        vCardBean0.setEmail("hi!");
        vCardBean0.setEmail("");
        vCardBean0.setFax("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }
}

