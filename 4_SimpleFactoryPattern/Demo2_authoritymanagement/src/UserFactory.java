public class UserFactory {
    public static User product(int n) throws Exception {
        if(n==1){
            System.out.println("职员权限");
            return new Employee();
        }
        else if(n==2)
        {
            System.out.println("经理权限");
            return new Manager();
        }
        else if(n==3)
        {
            System.out.println("管理员权限");
            return new Administrator();
        }
        else{
            throw new Exception("无权限");
        }
    }
}
