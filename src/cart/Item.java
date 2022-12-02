package cart;

public class Item {
    // class members
    private String name; // if not initialised, is null
    private String code;
    private Float price = 0f; // if not initialised, error prompt
    private Integer quantity = 0;
    
    public Item(String newName, String newCode) {
        this.name = newName;
        this.code = newCode;
    }
    
    // getters
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public Float getPrice() {
        return price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public Float getTotalPrice() {
        return (this.price * this.quantity);
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
}
