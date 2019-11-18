import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.*;
import java.io.File;

public class XMLUtil {
    public static Object getBean() throws Exception{
        try
        {
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
            Document document;
            document=builder.parse(new File("config.xml"));

            NodeList nodeList= ((org.w3c.dom.Document) document).getElementsByTagName("className");
            Node classNode=nodeList.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;

        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
