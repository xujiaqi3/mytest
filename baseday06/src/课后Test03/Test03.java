package 课后Test03;

/*
    老师类Teacher
    属性：姓名name，年龄age，讲课内容content
    成员方法：吃饭eat方法，讲课teach方法
    定义测试类
    在main方法中使用无参构造方法创建Teacher对象t，使用set方法给t对象的成员变量赋值
    调用t对象的 eat 和 teach 方法
* */

public class Test03 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.setContent("java面向对象");
        t.eat();
        t.teach();
        Student s = new Student("韩同学",18,"java面向对象");
        s.eat();
        s.Study();
    }
}
