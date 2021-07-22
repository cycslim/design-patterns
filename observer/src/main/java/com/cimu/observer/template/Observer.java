package com.cimu.observer.template;

/**
 * <p> 定义观察者的抽象行为
 *
 * @author cimu
 * @since 2021/7/21 下午7:13
 */
public interface Observer {
    // 更新行为
    void update (String state);
}
