package com.jxau.xw.demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
      增强for循环，底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
      是jdk1.5之后出现的新特性
      Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for
      public interface Iterable<T>实现这个接口允许对象成为foreach语句的目标

      增强for循环：用来遍历集合和数组

      格式：
            for（集合/数组的数据类型  变量名: 集合名/数组名）{
                  sout(变量名);
            }

       它用于遍历Collection和数组。通常只进行遍历元素，不要在遍历的过程中对集合元素进行增删操作。



 */
public class DemoForeach {
    public static void main(String[] args) {
        demo01();
        System.out.println("============");
        demo02();
    }

    //使用增强for遍历集合
    private static void demo02() {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String i:list) {
            System.out.println(i);
        }
    }

    //使用增强for遍历数组
    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i:arr) {
            System.out.println(i);
        }
    }
}
