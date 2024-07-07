import javax.lang.model.type.PrimitiveType;

public class Autoboxingjava {
    public static void main(String[] args) {
         int primitiveType = 100;

         Integer WraperClass = Integer.valueOf(primitiveType); //Explicity converting primitive TO wrapper.

        System.out.println("This is A Wrapper object "+WraperClass);

      //  Integer a=primitiveType; // Autoboxing

//        System.out.println(a);

    }
}
