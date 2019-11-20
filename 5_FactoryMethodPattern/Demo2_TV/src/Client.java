import com.sun.javaws.jnl.XMLUtils;

public class Client {
    public static void main(String[] args) {

        try{
            TV tv;
            //TVFactory tvFactory;
            //tvFactory= (TVFactory) XMLUtilTV.getBean();
            tv=(TV)XMLUtilTV.getBean();
            tv.play();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
