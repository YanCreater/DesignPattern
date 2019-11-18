public class DataBaseLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        System.out.println("数据库日志");
        return new DataBaseLog();
    }
}
