package uk.co.gluedit.pmux;

import java.util.Vector;

public class Factoriser {

    public Vector<Integer> factorise(Integer n) throws UndefinedException {
        if (n < 2)
            throw new UndefinedException("Prime factorisation is only defined for positive integers.");
        else
            return factorsFor(n);
    }

    Vector<Integer> factorsFor(Integer n) {
        Vector<Integer> factors = new Vector<>();

        for (int divisor = 2; n > 1; divisor++)
            for ( ; n % divisor == 0; n /= divisor)
                factors.add(divisor);

        return factors;
    }

}
