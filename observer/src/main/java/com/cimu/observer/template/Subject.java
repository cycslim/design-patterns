package com.cimu.observer.template;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> 抽象主题
 *
 * @author cimu
 * @since 2021/7/21 下午7:12
 */
@Slf4j
public abstract class Subject {

    //维护一个所有观察者集合
    private List<Observer> observerList = new ArrayList<>();

    //新注册一个观察者
    public void attach (Observer observer) {
        observerList.add(observer);
        log.info("新注册一个观察着");
    }
    //删除一个观察者
    public void detach (Observer observer) {
        observerList.remove(observer);
        log.info("新注册一个观察着");
    }

    public void notifyObservers(String state) {
        for (Observer observer : observerList) {
            observer.update(state);
        }
    }

}
