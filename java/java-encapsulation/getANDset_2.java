package mypackage;

class mark {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks < 30) {
            System.out.println("banda fail hai");
        }
        this.marks = marks;
    }
}

public class getANDset_2 {
    public static void main(String[] args) {
        mark obj = new mark();
        obj.setMarks(15);
        System.out.println("bande ke marks hai: " + obj.getMarks());
    }
}
