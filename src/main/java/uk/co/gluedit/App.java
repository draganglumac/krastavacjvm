package uk.co.gluedit;

import uk.co.gluedit.pmux.Factoriser;

public class App {

    public static void main(String[] args) {
        String input = args[0];
        System.out.println(PrimeMux.generate(input, new Factoriser()));
    }

}
