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
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.moltiplicazione((int) (byte) 100, (-1));
        float float6 = calcolatrice0.divisione(10, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test3");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test4");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione((int) (byte) 100, (int) (byte) -1);
        int int6 = calcolatrice0.sottrazione((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3 == (-100.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test5");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma(10, (int) (short) 10);
        float float6 = calcolatrice0.divisione((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.03125f) + "'", float6 == (-0.03125f));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionL1T0Test0.test6");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.moltiplicazione((int) (short) 0, 20);
        int int6 = calcolatrice0.somma((int) '#', (int) (short) -1);
        int int9 = calcolatrice0.moltiplicazione(20, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }
}

