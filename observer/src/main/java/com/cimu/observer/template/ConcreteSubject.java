package com.cimu.observer.template;

/**
 * <p> 维护一个真正的主题
 *
 * @author cimu
 * @since 2021/7/21 下午7:17
 */
public class ConcreteSubject extends Subject{
    /**
     * 真是主题内维护一个状态
     */
    private String state;

    public String getState() {
        return state;
    }
    public void change(String state) {
        this.state = state;
        System.out.println("真实状态状态变为：" + state);
        this.notifyObservers(state);
    }
}
