package com.rxtx;


import java.io.IOException;
import java.io.InputStream;
import java.util.TooManyListenersException;
import javax.comm.CommPortIdentifier;
import javax.comm.NoSuchPortException;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import javax.comm.SerialPortEvent;
import javax.comm.SerialPortEventListener;

/**
 * Com21EventListener类使用“事件监听模式”监听串口COM21，
 * 并通过COM21的输入流对象来获取该端口接收到的数据（在本文中数据来自串口COM11）。
 * 使用“事件监听模式”监听串口，必须字定义一个事件监听类，该类实现SerialPortEventListener
 * 接口并重写serialEvent方法，在serialEvent方法中编写监听逻辑。
 */
public class Com51EventListener implements SerialPortEventListener {

    //1.定义变量
    CommPortIdentifier com21 = null;//未打卡的端口
    SerialPort serialCom21 = null;//打开的端口
    InputStream inputStream = null;//输入流

    //2.构造函数：
    //实现初始化动作：获取串口COM21、打开串口、获取串口输入流对象、为串口添加事件监听对象
    public Com51EventListener(){
        try {
            //获取串口、打开窗串口、获取串口的输入流。
            com21 = CommPortIdentifier.getPortIdentifier("COM51");
            serialCom21 = (SerialPort) com21.open("Com51EventListener", 1000);
            inputStream = serialCom21.getInputStream();

            //向串口添加事件监听对象。
            serialCom21.addEventListener(this);
            //设置当端口有可用数据时触发事件，此设置必不可少。
            serialCom21.notifyOnDataAvailable(true);
        } catch (NoSuchPortException e) {
            e.printStackTrace();
        } catch (PortInUseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TooManyListenersException e) {
            e.printStackTrace();
        }
    }

    //重写继承的监听器方法
    @Override
    public void serialEvent(SerialPortEvent event) {
        //定义用于缓存读入数据的数组
        byte[] cache = new byte[1024];
        //记录已经到达串口COM21且未被读取的数据的字节（Byte）数。
        int availableBytes = 0;
        //如果是数据可用的时间发送，则进行数据的读写
        if(event.getEventType() == SerialPortEvent.DATA_AVAILABLE){
            try {
                availableBytes = inputStream.available();
                while(availableBytes > 0){
                    inputStream.read(cache);
                    for(int i = 0; i < cache.length && i < availableBytes; i++){
                        //解码并输出数据
                        System.out.print((char)cache[i]);
                    }
                    availableBytes = inputStream.available();
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //在main方法中创建类的实例
    public static void main(String[] args) {
        new Com51EventListener();
    }
}