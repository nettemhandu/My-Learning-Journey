package za.co.simulation;

import java.security.cert.CertPathBuilderResult;

public class Main {
    public static void main(String[] args) {
        Playground playground1 = new Playground();
        String result = playground1.reverseWord("Hello");
        System.out.println(result);
    }
}