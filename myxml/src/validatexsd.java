import java.io.InputStream;
import java.io.PrintStream;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class validatexsd {


        static boolean validateAgainstXSD(InputStream xml, InputStream xsd) {
            try {
                SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
                Schema schema = factory.newSchema(new StreamSource(xsd));
                Validator validator = schema.newValidator();
                validator.validate(new StreamSource(xml));
                return true;
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        }
    }