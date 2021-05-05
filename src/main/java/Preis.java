import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Preis {
    private final List<Product> products = new ArrayList<>();

    public Preis(List<Product> product){
        if (product != null) {
            products.addAll(product);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Preis)) return false;
        Preis preis = (Preis) o;
        return products.equals(preis.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Preis{" +
                "products=" + products +
                '}';
    }

    public boolean addProduct(Product product) { // метод который вот добавляет
        for (Product it: this.products) {
            if (it.equals(product)) {
                return false; // если продукт уже существует в списке
            }
        }
        this.products.add(product);
        return true;
    }

    public boolean delProduct(Product product) { //удаляет
        for (Product it: this.products) {
            if (it.equals(product)) {
                this.products.remove(it);
                return true;
            }
        }
        return false;
    }

    public boolean changeCostProduct(Product product, int rubCost, int kopecksCost) { // меняет цену товара
        for (Product it: this.products) {
            if (it.equals(product)) {
                it.rubCost = rubCost;
                it.kopecksCost = kopecksCost;
                return true;
            }
        }
        return false;
    }

    public boolean changeNameProduct(Product product, String prodName) { //меняет имя продукта
        for (Product it: this.products) {
            if (it.equals(product)) {
                it.prodName = prodName;
                return true;
            }
        }
        return false;
    }

    public Double findProduct(String prodKey, int quantity) throws Exception{ // определение цены покупки по коду и количеству экземпляров
        for (Product it: this.products) {
            if (it.prodKey.equals(prodKey)) {
                double a = it.rubCost * 1.0;
                double b = it.kopecksCost / 100.0;
                return +(a + b) * quantity;
            }
        }
        throw new Exception("данного кода нет в системе");
    }
}
