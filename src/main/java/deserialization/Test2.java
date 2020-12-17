package deserialization;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;
import java.io.ObjectInputStream;
import org.xml.sax.helpers.XMLReaderFactory;


public class Test2 {
    public void test(File file) throws IOException, InterruptedException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        XMLReaderFactory xmlParser = (XMLReaderFactory) new ObjectInputStream(new FileInputStream(file)).readObject();
        XMLReaderFactory xmlParser_two = (XMLReaderFactory) xmlParser;
        in.close();
    }
}