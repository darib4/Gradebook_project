package mobile;

public class Advertisement {
    private Product product;
    private String type; // Например: "For Sale", "Exchange"
    private String owner; // Потребител, който публикува обявата

    public Advertisement(Product product, String type, String owner) {
        this.product = product;
        this.type = type;
        this.owner = owner;
    }

    public Product getProduct() {
        return product;
    }

    public String getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Advertisement by " + owner + ": " + product.getName() + " (" + type + ")";
    }
}

