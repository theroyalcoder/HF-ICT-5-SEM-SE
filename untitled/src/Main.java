public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Statistics obj = new Statistics(3);
        obj.addNumber(1);
        obj.addNumber(2);
        obj.addNumber(3);

        System.out.println("Average: " + obj.getAverage());
    }
}
