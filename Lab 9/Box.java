package Lab9;

public class Box<T, U>{
    T item;
    U price;

    public void setItem(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return this.item;
    }

    public U getPrice() {
        return this.price;
    }

    public static void main (String[] args) {
        Box<String, Integer> box = new Box<>();
        box.setItem("Banana", 7);
        System.out.println(box.getItem() + box.getPrice());

//        Box<String> box1 = new Box<>();
//        box1.setItem("Banana");
//        System.out.println(box1.getItem());
    }
}
