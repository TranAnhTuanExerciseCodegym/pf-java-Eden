public class Apple {
    public int weight;

    public boolean isEmpty() {
        boolean check = false;
        if (weight <= 0) {
            check = true;
        }
        return check;
    }
}
