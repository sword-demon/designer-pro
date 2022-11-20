package strategy;

public class Context {
    // 构造函数 你要使用哪一条策略
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    // 使用策略
    public void operate() {
        this.iStrategy.operate();
    }
}
