import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.service.ShoppingCart;

import static ru.yandex.praktikum.model.constants.Colour.GREEN;
import static ru.yandex.praktikum.model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple red_apple = new Apple(10, 50, RED);
        Apple green_apple = new Apple(8, 60, GREEN);

        Food[] products = {meat, red_apple, green_apple};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.amountVeganProductsWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.amountWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.amountWithoutDiscount());

    }
}
