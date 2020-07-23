package com.study.springcloud.example.bo;

/**
 * @Auther: zhuYanjun
 * @Date: 2020/7/23 13:13
 * @Description:
 * @Version 1.0
 */
public class Order {

    private int id;

    private String ordertName;

    private String time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdertName() {
        return ordertName;
    }

    public void setOrdertName(String ordertName) {
        this.ordertName = ordertName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertName='" + ordertName + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
