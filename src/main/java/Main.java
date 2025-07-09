import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple red_apple = new Apple(10, 50, "red");
        Apple green_apple = new Apple(8, 60, "green");

        Food[] products = {meat, red_apple, green_apple};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        shoppingCart.amountVeganProductsWithoutDiscount();
        shoppingCart.amountWithDiscount();
        shoppingCart.amountWithoutDiscount();

    }
}
