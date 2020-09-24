package domain;

public abstract class Product {
    private String productTitle, productId;

    public Product(String productTitle, String productId) {
        setProductTitle(productTitle);
        setProductId(productId);
    }

    public String getProductTitle() {
        return productTitle;
    }

    private void setProductTitle(String productTitle) {
        if (Checker.isEmptyString(productTitle)) {
            throw new IllegalArgumentException("Producttitel mag niet leeg zijn");
        }
        this.productTitle = productTitle;
    }

    public String getProductId() {
        return productId;
    }

    private void setProductId(String productId) {
        if (Checker.isEmptyString(productId)) {
            throw new IllegalArgumentException("Product id mag niet leeg zijn");
        }
        this.productId = productId;
    }

    public abstract double getPrice(int days);

    public String toString() {
        return "Type: " + this.getClass().getSimpleName() + ", id: " + productId + ", title: " + productTitle;
    }
}
