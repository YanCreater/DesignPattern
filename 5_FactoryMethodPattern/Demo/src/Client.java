public class Client {
    public static void main(String[] args) throws Exception {
        try {
            User user;
            UserFactory userFactory;
            userFactory=(UserFactory)XMLUtil.getBean();
            user=userFactory.product();
            user.sameOperation();
            user.diffOperation();


        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
