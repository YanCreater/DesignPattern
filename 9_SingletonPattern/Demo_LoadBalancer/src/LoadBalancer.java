import java.util.*;

//负载均衡器LoadBalancer：单例类，真实环境下该类将非常复杂，包括大量初始化的工作和业务方法，考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
class LoadBalancer {

        private volatile static LoadBalancer instance = null;  //此处填空----------------------------1
    //服务器集合
    private List serverList = null;
        private LoadBalancer() {  //此处填空----------------------------2
        serverList = new ArrayList();
    }
        public static LoadBalancer getLoadBalancer() {   //此处填空----------------------------3
        if (instance == null) {
            synchronized (LoadBalancer.class){
                if(instance==null){
                    instance=new LoadBalancer();
                }
            }
        }
        return instance;
    }

    //增加服务器
    public void addServer(String server) {
        serverList.add(server);
    }

    //删除服务器
    public void removeServer(String server) {
        serverList.remove(server);
    }

    //使用Random类随机获取服务器
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }
}
