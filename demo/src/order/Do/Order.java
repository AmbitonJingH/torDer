package order.Do;

import java.util.Date;

public class Order extends Train{

    private String sfz;
    private String id;
    private float money;
    private Date creatOrderTime;

    @Override
    public String toString() {
        return "Order{" +
                "sfz='" + sfz + '\'' +
                ", id='" + id + '\'' +
                ", money=" + money +
                ", creatOrderTime=" + creatOrderTime +
                '}';
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Date getCreatOrderTime() {
        return creatOrderTime;
    }

    public void setCreatOrderTime(Date creatOrderTime) {
        this.creatOrderTime = creatOrderTime;
    }


    public Order(String id, String name, Date startTime, Date arriveTime, Node arr, int seatNum, String sfz, String id1, float money, Date creatOrderTime) {
        super(id, name, startTime, arriveTime, arr, seatNum);
        this.sfz = sfz;
        this.id = id1;
        this.money = money;
        this.creatOrderTime = creatOrderTime;
    }

    public Order(String id, String name, Date startTime, Date arriveTime, Node arr, int seatNum) {
        super(id, name, startTime, arriveTime, arr, seatNum);
    }
}
