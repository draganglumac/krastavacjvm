package uk.co.gluedit;

import uk.co.gluedit.pmux.Factoriser;
import uk.co.gluedit.pmux.UndefinedException;

public class PrimeMux {

    public static String generate(String input, Factoriser f) { // inject factoriser
        try {
            Integer n = Integer.parseInt(input);
            return f.factorise(n).firstElement().toString();
        }
        catch (NumberFormatException | UndefinedException _) {
            return "undefined";
        }
    }


}
