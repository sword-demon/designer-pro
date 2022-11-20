package singleton;

/**
 * 大臣们，要看到的今天的皇帝和昨天的皇帝都是同一人才行
 */
@SuppressWarnings("all")
public class Minister {
    public static void main(String[] args) {
        // 第一天
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo(); // 第一天的皇帝信息

        // 第二天
        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo();

        // 第三天
        Emperor emperor3 = Emperor.getInstance();
        emperor2.emperorInfo();
    }
}
