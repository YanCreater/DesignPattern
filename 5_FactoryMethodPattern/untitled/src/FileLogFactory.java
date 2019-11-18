public class FileLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        System.out.println("文件日志");
        return new FileLog();
    }
}
