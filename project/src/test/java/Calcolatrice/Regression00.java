import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression00 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test002");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass7 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test003");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        java.lang.Class<?> wildcardClass7 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test004");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (short) -1, 101);
        int int6 = calcolatrice0.moltiplicazione((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test005");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        java.lang.Class<?> wildcardClass7 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test006");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        int int12 = calcolatrice0.sottrazione((-1), (-91));
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test007");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.moltiplicazione((-110), 10);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1100) + "'", int9 == (-1100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test008");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.moltiplicazione((int) (byte) 0, 32);
        int int12 = calcolatrice0.moltiplicazione((int) (byte) 0, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test009");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        float float12 = calcolatrice0.divisione((int) (byte) 1, (int) ' ');
        int int15 = calcolatrice0.sottrazione((int) (short) -1, 10);
        java.lang.Class<?> wildcardClass16 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.03125f + "'", float12 == 0.03125f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test010");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.somma((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test011");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        float float12 = calcolatrice0.divisione((-100), (int) (byte) 100);
        int int15 = calcolatrice0.moltiplicazione((-11), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1067) + "'", int15 == (-1067));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test012");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione(101, (-110));
        int int15 = calcolatrice0.somma(1000, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-11110) + "'", int12 == (-11110));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test013");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        float float6 = calcolatrice0.divisione(0, (int) ' ');
        int int9 = calcolatrice0.somma(0, (-11));
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-11) + "'", int9 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test014");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione(101, (-110));
        int int15 = calcolatrice0.somma(1000, (int) (short) 0);
        float float18 = calcolatrice0.divisione((-110), (-1067));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-11110) + "'", int12 == (-11110));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.10309278f + "'", float18 == 0.10309278f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test015");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione(32, 0);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test016");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        int int15 = calcolatrice0.somma(250, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 350 + "'", int15 == 350);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test017");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.03125f + "'", float3 == 0.03125f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test018");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.sottrazione(10, (int) '#');
        int int12 = calcolatrice0.sottrazione((-1099), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-25) + "'", int9 == (-25));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1100) + "'", int12 == (-1100));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test019");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test020");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        int int9 = calcolatrice0.moltiplicazione((int) (short) 10, 32);
        int int12 = calcolatrice0.sottrazione((-250), 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-360) + "'", int12 == (-360));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test021");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        int int18 = calcolatrice0.somma((-91), (int) '#');
        int int21 = calcolatrice0.moltiplicazione((-250), 320);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-56) + "'", int18 == (-56));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-80000) + "'", int21 == (-80000));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test022");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        float float6 = calcolatrice0.divisione(201, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-201.0f) + "'", float6 == (-201.0f));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test023");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((-9), (-91));
        java.lang.Class<?> wildcardClass4 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test024");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        int int18 = calcolatrice0.somma((-91), (int) '#');
        int int21 = calcolatrice0.somma((-2050), (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-56) + "'", int18 == (-56));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2049) + "'", int21 == (-2049));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test025");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma(82, 32);
        float float9 = calcolatrice0.divisione(0, 98);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test026");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((-68), (int) ' ');
        float float12 = calcolatrice0.divisione((-1099), (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2176) + "'", int9 == (-2176));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 22.428572f + "'", float12 == 22.428572f);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test027");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test028");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione((int) (byte) 10, 100);
        int int15 = calcolatrice0.moltiplicazione((-68), (-56));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3808 + "'", int15 == 3808);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test029");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        float float12 = calcolatrice0.divisione((-100), (int) (byte) 100);
        int int15 = calcolatrice0.moltiplicazione((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test030");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        int int6 = calcolatrice0.sottrazione((-18), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-19) + "'", int6 == (-19));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test031");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        int int12 = calcolatrice0.sottrazione(100, (-9));
        int int15 = calcolatrice0.somma((int) (short) 100, 101);
        java.lang.Class<?> wildcardClass16 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 201 + "'", int15 == 201);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test032");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        int int15 = calcolatrice0.somma(98, (-56));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test033");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        int int12 = calcolatrice0.somma((-11), 1000);
        float float15 = calcolatrice0.divisione((int) (short) 100, 320);
        int int18 = calcolatrice0.sottrazione((int) (byte) 100, (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 989 + "'", int12 == 989);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.3125f + "'", float15 == 0.3125f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 111 + "'", int18 == 111);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test034");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-9), 10);
        float float9 = calcolatrice0.divisione((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-100.0f) + "'", float9 == (-100.0f));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test035");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        int int12 = calcolatrice0.somma((-11), 1000);
        float float15 = calcolatrice0.divisione(320, (int) '#');
        int int18 = calcolatrice0.moltiplicazione((-8000), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 989 + "'", int12 == 989);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 9.142858f + "'", float15 == 9.142858f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8000) + "'", int18 == (-8000));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test036");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((-9), (-91));
        int int6 = calcolatrice0.sottrazione((-11), 0);
        float float9 = calcolatrice0.divisione((int) (byte) -1, (int) ' ');
        int int12 = calcolatrice0.sottrazione((-109), 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-11) + "'", int6 == (-11));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.03125f) + "'", float9 == (-0.03125f));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-118) + "'", int12 == (-118));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test037");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione((int) '4', 320);
        int int12 = calcolatrice0.somma((-110), (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.1625f + "'", float9 == 0.1625f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-111) + "'", int12 == (-111));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test038");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        int int12 = calcolatrice0.somma((-11), 1000);
        float float15 = calcolatrice0.divisione((int) (short) 100, 320);
        float float18 = calcolatrice0.divisione(3808, (-111));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 989 + "'", int12 == 989);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.3125f + "'", float15 == 0.3125f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-34.306305f) + "'", float18 == (-34.306305f));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test039");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        float float9 = calcolatrice0.divisione(0, (-1077));
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test040");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        float float9 = calcolatrice0.divisione((int) (short) 1, 0);
        int int12 = calcolatrice0.sottrazione((int) ' ', 100);
        int int15 = calcolatrice0.somma((-18), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-17) + "'", int15 == (-17));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test041");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((int) '#', (-9));
        java.lang.Class<?> wildcardClass16 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-3.8888888f) + "'", float15 == (-3.8888888f));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test042");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        float float12 = calcolatrice0.divisione((-100), (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test043");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test044");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        int int6 = calcolatrice0.sottrazione((int) 'a', (-1));
        int int9 = calcolatrice0.somma((int) (short) 0, (-9));
        int int12 = calcolatrice0.moltiplicazione((-100), 0);
        int int15 = calcolatrice0.moltiplicazione(989, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test045");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        int int12 = calcolatrice0.sottrazione((int) (byte) 100, 110);
        int int15 = calcolatrice0.moltiplicazione((-80000), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 80000 + "'", int15 == 80000);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test046");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((-9), (-91));
        int int6 = calcolatrice0.sottrazione((-11), 0);
        float float9 = calcolatrice0.divisione((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-11) + "'", int6 == (-11));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.03125f) + "'", float9 == (-0.03125f));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test047");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione((-47), (-1081));
        float float15 = calcolatrice0.divisione((-100), 98);
        int int18 = calcolatrice0.moltiplicazione(1, (-255397085));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50807 + "'", int12 == 50807);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0204082f) + "'", float15 == (-1.0204082f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-255397085) + "'", int18 == (-255397085));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test048");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.moltiplicazione((int) (byte) 0, 32);
        int int12 = calcolatrice0.somma((-2049), 1000);
        float float15 = calcolatrice0.divisione((-2049), (-255397120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1049) + "'", int12 == (-1049));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 8.0228E-6f + "'", float15 == 8.0228E-6f);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test049");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.somma((int) (short) 0, 320);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test050");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        int int12 = calcolatrice0.sottrazione(100, (-9));
        int int15 = calcolatrice0.somma((int) (short) 100, 101);
        int int18 = calcolatrice0.sottrazione(80000, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 201 + "'", int15 == 201);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 79900 + "'", int18 == 79900);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test051");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        int int18 = calcolatrice0.somma((-91), (int) '#');
        int int21 = calcolatrice0.somma((-2050), (int) (short) 1);
        int int24 = calcolatrice0.somma((-1067), (-28));
        float float27 = calcolatrice0.divisione(250, (-1077));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-56) + "'", int18 == (-56));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2049) + "'", int21 == (-2049));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1095) + "'", int24 == (-1095));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.23212628f) + "'", float27 == (-0.23212628f));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test052");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.somma((int) (short) 1, (int) (short) 100);
        int int12 = calcolatrice0.sottrazione((-1067), 10);
        int int15 = calcolatrice0.moltiplicazione(100, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1077) + "'", int12 == (-1077));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1000) + "'", int15 == (-1000));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test053");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        int int6 = calcolatrice0.moltiplicazione(50807, (-1049));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-53296543) + "'", int6 == (-53296543));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test054");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        int int12 = calcolatrice0.sottrazione((int) '#', 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-47) + "'", int12 == (-47));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test055");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione(201, 250);
        int int9 = calcolatrice0.somma(9, (-56));
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49) + "'", int6 == (-49));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-47) + "'", int9 == (-47));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test056");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.moltiplicazione((int) (byte) 100, (-68));
        int int9 = calcolatrice0.somma((-255397120), (int) '#');
        int int12 = calcolatrice0.moltiplicazione((-111), 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6800) + "'", int6 == (-6800));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-255397085) + "'", int9 == (-255397085));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-12654) + "'", int12 == (-12654));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test057");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.moltiplicazione((-110), 10);
        int int12 = calcolatrice0.moltiplicazione(80150, 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1100) + "'", int9 == (-1100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13865950 + "'", int12 == 13865950);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test058");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione(201, 250);
        int int9 = calcolatrice0.somma(109, (-6800));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49) + "'", int6 == (-49));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6691) + "'", int9 == (-6691));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test059");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.sottrazione(10, (int) '#');
        int int12 = calcolatrice0.moltiplicazione((-11110), (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-25) + "'", int9 == (-25));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99990 + "'", int12 == 99990);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test060");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((-2049), 109);
        int int18 = calcolatrice0.sottrazione((-1730), 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-18.798164f) + "'", float15 == (-18.798164f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1931) + "'", int18 == (-1931));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test061");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        int int6 = calcolatrice0.sottrazione((int) 'a', (-1));
        int int9 = calcolatrice0.somma((int) (short) 0, (-9));
        int int12 = calcolatrice0.somma(0, 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 250 + "'", int12 == 250);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test062");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione(32, 0);
        float float12 = calcolatrice0.divisione((int) (byte) 10, (int) 'a');
        int int15 = calcolatrice0.sottrazione((int) (short) -1, (-9));
        float float18 = calcolatrice0.divisione(173, 25);
        int int21 = calcolatrice0.somma((-100), 0);
        java.lang.Class<?> wildcardClass22 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.10309278f + "'", float12 == 0.10309278f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 6.92f + "'", float18 == 6.92f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test063");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((-2049), 109);
        java.lang.Class<?> wildcardClass16 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-18.798164f) + "'", float15 == (-18.798164f));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test064");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        int int6 = calcolatrice0.sottrazione((int) 'a', (-1));
        int int9 = calcolatrice0.sottrazione((int) (short) 0, (-250));
        int int12 = calcolatrice0.moltiplicazione(173, (-6800));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 250 + "'", int9 == 250);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1176400) + "'", int12 == (-1176400));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test065");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        int int12 = calcolatrice0.moltiplicazione(109, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109) + "'", int12 == (-109));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test066");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((int) (short) 1, 114);
        int int18 = calcolatrice0.sottrazione((-6691), 13865950);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.00877193f + "'", float15 == 0.00877193f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13872641) + "'", int18 == (-13872641));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test067");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione(101, (-110));
        int int15 = calcolatrice0.moltiplicazione((-2050), (-12654));
        java.lang.Class<?> wildcardClass16 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-11110) + "'", int12 == (-11110));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25940700 + "'", int15 == 25940700);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test068");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione(32, 0);
        float float12 = calcolatrice0.divisione((int) (byte) 10, (int) 'a');
        int int15 = calcolatrice0.sottrazione((int) (short) -1, (-9));
        int int18 = calcolatrice0.sottrazione(82, (-91));
        java.lang.Class<?> wildcardClass19 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.10309278f + "'", float12 == 0.10309278f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test069");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((-9), (-91));
        int int6 = calcolatrice0.moltiplicazione((-2176), (-1067));
        int int9 = calcolatrice0.moltiplicazione((-6800), (-1099));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2321792 + "'", int6 == 2321792);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7473200 + "'", int9 == 7473200);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test070");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        float float18 = calcolatrice0.divisione(25, 13865950);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.8029777E-6f + "'", float18 == 1.8029777E-6f);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test071");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.somma((int) (short) 1, (int) (short) 100);
        int int12 = calcolatrice0.sottrazione((-1067), 10);
        int int15 = calcolatrice0.moltiplicazione((-110), (-1077));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1077) + "'", int12 == (-1077));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 118470 + "'", int15 == 118470);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test072");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        float float6 = calcolatrice0.divisione(9, 320);
        int int9 = calcolatrice0.moltiplicazione((int) 'a', (-1099));
        int int12 = calcolatrice0.moltiplicazione((-68), 26);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.028125f + "'", float6 == 0.028125f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-106603) + "'", int9 == (-106603));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1768) + "'", int12 == (-1768));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test073");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        float float18 = calcolatrice0.divisione(201, (-1049));
        java.lang.Class<?> wildcardClass19 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-0.19161105f) + "'", float18 == (-0.19161105f));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test074");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((-17), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 83 + "'", int3 == 83);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test075");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione(32, 0);
        float float12 = calcolatrice0.divisione((int) (byte) 10, (int) 'a');
        int int15 = calcolatrice0.sottrazione((int) (short) -1, (-9));
        int int18 = calcolatrice0.sottrazione(82, (-91));
        float float21 = calcolatrice0.divisione(236, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.10309278f + "'", float12 == 0.10309278f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173 + "'", int18 == 173);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 23.6f + "'", float21 == 23.6f);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test076");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((-80000), (-1067));
        int int18 = calcolatrice0.sottrazione((-1099), (-18));
        int int21 = calcolatrice0.sottrazione(236, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 74.97657f + "'", float15 == 74.97657f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1081) + "'", int18 == (-1081));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 201 + "'", int21 == 201);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test077");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((-2049), 109);
        int int18 = calcolatrice0.somma((int) '#', (-10));
        int int21 = calcolatrice0.somma(0, (-1077));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-18.798164f) + "'", float15 == (-18.798164f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1077) + "'", int21 == (-1077));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test078");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        float float9 = calcolatrice0.divisione((int) (short) 1, 0);
        int int12 = calcolatrice0.somma(201, (int) '#');
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 236 + "'", int12 == 236);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test079");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        int int18 = calcolatrice0.somma((-80000), (-2176));
        int int21 = calcolatrice0.sottrazione(1100, (-6800));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-82176) + "'", int18 == (-82176));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7900 + "'", int21 == 7900);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test080");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.somma(79900, 250);
        int int12 = calcolatrice0.sottrazione(114, 320);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 80150 + "'", int9 == 80150);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-206) + "'", int12 == (-206));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test081");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        int int9 = calcolatrice0.somma((int) (short) 1, 7473200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7473201 + "'", int9 == 7473201);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test082");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        int int15 = calcolatrice0.sottrazione(100, (int) (byte) 10);
        int int18 = calcolatrice0.somma(989, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 90 + "'", int15 == 90);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 999 + "'", int18 == 999);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test083");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((-2049), 109);
        int int18 = calcolatrice0.moltiplicazione((-10), (-18));
        int int21 = calcolatrice0.moltiplicazione(83, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-18.798164f) + "'", float15 == (-18.798164f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 180 + "'", int18 == 180);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test084");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.somma((int) (short) 1, (int) (short) 100);
        int int12 = calcolatrice0.sottrazione(26, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test085");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        int int9 = calcolatrice0.moltiplicazione((int) (short) 10, 32);
        int int12 = calcolatrice0.somma((int) (short) 10, (int) (byte) -1);
        int int15 = calcolatrice0.somma(320, (-2050));
        java.lang.Class<?> wildcardClass16 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1730) + "'", int15 == (-1730));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test086");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione(32, 0);
        float float12 = calcolatrice0.divisione((int) (byte) 10, (int) 'a');
        int int15 = calcolatrice0.moltiplicazione((-110), 2321792);
        float float18 = calcolatrice0.divisione(1000, 2775);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.10309278f + "'", float12 == 0.10309278f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-255397120) + "'", int15 == (-255397120));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.36036035f + "'", float18 == 0.36036035f);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test087");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        float float9 = calcolatrice0.divisione((int) (short) 1, 0);
        int int12 = calcolatrice0.somma(250, (-1175));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-925) + "'", int12 == (-925));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test088");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        int int12 = calcolatrice0.moltiplicazione(0, (-82176));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test089");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((int) (short) 1, 114);
        float float18 = calcolatrice0.divisione(118470, (-1768));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.00877193f + "'", float15 == 0.00877193f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-67.00792f) + "'", float18 == (-67.00792f));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test090");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        int int9 = calcolatrice0.moltiplicazione((int) (short) 10, 32);
        int int12 = calcolatrice0.somma((int) (short) 10, (int) (byte) -1);
        int int15 = calcolatrice0.somma(0, 9);
        int int18 = calcolatrice0.moltiplicazione((-47), 25);
        int int21 = calcolatrice0.sottrazione((-1081), 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1175) + "'", int18 == (-1175));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1171) + "'", int21 == (-1171));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test091");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((-2049), 109);
        int int18 = calcolatrice0.somma(90, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-18.798164f) + "'", float15 == (-18.798164f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 89 + "'", int18 == 89);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test092");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        int int9 = calcolatrice0.moltiplicazione((int) (short) 10, 32);
        int int12 = calcolatrice0.somma((int) (short) 10, (-1175));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1165) + "'", int12 == (-1165));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test093");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione(8, 2321792);
        int int15 = calcolatrice0.moltiplicazione((-68), (-110));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 3.4456143E-6f + "'", float12 == 3.4456143E-6f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7480 + "'", int15 == 7480);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test094");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        int int18 = calcolatrice0.somma((-91), (int) '#');
        int int21 = calcolatrice0.somma((-2050), (int) (short) 1);
        int int24 = calcolatrice0.somma((-1067), (-28));
        float float27 = calcolatrice0.divisione((-109), (-6800));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-56) + "'", int18 == (-56));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2049) + "'", int21 == (-2049));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1095) + "'", int24 == (-1095));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.016029412f + "'", float27 == 0.016029412f);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test095");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        float float12 = calcolatrice0.divisione((-100), (int) (byte) 100);
        int int15 = calcolatrice0.somma(100, 1);
        int int18 = calcolatrice0.sottrazione((-360), (-1931));
        int int21 = calcolatrice0.moltiplicazione((-118), 50807);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1571 + "'", int18 == 1571);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5995226) + "'", int21 == (-5995226));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test096");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        int int12 = calcolatrice0.sottrazione((-255397085), (-1099));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-255395986) + "'", int12 == (-255395986));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test097");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (short) -1, 101);
        int int6 = calcolatrice0.somma((-9), (int) '#');
        int int9 = calcolatrice0.moltiplicazione(25, 111);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26 + "'", int6 == 26);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2775 + "'", int9 == 2775);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test098");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (short) -1, 101);
        int int6 = calcolatrice0.somma((-9), (int) '#');
        java.lang.Class<?> wildcardClass7 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26 + "'", int6 == 26);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test099");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-9), 10);
        int int9 = calcolatrice0.moltiplicazione(100, (-1));
        int int12 = calcolatrice0.moltiplicazione((-25), (int) (byte) 10);
        int int15 = calcolatrice0.somma((-68), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-250) + "'", int12 == (-250));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test100");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione(101, (-110));
        int int15 = calcolatrice0.somma((-925), 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-11110) + "'", int12 == (-11110));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-925) + "'", int15 == (-925));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test101");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        float float9 = calcolatrice0.divisione(10, 110);
        float float12 = calcolatrice0.divisione((-100), (int) (byte) 100);
        int int15 = calcolatrice0.somma(100, 1);
        int int18 = calcolatrice0.sottrazione((-360), (-1931));
        int int21 = calcolatrice0.moltiplicazione((-1099), (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.09090909f + "'", float9 == 0.09090909f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1571 + "'", int18 == 1571);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12089 + "'", int21 == 12089);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test102");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-9), 10);
        int int9 = calcolatrice0.moltiplicazione(100, (-1));
        int int12 = calcolatrice0.moltiplicazione((-25), (int) (byte) 10);
        float float15 = calcolatrice0.divisione(42, (-1099));
        int int18 = calcolatrice0.moltiplicazione(173, (-5995226));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-250) + "'", int12 == (-250));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.03821656f) + "'", float15 == (-0.03821656f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1037174098) + "'", int18 == (-1037174098));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test103");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        float float9 = calcolatrice0.divisione((int) (short) 1, 0);
        int int12 = calcolatrice0.sottrazione((int) ' ', 100);
        float float15 = calcolatrice0.divisione((-2049), 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-11.383333f) + "'", float15 == (-11.383333f));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test104");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        int int12 = calcolatrice0.somma((int) (short) 100, 1000);
        float float15 = calcolatrice0.divisione((-17), 98);
        float float18 = calcolatrice0.divisione((-1), 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1100 + "'", int12 == 1100);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1734694f) + "'", float15 == (-0.1734694f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-0.012048192f) + "'", float18 == (-0.012048192f));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test105");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        float float9 = calcolatrice0.divisione((int) (short) 1, 0);
        int int12 = calcolatrice0.sottrazione((int) ' ', 100);
        int int15 = calcolatrice0.sottrazione(1, 80150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-80149) + "'", int15 == (-80149));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test106");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        int int12 = calcolatrice0.sottrazione((-1), (-91));
        int int15 = calcolatrice0.moltiplicazione((-1049), 110);
        int int18 = calcolatrice0.moltiplicazione(236, (int) '#');
        int int21 = calcolatrice0.somma((-1067), (-2050));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-115390) + "'", int15 == (-115390));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8260 + "'", int18 == 8260);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3117) + "'", int21 == (-3117));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test107");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        int int6 = calcolatrice0.sottrazione((int) 'a', (-1));
        int int9 = calcolatrice0.somma((int) (short) 0, (-9));
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test108");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma(82, 32);
        int int9 = calcolatrice0.somma(201, 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 284 + "'", int9 == 284);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test109");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.somma(79900, 250);
        int int12 = calcolatrice0.sottrazione((-53296543), 571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 80150 + "'", int9 == 80150);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-53297114) + "'", int12 == (-53297114));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test110");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione(201, 250);
        int int9 = calcolatrice0.somma((-53297114), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49) + "'", int6 == (-49));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-53297014) + "'", int9 == (-53297014));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test111");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        float float6 = calcolatrice0.divisione((-110), (-106603));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.001031866f + "'", float6 == 0.001031866f);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test112");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione((-47), (-1081));
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50807 + "'", int12 == 50807);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test113");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((-9), 101);
        int int9 = calcolatrice0.sottrazione((-25), 0);
        int int12 = calcolatrice0.sottrazione((-18), (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-25) + "'", int9 == (-25));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-28) + "'", int12 == (-28));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test114");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        int int6 = calcolatrice0.somma(0, (-60));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-60) + "'", int6 == (-60));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test115");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test116");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((-2049), 109);
        int int18 = calcolatrice0.moltiplicazione((-10), (-18));
        int int21 = calcolatrice0.somma(32, (-92));
        int int24 = calcolatrice0.moltiplicazione((-12654), 1571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-18.798164f) + "'", float15 == (-18.798164f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 180 + "'", int18 == 180);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-60) + "'", int21 == (-60));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-19879434) + "'", int24 == (-19879434));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test117");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione((-47), (-1081));
        float float15 = calcolatrice0.divisione((-100), 98);
        float float18 = calcolatrice0.divisione(90, (-2049));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50807 + "'", int12 == 50807);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0204082f) + "'", float15 == (-1.0204082f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-0.043923866f) + "'", float18 == (-0.043923866f));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test118");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        float float12 = calcolatrice0.divisione((int) 'a', (-110));
        float float15 = calcolatrice0.divisione((-2049), 109);
        int int18 = calcolatrice0.moltiplicazione((-10), (-18));
        int int21 = calcolatrice0.somma((-1000), 1571);
        java.lang.Class<?> wildcardClass22 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.8818182f) + "'", float12 == (-0.8818182f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-18.798164f) + "'", float15 == (-18.798164f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 180 + "'", int18 == 180);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 571 + "'", int21 == 571);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test119");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.sottrazione((int) (short) 100, (-1));
        float float12 = calcolatrice0.divisione((int) (short) 100, 0);
        float float15 = calcolatrice0.divisione((-11), 110);
        int int18 = calcolatrice0.somma((-91), (int) '#');
        int int21 = calcolatrice0.somma((-2050), (int) (short) 1);
        int int24 = calcolatrice0.sottrazione((-111), (-19));
        float float27 = calcolatrice0.divisione((-5995226), (-47));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.1f) + "'", float15 == (-0.1f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-56) + "'", int18 == (-56));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2049) + "'", int21 == (-2049));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-92) + "'", int24 == (-92));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 127558.0f + "'", float27 == 127558.0f);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test120");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-1100), 1);
        int int9 = calcolatrice0.somma((-100), 82);
        int int12 = calcolatrice0.sottrazione((int) '4', (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1099) + "'", int6 == (-1099));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-18) + "'", int9 == (-18));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test121");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        int int9 = calcolatrice0.moltiplicazione((int) (short) 10, 32);
        int int12 = calcolatrice0.somma(98, 1);
        int int15 = calcolatrice0.sottrazione((-6800), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6835) + "'", int15 == (-6835));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test122");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.somma((int) (short) 1, (int) (short) 100);
        int int12 = calcolatrice0.sottrazione((-1067), 10);
        int int15 = calcolatrice0.somma(0, 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1077) + "'", int12 == (-1077));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 173 + "'", int15 == 173);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test123");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        float float9 = calcolatrice0.divisione((int) (short) 1, 0);
        int int12 = calcolatrice0.sottrazione((int) ' ', 100);
        int int15 = calcolatrice0.moltiplicazione((-206), 0);
        int int18 = calcolatrice0.sottrazione(350, (-47));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 397 + "'", int18 == 397);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test124");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.somma((int) (byte) 1, (int) (short) 100);
        float float6 = calcolatrice0.divisione((int) '4', 0);
        int int9 = calcolatrice0.moltiplicazione((int) ' ', (int) (short) 1);
        int int12 = calcolatrice0.sottrazione(100, (-9));
        int int15 = calcolatrice0.moltiplicazione(7480, (-80149));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-599514520) + "'", int15 == (-599514520));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test125");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-9), 10);
        java.lang.Class<?> wildcardClass7 = calcolatrice0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test126");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (byte) 10, 100);
        int int9 = calcolatrice0.moltiplicazione((int) (byte) 0, 32);
        int int12 = calcolatrice0.somma((-2049), 1000);
        int int15 = calcolatrice0.sottrazione(0, (-1176400));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1049) + "'", int12 == (-1049));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1176400 + "'", int15 == 1176400);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test127");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.sottrazione((int) (byte) 10, 101);
        int int9 = calcolatrice0.moltiplicazione((int) (short) 10, 32);
        int int12 = calcolatrice0.somma((int) (short) 10, (int) (byte) -1);
        int int15 = calcolatrice0.sottrazione((int) (short) 0, 80000);
        float float18 = calcolatrice0.divisione(8260, 989);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-91) + "'", int6 == (-91));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-80000) + "'", int15 == (-80000));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 8.351871f + "'", float18 == 8.351871f);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test128");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-9), 10);
        int int9 = calcolatrice0.moltiplicazione((-25), 82);
        int int12 = calcolatrice0.sottrazione((int) (short) -1, (-91));
        int int15 = calcolatrice0.moltiplicazione(320, (-25));
        int int18 = calcolatrice0.sottrazione((-68), 180);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2050) + "'", int9 == (-2050));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 90 + "'", int12 == 90);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8000) + "'", int15 == (-8000));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-248) + "'", int18 == (-248));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test129");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((int) (short) 10, 0);
        int int9 = calcolatrice0.sottrazione((int) (short) -1, (int) (short) 0);
        int int12 = calcolatrice0.moltiplicazione(101, (-110));
        float float15 = calcolatrice0.divisione(110, (int) '#');
        int int18 = calcolatrice0.somma((-25), (-1099));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-11110) + "'", int12 == (-11110));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 3.142857f + "'", float15 == 3.142857f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1124) + "'", int18 == (-1124));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test130");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-1100), 1);
        int int9 = calcolatrice0.somma((-100), 82);
        int int12 = calcolatrice0.sottrazione((-6835), 0);
        int int15 = calcolatrice0.moltiplicazione((-100), 320);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1099) + "'", int6 == (-1099));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-18) + "'", int9 == (-18));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6835) + "'", int12 == (-6835));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-32000) + "'", int15 == (-32000));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test131");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        float float3 = calcolatrice0.divisione(10, (int) (byte) 10);
        int int6 = calcolatrice0.somma((-9), 10);
        int int9 = calcolatrice0.moltiplicazione(100, (-1));
        int int12 = calcolatrice0.moltiplicazione((-25), (int) (byte) 10);
        float float15 = calcolatrice0.divisione(110, (-1077));
        int int18 = calcolatrice0.sottrazione(99, (-1165));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-250) + "'", int12 == (-250));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.10213556f) + "'", float15 == (-0.10213556f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1264 + "'", int18 == 1264);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression00.test132");
        Calcolatrice calcolatrice0 = new Calcolatrice();
        int int3 = calcolatrice0.sottrazione((int) (byte) 1, (int) (byte) 10);
        int int6 = calcolatrice0.moltiplicazione((int) (byte) 100, (-68));
        int int9 = calcolatrice0.somma((-111), 1100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6800) + "'", int6 == (-6800));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 989 + "'", int9 == 989);
    }
}

