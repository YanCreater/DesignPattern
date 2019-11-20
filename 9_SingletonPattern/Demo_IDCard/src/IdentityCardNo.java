public class IdentityCardNo {
    private static IdentityCardNo instance=null;//私有实例
    private String no;

    private IdentityCardNo(){}//私有构造方法

    public static IdentityCardNo getInstance(){
        if(instance==null){
            System.out.println("第一次办理身份证，获取新号码");
            instance=new IdentityCardNo();
            instance.setIdentityCardNo("No123456789");

        }else {
            System.out.println("重复办理身份证，分配旧号码");
        }
        return instance;
    }

    /*
     * 在其中可以添加些其他的方法。
     *
     */
    private void setIdentityCardNo(String no){
        this.no=no;
    }

    public String getIdentityCardNo(){
        return this.no;
    }
}
