package strategy;

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("实现策略的第三个策略执行方法");
    }
}
