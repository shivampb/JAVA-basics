public class Unboxing {
    public static void main(String[] args) { //UNBOXING
Integer wrapper = Integer.valueOf(500);

int primitive = wrapper.intValue(); // explicit coverting;
        System.out.println("This is primitive Type "+primitive);

        int pprimitive = wrapper;//implicit conversion
        System.out.println("This is IMPLICIT primitive Type "+pprimitive);

    }
}
