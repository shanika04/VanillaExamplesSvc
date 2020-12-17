package osi;


import java.io.IOException;

public class OSITest5 {
    private String data;


    public void test(String data) throws IOException, InterruptedException{
        this.data = data;
        doStuff("mkdir");
    }

    private void doStuff(String command) throws InterruptedException, IOException {
        /* POTENTIAL FLAW: command injection */
        Process process = Runtime.getRuntime().exec(command+data);
        process.waitFor();
    }
}