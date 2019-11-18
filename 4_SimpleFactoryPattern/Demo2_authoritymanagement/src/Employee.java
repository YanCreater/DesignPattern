public class Employee implements User {
    @Override
    public void sameOperation() {
        System.out.println("公共权限---authority management");
    }

    @Override
    public void diffOperation() {
        System.out.println(" 职员权限---authority management");
    }
}
