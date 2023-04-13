import java.util.ArrayList;
import java.util.List;

abstract class Pizza {
    List<String> ingridient = new ArrayList<>();

    abstract List<String> getIngredients();

    void addIngredient(String ingredient) {
        ingridient.add(ingredient);
    }

    void removeIngredient(String ingredient) {
        ingridient.remove(ingredient);
    }
    void prepare() {
        System.out.println("Preparing pizza...");
    }

    void bake() {
        System.out.println("Baking pizza...");
    }

    void cut() {
        System.out.println("Cutting pizza...");
    }

    void box() {
        System.out.println("Boxing pizza...");
    }
}

class MargheritaPizza extends Pizza {
    @Override
    List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Tomato sauce");
        ingredients.add("Mozzarella cheese");
        ingredients.add("Basil");
        return ingredients;
    }
}

class PepperoniPizza extends Pizza {
    @Override
    List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Tomato sauce");
        ingredients.add("Mozzarella cheese");
        ingredients.add("Pepperoni");
        return ingredients;
    }
}

abstract class Pizzeria {
    private List<String> availablePizzas = new ArrayList<>();

    public Pizzeria() {
        addAvailablePizza("Margherita");
        addAvailablePizza("Pepperoni");
    }

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String pizzaType);

    public void addAvailablePizza(String pizzaType) {
        availablePizzas.add(pizzaType);
    }

    public void removeAvailablePizza(String pizzaType) {
        availablePizzas.remove(pizzaType);
    }

    public List<String> getAvailablePizzas() {
        return availablePizzas;
    }
}

class BerlinPizzeria extends Pizzeria {
    @Override
    Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("Pepperoni")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type.");
        }
    }
}

class HamburgPizzeria extends Pizzeria {
    @Override
    Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("Margherita")) {
            return new MargheritaPizza();
        }
        else {
            throw new IllegalArgumentException("Invalid pizza type.");
        }
    }
}

class RostockPizzeria extends Pizzeria {
    @Override
    Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("Margherita")) {
            return new MargheritaPizza();
        } else if (pizzaType.equals("Pepperoni")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pizzeria berlinPizzeria = new BerlinPizzeria();
        berlinPizzeria.addAvailablePizza("Veggie");
        System.out.println("Available pizzas in Berlin Pizzeria: " + berlinPizzeria.getAvailablePizzas());

        Pizzeria hamburgPizzeria = new HamburgPizzeria();
        hamburgPizzeria.removeAvailablePizza("Pepperoni");
        System.out.println("Available pizzas in Hamburg Pizzeria: " + hamburgPizzeria);
    }
