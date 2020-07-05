package 课后Test02;

/*  定义一个Dog类
    属性：
    姓名String类型(私有)
    年龄int类型(私有)
    构造方法：
    无参构造方法，满参构造方法
    成员方法：
    getter/setter方法
    定义测试类
    在main方法中使用满参构造方法创建Dog对象。
    打印Dog对象的姓名和年龄*/

// 测试类
public class Test02 {
    public static void main(String[] args) {
        // 1.在main方法中使用满参构造方法创建Dog对象。
        Dog d1 = new Dog("旺财",3);

        //
        d1.showMsg();
    }
}
