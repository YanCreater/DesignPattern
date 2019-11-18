import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;

public class XMLUtil {
    public static Object getBean()throws Exception{
        try
        {
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
            Document document=builder.parse(new FileInputStream("config.xml"));

            NodeList nodeList=document.getElementsByTagName("className");
            Node node=nodeList.item(0).getFirstChild();
            String cName=node.getNodeValue();

            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
