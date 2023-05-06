package order.Service;

import order.Dao.WinChooseTrain;
import order.Do.Node;
import order.Do.Train;

import java.text.ParseException;

public class WinChooseTrainService implements WinChooseTrain {
    @Override
    public Train SearchTrain(String startLocal, String endLocal) throws ParseException {
        WorkDaoService service = new WorkDaoService();
        Train[] list = new Train[10];
        Train[] res1 = service.createTrains("D0001", "复兴号1", "西安，汉中，安康，杭州，上海");
        Train[] res2 = service.createTrains("D0002", "复兴号2", "西安，厦门，福建，杭州，上海");
        Train[] res3 = service.createTrains("D0003", "复兴号3", "武汉，汉中，成都，杭州，上海");
        Train[] res4 = service.createTrains("D0004", "复兴号4", "西安，扬州，安康，杭州，上海");
        Train[] res5 = service.createTrains("D0005", "复兴号5", "三亚，汉中，安康，杭州，上海");
        list[0] = res1[0];
        list[1] = res2[0];
        list[2] = res3[0];
        list[3] = res4[0];
        list[4] = res5[0];
        for (int i = 0; i < 5; i++) {
            Node head = list[i].getArr();
            if (head.getName().equals(startLocal)) {
                while (head.getNext() != null) {
                    if (head.getNext().getName().equals(endLocal)) {
                        return list[i];
                    }else{
                        head = head.getNext();
                    }
                }
            }

        }

        return null;
    }

    @Override
    public Train ChooseTrain() {
        return null;
    }
}
