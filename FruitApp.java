class Fruit {
    String Name;
    String Color;
    Integer Weight;
    Boolean IsTasty;
    Integer Price;
    Integer Quantity;

    public Fruit(
        String name,
        String color,
        Integer weight,
        Boolean isTasty,
        Integer price,
        Integer quantity
    ) {
        Name = name;
        Color = color;
        Weight = weight;
        IsTasty = isTasty;
        Price = price;
        Quantity = quantity;
    }

    public void addQuantity() {
        Weight += 1;
        Price += 1;
        Quantity += 1;
    }

    public void removeQuantity() {
        Weight -= 1;
        Price -= 1;
        Quantity -= 1;
    }
}

public class FruitApp  {
    public static void main(String[] args) {
        Fruit apple = new Fruit("apple", "red", 10, true, 100, 1);

        System.out.println(apple.Name);
        System.out.println(apple.Color);
        System.out.println(apple.IsTasty);

        System.out.println(apple.Weight);
        System.out.println(apple.Price);
        System.out.println(apple.Quantity);
        apple.addQuantity();
        System.out.println("After added");
        System.out.println(apple.Weight);
        System.out.println(apple.Price);
        System.out.println(apple.Quantity);
        apple.removeQuantity();
        System.out.println("After removed");
        System.out.println(apple.Weight);
        System.out.println(apple.Price);
        System.out.println(apple.Quantity);
    }
}
