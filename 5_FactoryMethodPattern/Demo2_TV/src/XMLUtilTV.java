import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;

public class XMLUtilTV {
    public static Object getBean(){
        try
        {
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("config.xml"));

            NodeList nl=doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue().trim();

            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
