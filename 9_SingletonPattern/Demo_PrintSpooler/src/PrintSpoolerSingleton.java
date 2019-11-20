/**
 * 创建单例模式，
 * 私有变量
 * 私有构造方法
 * 静态获取实例的方法
 *
 */
public class PrintSpoolerSingleton  {
    private static PrintSpoolerSingleton instance=null;

    private PrintSpoolerSingleton(){}

    public static PrintSpoolerSingleton getInstance() throws PrintSpoolerException
    {
        if(instance==null){
            System.out.println("创建打印池！");
            instance=new PrintSpoolerSingleton();
        }else {
            throw new PrintSpoolerException("打印池正在工作中");

        }
        return instance;
    }

    public void manageJobs()
    {
        System.out.println("管理打印任务");
    }
}
