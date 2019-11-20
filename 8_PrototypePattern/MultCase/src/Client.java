public class Client {
    public static void main(String[] args) {
        MultCase case1,case2,case3,case4,case5;
        case1=MultCase.getInstance();
        case2=MultCase.getInstance();
        case3=MultCase.getInstance();
        case4=MultCase.getInstance();
        case5=MultCase.getInstance();

        System.out.println("case1==case2 ??-->"+(case1==case2));
        System.out.println("case3==case2 ??-->"+(case3==case2));
        System.out.println("case1==case3 ??-->"+(case1==case3));
        System.out.println("case1==case4 ??-->"+(case1==case4));
        System.out.println("case5==null ??-->"+(null==case5));

    }
}
