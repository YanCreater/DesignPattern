
/**
 * 浅克隆：对引用对象不进行赋值，只是简单的添加引用
 * 使用浅克隆的时候一定要使用 添加标志接口 Cloneable(空接口)
 * */
public class Email implements Cloneable{
    private Attachment attachment=null;

    public Email(){
        this.attachment=new Attachment();
    }

    public Object clone(){
        Email clone=null;
        try{
            clone=(Email)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Clone failure!");
        }
        return clone;
    }

    public Attachment getAttachment(){
        return this.attachment;
    }

    public void display(){
        System.out.println("查看邮件");
    }
}
