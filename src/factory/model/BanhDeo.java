package factory.model;

public class BanhDeo implements Banh {
    @Override
    public void getName(String name) {
        System.out.println("Dẻo");
    }

    public BanhDeo() {
        System.out.println("Bánh dẻo");
    }
}