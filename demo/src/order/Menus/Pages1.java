package order.Menus;

import order.controller.TestWorkController;

import java.text.ParseException;
import java.util.Scanner;

public class Pages1 {

    public int Menu1TrainList() throws InterruptedException, ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的起始地：");
        String startLocal =  input.next();
        System.out.println("请输入你的目的地：");
        String endLocal =  input.next();
        System.out.println("你选择的站点为："+startLocal+"---->"+endLocal);
        System.out.println("正在进去服务页面，请稍等.....");
        Thread.sleep(6);
        System.out.println("****************************************");
        System.out.println("***           1.查询当前车次           ***");
        System.out.println("***           2.选 择 车 次           ***");
        System.out.println("***           3.购 买 车 票           ***");
        System.out.println("****************************************");
        System.out.print("请输入你的选择：");
        int a = input.nextInt();
        if(a==1){
            TestWorkController testWorkController = new TestWorkController();
            testWorkController.SearchTrain(startLocal,endLocal);
        }
        return a;
    }

    public static void main(String[] args) throws InterruptedException, ParseException {
        Pages1 pages1 = new Pages1();
        pages1.Menu1TrainList();
    }
}
