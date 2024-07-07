package constructor;
class ex {
    String sub;
    int marks;

    ex() {
        sub = "maths";
        marks = 50;
        System.out.println("original => " + sub + " " + marks);
    }

    ex(ex cpy) {
        sub = cpy.sub;
        marks = cpy.marks;
        System.out.println("Copy Construtor => " + sub + " " + marks);
    }
}

public class CopyConst {
    public static void main(String[] args) {
        ex obj1 = new ex();
        ex obj2 = new ex(obj1);
    }
}
