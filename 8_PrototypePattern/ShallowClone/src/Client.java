public class Client {
    public static void main(String[] args) {
        Email email,copyEmail;
        email=new Email();
        copyEmail=(Email)email.clone();
        System.out.print("email==copyEmail----->");
        System.out.println(email==copyEmail);
        System.out.print("email.getAttachment()==copyEmail.getAttachment()----->");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());

    }
}
