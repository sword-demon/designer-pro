package singleton;

/**
 * 皇帝在一个朝代都是一个，不能有2个皇帝
 */
public class Emperor {
    // 定义一个皇帝
    private static Emperor emperor = null;

    private Emperor() {
        // 不能产生第二个皇帝
    }

    public static Emperor getInstance() {
        // 如果皇帝还没产生 就产生一个
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo() {
        System.out.println("皇帝某某某...");
    }
}
