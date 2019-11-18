public class EmployeeFactory extends UserFactory {
    @Override
    public User product() {
        return new Employee();
    }
}
