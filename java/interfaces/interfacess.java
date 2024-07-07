abstract class greet {
    public abstract void greet();
}

interface hello {
    public void wish();

}

interface hi extends hello {

    public void holaa();

}

class hola implements hi, hello { // concrete class
    int a = 99;

    public void wish() {
        System.out.println("wish ");
System.out.println(a);
    }

    public void holaa() {
        System.out.println("hola");
    }
}

public class interfacess {
    public static void main(String[] args) {

        hola obj1 = new hola();
        obj1.holaa();
        obj1.wish();
        obj1.a = 55555;
        System.out.println(obj1.a);
    }
}
