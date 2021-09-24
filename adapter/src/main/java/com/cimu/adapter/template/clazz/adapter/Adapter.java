package com.cimu.adapter.template.clazz.adapter;


/**
 * <p>类的适配器
 *
 * @author 茨木
 * @since 2021/8/31 下午5:41
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void target() {
        System.out.println("适配开始");
        this.source();
        System.out.println("适配完成");
    }
}
