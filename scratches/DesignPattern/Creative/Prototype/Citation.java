package DesignPattern.Creative.Prototype;

public class Citation implements Cloneable{
//    member variable
    private  String name;
    private  String gender;

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

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return  (Citation) super.clone();
    }

    public void show(){
        System.out.println(gender + name +  "has done it with flying color~");
    }
}
