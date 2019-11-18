public class AdministratorFactory extends UserFactory {
    @Override
    public User product() {
        return new Administrator();
    }
}
