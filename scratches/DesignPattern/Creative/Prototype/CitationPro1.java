package DesignPattern.Creative.Prototype;

public class CitationPro1 {
    public static void main(String[] args) throws CloneNotSupportedException {
//        create prototype obj
        Citation citation = new Citation();
//        clone
        Citation citation1 = citation.clone();
        citation.setName("Yoshi");
        citation.setGender("Pixie ");

        citation1.setName("Peach ");
        citation1.setGender("Princess ");

//        use methods
        citation.show();
        citation1.show();
    }
}
