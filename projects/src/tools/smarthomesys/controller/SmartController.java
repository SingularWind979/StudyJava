package tools.smarthomesys.controller;

import tools.smarthomesys.device.SmartDevice;

/**
 * 智能控制器接口
 * 能够初始化、显示设备和控制设备
 */
public interface SmartController {
    /**
     * 初始化控制器
     * @param devices 要控制的设备数组
     */
    void init(SmartDevice[] devices);

    /**
     * 显示所有智能设备的信息
     * 表格形式
     */
    void showDevices();

    /**
     * 控制指定设备
     * @param id 要控制的设备ID
     */
    void controlDevice(int id);
}
