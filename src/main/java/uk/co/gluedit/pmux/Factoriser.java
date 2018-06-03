package uk.co.gluedit.pmux;

import java.util.Vector;

public class Factoriser {

    public Vector<Integer> factorise(Integer n) throws UndefinedException {
        Vector<Integer> factors = new Vector<>();
        if (n > 0) {
            factors.add(n);
            return  factors;
        }
        else
            throw new UndefinedException("Prime factorisation is only defined for positive integers.");
    }
}
