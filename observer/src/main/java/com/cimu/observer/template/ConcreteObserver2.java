package com.cimu.observer.template;

/**
 * <p>write your description here
 *
 * @author cimu
 * @since 2021/7/22 上午11:29
 */
public class ConcreteObserver2 implements Observer{

    //具体观察者的状态
    private String observerState;

    @Override
    public void update(String state) {
        //这里可以根据传递过来的主题的状态作出相应的业务
        observerState = state;
        System.out.println("观察者2的状态跟着变化为：" + observerState);
    }
}
