package com.blueberry.pattern.chain_of_responsibility;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Client {
    public static void main(String[] args){
        // 构造一个ConcreteHandler1 对象
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        // 构造一个ConcreteHandler2对象
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        // 设置handler1的下一个节点
        handler1.successor = handler2;
        handler2.successor = handler1;

        // 处理请求
        handler1.handleRequest("ConcreteHandler2");
    }
}
