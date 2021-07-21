package com.cimu.strategy.template;

//具体的策略实现(可以定义多个具体的策略实现)
public class StrategyB implements Strategy{
    @Override
    public void strategyImplementation() {
        System.out.println("正在执行策略B");
    }
}