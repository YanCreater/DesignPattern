
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean()throws Exception{
        try{
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
            Document doc=builder.parse(new File("config.xml"));

            NodeList nodeList=doc.getElementsByTagName("className");
            Node node=nodeList.item(0).getFirstChild();
            String cName=node.getNodeValue();

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
