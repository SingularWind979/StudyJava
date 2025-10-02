package tools.smarthomesys;

import tools.smarthomesys.controller.SmartControllerImpl;
import tools.smarthomesys.device.AirConditioner;
import tools.smarthomesys.device.SmartDevice;
import tools.smarthomesys.device.SmartLight;
import tools.smarthomesys.device.WashingMachine;

import java.util.Scanner;

/**
 * 智能家居控制系统
 * 可以让用户选择要控制的家电（如智能灯、电视等），然后进行开关操作
 * 设备：智能灯、电视、智能音箱，能够开关
 * 控制系统：单例，只调用家电的开关方法
 * @author SingularWind
 * @version 1.0
 */

public class SmartHomeSys {
    public static void main(String[] args) {
        // 创建设备类
        SmartDevice[] devices = new SmartDevice[11];
        // 初始化设备
        devices[0] = new SmartLight("Living Room SuperSmart Light");
        devices[1] = new WashingMachine("Living Room Washing Machine");
        devices[2] = new AirConditioner("Living Room Air Conditioner");
        // 创建控制器
        SmartControllerImpl.INSTANCE.init(devices);
        // 显示所有设备
        SmartControllerImpl.INSTANCE.showDevices();
        // 控制设备
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("请输入要控制的设备ID：");
                int id = scanner.nextInt();
                SmartControllerImpl.INSTANCE.controlDevice(id);
                System.out.println("是否继续控制其他设备？(y/n)");
                String continueControl = scanner.next();
                if (!continueControl.equalsIgnoreCase("y")) {
                    System.out.println("控制结束");
                    break;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
