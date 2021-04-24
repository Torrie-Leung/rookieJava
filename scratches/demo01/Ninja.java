package demo01;

public class Ninja {
//    成员变量
    String name;
    private int level;
//    成员方法

    public void walk() { System.out.println("go go go！"); }
    public void jump() {
        System.out.println("jump up super high！");
    }
    public void talk() {
        System.out.println("talk to me！");
    }
//    间接访问private成员变量就是定义一对getter/setter方法
    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
