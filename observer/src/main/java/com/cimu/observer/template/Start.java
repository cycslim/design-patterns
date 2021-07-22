package com.cimu.observer.template;

/**
 * <p>write your description here
 *
 * @author cimu
 * @since 2021/7/22 上午11:32
 */
public class Start {
    public static void main(String[] args) {
        //实际的主题
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //注册监听者
        ConcreteObserver concreteObserver = new ConcreteObserver();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        concreteSubject.attach(concreteObserver);
        concreteSubject.attach(concreteObserver2);

        concreteSubject.change("皮卡丘");

    }
}
