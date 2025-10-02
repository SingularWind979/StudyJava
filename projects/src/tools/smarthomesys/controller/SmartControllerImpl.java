package tools.smarthomesys.controller;

import lombok.Getter;
import tools.smarthomesys.device.SmartDevice;

/**
 * 智能家居控制器实现类
 * 可以控制智能家居系统中的设备，如智能灯、电视、智能音箱等
 * 单例模式
 */

@Getter
public enum SmartControllerImpl implements SmartController {
    /**
     * 单例实例
     */
    INSTANCE;

    // 设备数组
    private SmartDevice[] devices;

    /**
     * 初始化智能家居控制器
     * @param devices 要控制的智能设备数组
     * @throws IllegalArgumentException 如果设备数组为空或已初始化
     * @throws IllegalArgumentException 如果设备数组为空或已初始化
     */
    public void init(SmartDevice[] devices) {
        if (this.devices != null) {
            throw new IllegalArgumentException("设备数组已初始化");
        }
        if (devices == null || devices.length == 0) {
            throw new IllegalArgumentException("设备数组不能为空");
        }
        this.devices = devices;
    }

    /**
     * 显示所有智能设备的信息
     * 表格形式
     */
    @Override
    public void showDevices() {
        if (devices == null) {
            throw new IllegalArgumentException("设备数组未初始化");
        }
        System.out.println("所有设备：");
        System.out.println("|ID\t|名称\t\t\t\t\t\t\t|类型\t\t\t|状态|");
        for (int i = 0; i < SmartDevice.count; i++) {
            devices[i].printInfo();
        }
    }

    /**
     * 控制指定ID的智能设备
     * @param id 要控制的智能设备的ID
     * @throws IllegalArgumentException 如果ID无效（小于0或大于等于设备数量）
     */
    @Override
    public void controlDevice(int id) {
        if (id < 0 || id >= SmartDevice.count) {
            throw new IllegalArgumentException("无效的设备ID");
        }
        devices[id].switchDevice();
    }
}
