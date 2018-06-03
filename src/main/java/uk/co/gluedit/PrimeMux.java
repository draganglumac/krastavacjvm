package uk.co.gluedit;

import uk.co.gluedit.pmux.Factoriser;
import uk.co.gluedit.pmux.UndefinedException;

public class PrimeMux {

    public static String generate(String input, Factoriser f) { // inject factoriser
        try {
            Integer n = Integer.parseInt(input);
            String result = "";

            for (Integer i : f.factorise(n))
                if (result.length() == 0) {
                    result = i.toString();
                }
                else {
                    result = result + " * " + i.toString();
                }
            return result;
        } catch (NumberFormatException | UndefinedException _) {
            return "undefined";
        }
    }

}
