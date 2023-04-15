package order.controller;

import order.Do.User;
import order.Service.WorkDaoService;

import java.util.Scanner;

public class TestWorkController {
    WorkDaoService service = new WorkDaoService();
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

    public static void main(String[] args) {
        TestWorkController controller = new TestWorkController();
        controller.Sign();
        controller.login();
        //controller.searchUserinfo();
    }
}
