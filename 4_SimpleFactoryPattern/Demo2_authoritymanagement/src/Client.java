public class Client {
    public static void main(String[] args) throws Exception {
        try {
            User user;
            int n=XMLUtil.getAuthority();
            user=UserFactory.product(n);
            user.diffOperation();
            user.sameOperation();

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
