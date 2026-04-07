package workshop.Generics;


class NumberBox<T> {
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class NumberBoxDemo {

    public static void main(String[] args) {
        NumberBox<Integer> n1 = new NumberBox<>();
        n1.setValue(23);
        System.out.println(n1.getValue());

        NumberBox<String> n2 = new NumberBox<>();
        n2.setValue("30");
        System.out.println(n2.getValue());

        NumberBox<Double> n3 = new NumberBox<>();
        n3.setValue(675.80);
        System.out.println(n3.getValue());

    }
}
