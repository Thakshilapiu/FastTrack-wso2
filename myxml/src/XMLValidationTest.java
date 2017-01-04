import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
public class XMLValidationTest {

     public static void main(String[] args) {
         try {
             // SchemaFactory for schema language W3C XML Schema 1.0
             SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
             
             // Parse xsd a provides a schema object
             Schema schema = schemaFactory.newSchema(new File("school.xsd"));
             
             // Processor to check XML is valid against schema
             Validator validator = schema.newValidator();
             
             // Validates the specified input
             validator.validate(new StreamSource(new File("school.xml")));
             
            } catch ( SAXException e ) {
             // SAXException provides the validation errors 
             System.out.println(e.getMessage());
            } catch ( IOException e ) {
             e.printStackTrace();
            }
           }
          }