package order.Do;

import java.util.Arrays;
import java.util.Date;

public class Train {
    private String id;
    private String name;
    private Date startTime;

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", 列车名称='" + name + '\'' +
                ", 发车时间=" + startTime +"\n"+
                ", 到站时间=" + arriveTime +
                ", 站点信息=" + showNode(arr) +
                ", 座位数=" + seatNum +
                '}';
    }
    public String showNode(Node node){
        String list = "";
        while (node!=null){
            list = list + "站点:"+node.getName()+" 到达时间:"+"2023-04-22 4:00:00"+"\n";
            node = node.getNext();
        }
        return list;
    }
    private Date arriveTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Node getArr() {
        return arr;
    }

    public void setArr(Node arr) {
        this.arr = arr;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    private Node arr;  //站点
    private int seatNum;

    public Train(String id, String name, Date startTime, Date arriveTime, Node arr, int seatNum) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.arriveTime = arriveTime;
        this.arr = arr;
        this.seatNum = seatNum;
    }
}
