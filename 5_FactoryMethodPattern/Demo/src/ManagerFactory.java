public class ManagerFactory extends UserFactory {
    @Override
    public User product() {
        return new Manager();
    }
}
