package uk.co.gluedit.pmux;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FactoriserTest {
    private Factoriser f;

    private List<Integer> list(int... ints) {
        List<Integer> l = new ArrayList<>();
        for(int i : ints)
            l.add(i);
        return l;
    }

    @Before
    public void setUp() {
        f = new Factoriser();
    }

    @Test
    public void test_2() {
        assertEquals(f.factorsFor(2), list(2));
    }

    @Test
    public void test_3() {
        assertEquals(f.factorsFor(3), list(3));
    }

    @Test
    public void test_4() {
        assertEquals(f.factorsFor(4), list(2, 2));
    }

    @Test
    public void test_5() {
        assertEquals(f.factorsFor(5), list(5));
    }

    @Test
    public void test_6() {
        assertEquals(f.factorsFor(6), list(2, 3));
    }

    @Test
    public void test_7() {
        assertEquals(f.factorsFor(7), list(7));
    }

    @Test
    public void test_8() {
        assertEquals(f.factorsFor(8), list(2, 2, 2));
    }

    @Test
    public void test_9() {
        assertEquals(f.factorsFor(9), list(3, 3));
    }

    @Test
    public void test_10() {
        assertEquals(f.factorsFor(10), list(2, 5));
    }

    @Test
    public void test_11() {
        assertEquals(f.factorsFor(11), list(11));
    }

    @Test
    public void test_12() {
        assertEquals(f.factorsFor(12), list(2, 2, 3));
    }

    @Test
    public void test_13() {
        assertEquals(f.factorsFor(13), list(13));
    }

    @Test
    public void test_14() {
        assertEquals(f.factorsFor(14), list(2, 7));
    }

    @Test
    public void test_15() {
        assertEquals(f.factorsFor(15), list(3, 5));
    }

    @Test
    public void test_16() {
        assertEquals(f.factorsFor(16), list(2, 2, 2, 2));
    }

    @Test
    public void test_17() {
        assertEquals(f.factorsFor(17), list(17));
    }

    @Test
    public void test_18() {
        assertEquals(f.factorsFor(18), list(2, 3, 3));
    }

    @Test
    public void test_19() {
        assertEquals(f.factorsFor(19), list(19));
    }

    @Test
    public void test_20() {
        assertEquals(f.factorsFor(20), list(2, 2, 5));
    }

    @Test
    public void test_21() {
        assertEquals(f.factorsFor(21), list(3, 7));
    }

    @Test
    public void test_22() {
        assertEquals(f.factorsFor(22), list(2, 11));
    }

}
