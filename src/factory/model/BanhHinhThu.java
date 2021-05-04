package factory.model;

public class BanhHinhThu implements Banh {
    @Override
    public void getName(String name) {
        System.out.println("Hình Thú");
    }

    public BanhHinhThu() {
        System.out.println("Bánh hình thú");
    }
}