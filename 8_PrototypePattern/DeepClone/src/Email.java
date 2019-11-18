import java.io.*;

/**
 * 深克隆 不需要使用Object中的clone方法
 * 需要使用Serializable(序列化)的方式实现。
 */
public class Email implements Serializable {
    private Attachment attachment=null;

    public Email(){
        this.attachment=new Attachment();
    }

    public Object deepClone() throws IOException,ClassNotFoundException,OptionalDataException{
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (ois.readObject());
    }

    public Attachment getAttachment(){
        return this.attachment;
    }

    public void display(){
        System.out.println("查看邮件");
    }
}
