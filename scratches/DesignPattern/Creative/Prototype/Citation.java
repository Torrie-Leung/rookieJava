package DesignPattern.Creative.Prototype;

public class Citation implements Cloneable{
//    member variable
    private  String name;
    private  String gender;
    private  int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setLevel(int level) {
        if(level < 0){
            System.out.println("you can't set minus level~");
        }else {
            this.level = level;
        }

    }

    public Number getLevel() {
        return level;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return  (Citation) super.clone();
    }

    public void show(){
        System.out.println(gender + name +  "has done it with flying color~");
    }
}
