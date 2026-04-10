public class MethodOverloading {

    // Overloaded method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to concatenate three strings
    public String add(String a, String b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading mol = new MethodOverloading();

    //C all the overloaded methods with different parameters
        System.out.println("Adding two integers: " + mol.add(10, 20));
        System.out.println("Adding two doubles: " + mol.add(10.5, 20.3));
        System.out.println("Adding three strings: " + mol.add("Hello", " ", "World"));
    }
}