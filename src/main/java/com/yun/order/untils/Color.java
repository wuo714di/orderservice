package com.yun.order.untils;

/**
 * 枚举类，下面的构造函数都是为上面服务的。
 */
public enum Color {
    RED("红色", 1),
    GREEN("绿色", 2),
    BLANK("白色", 3),
    YELLO("黄色", 4);
    private String name;
    private int index;
    // 构造方法
    private Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void main(String[] args) {
        String name = Color.RED.name;
    }
}
