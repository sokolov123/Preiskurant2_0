import java.util.Objects;

public class Product {
    public String prodName = "";
    public String prodKey = "";
    public int rubCost;
    public int kopecksCost;

    public Product(String prodName, String prodKey, int rubCost, int kopecksCost) {
        if (prodName != null && prodKey != null && rubCost >= 0 && kopecksCost >= 0) {
            this.prodName = prodName;
            this.prodKey = prodKey;
            this.rubCost = rubCost;
            this.kopecksCost = kopecksCost;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return prodName.equals(product.prodName) &&
                prodKey.equals(product.prodKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodName, prodKey, rubCost, kopecksCost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", prodKey='" + prodKey + '\'' +
                ", rubCost=" + rubCost +
                ", kopecksCost=" + kopecksCost +
                '}';
    }

}