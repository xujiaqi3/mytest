package 课后Test03;

public class Teacher {
    private String name;
    private int age;
    private String content;

    /*
    讲课内容
    */

    public void teach() {
        System.out.println("年龄为" + age + "的" +name + "正在亢奋的讲着" + content + "的知识......");
    }

    public void eat() {
        System.out.println("年龄为" + age + "的" +name + "正在吃饭...");
    }

    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
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
