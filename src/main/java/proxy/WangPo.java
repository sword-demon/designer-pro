package proxy;

public class WangPo implements KindWomen {

    // 一个女人的代理  相当于一个中间人

    private KindWomen kindWomen;

    public WangPo() {
        // 默认是潘金莲的代理
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
