package pathTraversal;

import java.io.File;

public class PTTest5 {
    private final String BASE_DIRECTORY = "/users/sk/profiles/";
    public void Test(String filename) {
        try {
            File myFile = new File(BASE_DIRECTORY + filename);
            delFile(myFile);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void delFile(File f) {
        f.delete();
    }
}