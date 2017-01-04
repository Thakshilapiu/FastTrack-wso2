import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;
public class XSLTTransformer {

    /**
     * @param args
     */


            public static void main(String[] args) {

             // Stream source of xsl file
             StreamSource xslSourse = new StreamSource(new File("school.xsl"));

             // Stream source of xml file
             StreamSource xmlSourse = new StreamSource(new File("school.xml"));

             // Stream Output html file
             StreamResult htmlOutput = new StreamResult(new File("school.html"));

             // Transforming using xsl processor
             try {
             TransformerFactory.newInstance().newTransformer(xslSourse).transform(xmlSourse, htmlOutput);
             } catch (TransformerConfigurationException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
             } catch (TransformerException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
             } catch (TransformerFactoryConfigurationError e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
             }

             }
             }