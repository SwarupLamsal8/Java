package Lab9;

public class Generic <T, U> {
    private T item;
    private U price;

    Generic(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return item;
    }

    public U getPrice() {
        return price;
    }

    public static void main (String[] args) {
        Generic<String, Integer> generic = new Generic<>("Banana", 8);
        Generic<String, String> generic1 = new Generic<>("Banana", "Hundred");
        System.out.println(generic.getItem());
        System.out.println(generic.getPrice());
        System.out.println(generic1.getItem());
        System.out.println(generic1.getPrice());
    }
}
