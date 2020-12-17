package xxe;

import java.io.FileInputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class XXESource {

    private void source(String filename) throws XMLStreamException {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        new FactorySink().getXml(filename, inputFactory);
    }

}
