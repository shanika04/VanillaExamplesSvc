package deserialization;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;
import java.io.ObjectInputStream;
import org.xml.sax.helpers.XMLReaderFactory;


public class Test3 {
    public void test(File file) throws IOException, InterruptedException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        castingMethod(in);
        in.close();
    }

    private void castingMethod(ObjectInputStream objInStream) throws IOException, ClassNotFoundException {
        XMLReaderFactory xmlParser = (XMLReaderFactory) objInStream.readObject();
        XMLReaderFactory xmlParser_two = (XMLReaderFactory) xmlParser;
    }
}