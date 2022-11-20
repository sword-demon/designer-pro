package proxy;

/**
 * 西门庆
 */
public class XiMenQing {
    public static void main(String[] args) {
        // 找王婆代理 做中间人 牵线
        WangPo wangPo = new WangPo();

        // 表面上是王婆
        // 实际上是潘金莲
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        // 改变一下历史，贾氏被西门庆勾走
        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}
