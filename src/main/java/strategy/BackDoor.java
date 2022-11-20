package strategy;

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("实现策略的第一个策略执行方法");
    }
}
