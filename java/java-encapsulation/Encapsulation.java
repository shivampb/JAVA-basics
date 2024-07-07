package mypackage;

// main class stars here
// public class Encapsulation {
//     public static void main(String[] args) {
//         // here we create a pervious class [ objecct ] here
//         Human obj = new Human();

//         // gives the data here for set method parameters
//         obj.setAge(20);
//         obj.setName("shivam");

//         // simply print
//         System.out.println(obj.getAge() + ":" + obj.getName());
//     }
// }

// // WE USE OUR HUMAN CLASS FOR MULTIPLE CLASSES JUST BY MAKING HUMAN OBJECT
// class hello {
//     public static void main(String[] args) {
//         // here we create a pervious class [ objecct ] here
//         Human obj = new Human();

//         // gives the data here for set method parameters
//         obj.setAge(205);
//         obj.setName("shivaaaam");

//         // simply print
//         System.out.println(obj.getAge() + ":" + obj.getName());
//     }
// }

// this is get and set [method] class
public class Encapsulation {
    private int age /* = 20 */;
    private String name /* = "shivamBhardwaj" */;

    // creating here a method (funtions) for accesing the data later
    public int getAge() {
        return age;
    }

    // here we are set the data from user by making little function with parameters
    // which user gives value in it.
    public void setAge(int umer) {
        age = umer;
    }

    public String getName() {
        return name;
    }

    public void setName(String naam) {
        name = naam;
    }
}