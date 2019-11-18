public class Manager implements User {
    @Override
    public void sameOperation() {
        System.out.println("公共权限---authority management");
    }

    @Override
    public void diffOperation() {
        System.out.println("经理权限---authority management");
    }
}
