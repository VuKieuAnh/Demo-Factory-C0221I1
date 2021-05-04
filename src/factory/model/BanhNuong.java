package factory.model;

public class BanhNuong implements Banh {
    public BanhNuong() {
        System.out.println("Bánh nướng");
    }

    @Override
    public void getName(String name) {
        System.out.println("Nướng");
    }
}