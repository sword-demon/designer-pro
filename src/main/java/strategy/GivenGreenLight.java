package strategy;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("实现策略的第二个策略执行方法");
    }
}
