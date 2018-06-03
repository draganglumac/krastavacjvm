package uk.co.gluedit.pmux;

import java.util.Vector;
import static java.lang.Math.sqrt;

public class Factoriser {

    public Vector<Integer> factorise(Integer n) throws UndefinedException {
        if (n < 2)
            throw new UndefinedException("Prime factorisation is only defined for positive integers.");
        else
            return factorsFor(n);
    }

    private Vector<Integer> factorsFor(Integer n) {
        Vector<Integer> factors = new Vector<>();
        int divisor = 2;
        while (n > 1) {
            for ( ; n % divisor == 0; n /= divisor)
                factors.add(divisor);

            divisor++;
        }

        return factors;
    }

}
