package com.ryz.synchronize;

/**
 *
 * @author ryz2593
 * @date 2019/3/28
 *
 * 可重入粒度测试：递归调用本方法
 */
public class SynchronizedRecursion10 {

    int a = 0;
    public static void main(String[] args) {
        SynchronizedRecursion10 synchronizedRecursion10= new SynchronizedRecursion10();
        synchronizedRecursion10.method1();
    }

    private synchronized void method1() {
        System.out.println("这是method1, a = " + a);
        if (a == 0) {
            a++;
            method1();
        }
    }
}
