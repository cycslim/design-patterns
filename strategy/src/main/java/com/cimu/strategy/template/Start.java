package com.cimu.strategy.template;

/**
 * <p>write your description here
 *
 * @author 茨木
 * @since 2020/12/31 2:32 下午
 */
public class Start {
    public static void main(String[] args) {
        Context context = new Context(new StrategyB());
        context.doStrategy();

    }
}
