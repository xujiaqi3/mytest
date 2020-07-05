package 课后Test03;

public class Student {
    private String name;
    private int age;
    private String content;

    /*
    * 听课内容
    * */
    public void Study() {
        System.out.println("年龄为" + age + "的" + name + "正在专心致志的听着" + content + "的知识......");
    }

    public void eat() {
        System.out.println("年龄为" + age + "的" +name + "正在吃饭");
    }

    public Student() {
    }

    public Student(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
