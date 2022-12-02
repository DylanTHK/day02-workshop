package cart;

public class Apple extends Item {
    
    private String type;

    // create a constructor
    public Apple() {
        // this is treated at input for the existing constructor inside parent class
        super("apple", "c-Apple");
    }

    // getter
    public String getType() {
        return type;
    }

    // setter
    public void setType(String newType) {
        this.type = newType;
    }

}
