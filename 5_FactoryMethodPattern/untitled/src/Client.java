public class Client {
    public static void main(String[] args) throws Exception {
        try {
            LogFactory logFactory;
            Log log;
            logFactory = (LogFactory) XMLUtil.getBean();
            log=logFactory.createLog();
            log.weiteLog();

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
