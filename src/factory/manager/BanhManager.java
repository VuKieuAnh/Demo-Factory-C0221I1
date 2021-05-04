package factory.manager;

import factory.LoaiBanh;
import factory.model.Banh;
import factory.model.BanhDeo;

public class BanhManager {
    public static void main(String[] args) {
        Banh b1 = BanhFactory.getBanh(LoaiBanh.BanhNuong);
    }
}