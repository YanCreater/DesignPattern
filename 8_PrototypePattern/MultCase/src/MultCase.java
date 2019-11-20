public class MultCase {
    private static MultCase instance;
    private static final int  Count=3;
    private static int a=0;
    //最多参加三个实例
    private MultCase(){
    }

    public static MultCase getInstance(){
        if(instance==null&&a<=Count) {
            instance = new MultCase();
            a++;
            return instance;
        }else if(a<=Count){
            instance=new MultCase();
            a++;
            return instance;
        }
        else{
            return null;
        }
    }
}
