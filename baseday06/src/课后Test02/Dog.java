package 课后Test02;
// dog类

// 1.类要是公共的和具体的
public class Dog {
    // 2.成员变量要私有
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showMsg() {
        System.out.println("狗的名称为: " + name + ",年龄为: "+ age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
