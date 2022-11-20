package strategy;

/**
 * 策略的执行者
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;
        System.out.println("使用第一个策略:");
        context = new Context(new BackDoor()); // 获取策略
        context.operate(); // 执行策略
        System.out.println("\n");

        System.out.println("使用第二个策略:");
        context = new Context(new GivenGreenLight());
        context.operate(); // 执行第二个策略
        System.out.println("\n");

        System.out.println("使用第三个策略");
        context = new Context(new BlockEnemy());
        context.operate(); // 执行第三个策略
        System.out.println("\n");
    }
}
