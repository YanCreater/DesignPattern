import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.*;
import java.io.File;

public class XMLUtil {
    public static int getAuthority(){
        try
        {
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
            Document document;
            document=builder.parse(new File("config.xml"));
            NodeList nodeList= ((org.w3c.dom.Document) document).getElementsByTagName("Authority");
            Node classNode=nodeList.item(0).getFirstChild();
            int n=Integer.valueOf(classNode.getNodeValue().trim());
            return n;
        }catch (Exception e)
        {
            e.printStackTrace();
            return -1;
        }
    }
}
