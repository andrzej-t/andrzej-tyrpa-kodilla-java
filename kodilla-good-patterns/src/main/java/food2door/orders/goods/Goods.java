package food2door.orders.goods;

public class Goods {
    private String goodsType;
    private int goodsAmount;
    private double goodsPrice;

    public Goods(String goodsType, int goodsAmount, double goodsPrice) {
        this.goodsType = goodsType;
        this.goodsAmount = goodsAmount;
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }
}
