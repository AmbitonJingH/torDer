package order.controller;

import order.Dao.WinChooseTrain;
import order.Do.User;
import order.Menus.Pages1;
import order.Service.WinChooseTrainService;
import order.Service.WorkDaoService;

import java.text.ParseException;
import java.util.Scanner;

public class TestWorkController {
    WorkDaoService service = new WorkDaoService();
    WinChooseTrainService service1 = new WinChooseTrainService();
    public void Sign(){
        User user = new User(1);
        service.sign(user);
    }

    public void searchUserinfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输出你要搜索的用户的id：");
        int id = scanner.nextInt();
        service.searchUserInfo(id);
    }
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = scanner.next();
        System.out.print("请输入密码");
        String password = scanner.next();
        User user = new User(0);
        user.setName(name);
        user.setPassword(password);
        service.login(user);
    }
    public void createTrain() throws ParseException {

    }
    public void SearchTrain(String startLocal,String endLocal) throws ParseException {
        service1.SearchTrain(startLocal,endLocal);
    }
    public static void main(String[] args) throws ParseException, InterruptedException {
        TestWorkController controller = new TestWorkController();
        Pages1 pages1 = new Pages1();
        pages1.Menu1TrainList();
        controller.SearchTrain("三亚","安康");
    }
}
