public class ObjectCreator {



}
class A{
    private String name = "A";

    public A() {
        move();
    }

    public void move() {
        System.out.println("move:" + name);
    }
}
class B extends A{
    private String name = "B";

    public void move() {
        System.out.println("B move:" + name);
    }

    public static void main(String[] args) {
        new B();
    }

}
