package mypackage;

class Product {
    private String name;
    private double price;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be NULL or EMPTY !! ");
        }
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        if (price <= 0) {
            // this is Exception
            throw new IllegalArgumentException("price cant be 0 or less then 0");
        }

        this.price = price;
    }
}

public class getANDset {
    public static void main(String[] args) {
        Product obj = new Product();
        obj.setName("");
        obj.setPrice(10);
        System.out.println("name is:- " + obj.getName() + "  price is:- " + obj.getPrice());
    }

}
