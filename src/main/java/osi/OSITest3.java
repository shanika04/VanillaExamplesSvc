package osi;


import java.io.IOException;

public class OSITest3 {
    private static String command = "mkdir";


    public void test(String data) throws IOException, InterruptedException{
        /* POTENTIAL FLAW: command injection */
        Process process = Runtime.getRuntime().exec(command + data);
        process.waitFor();
    }
}