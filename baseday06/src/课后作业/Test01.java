package 课后作业;

/*
    1. 一个类与它的对象之间是什么关系？
    2. 如何定义一个类，由哪些部分组成，各个部分的作用是什么？
    3. 如何创建一个对象，如何使用该对象？
    4. 局部变量和成员变量的区别？
    5. 请简述封装原则：

    1.类是抽象，对象是实体。
    类是对一类事物的描述，是抽象的，
    对象是对一类事物的实例，是具体化的
    类是对象的模板，对象是类的实体

    2.定义一个类，就是定义类的成员，由成员变量和成员方法组成。
    成员变量：对象的属性，和定义变量是一样的，位置发生了改变，在类中，方法外。
    成员方法：类对象的行为。例如：get获取名字，set设置名字。

    3.类名 对象名 = new 类名（）；
    student s = new student();

    4.
        1.在类中的位置不同（重点）
            成员变量：类中方法外
            局部变量：方法中或参数上的变量
        2.作用范围不同（重点）
            成员变量：类中都可以使用
            局部变量：只能本方法中使用
        3.初始化值的不同（重点）：
            成员变量：有默认值
                byte, short, int, long -> 默认值0
                float, double          -> 默认值0.0
                boolean                -> 默认值false

     5.将属性隐藏起来，如果需要访问某个属性，提供公共的方法对其访问。
* */

public class Test01 {

}
