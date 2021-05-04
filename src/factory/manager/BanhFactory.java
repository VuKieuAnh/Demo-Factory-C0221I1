package factory.manager;

import factory.LoaiBanh;
import factory.model.Banh;
import factory.model.BanhDeo;
import factory.model.BanhHinhThu;
import factory.model.BanhNuong;

public class BanhFactory {
    private BanhFactory() {
    }

    public static Banh getBanh(LoaiBanh type){
        Banh banh;
        switch (type){
            case BanhDeo:
                banh=  new BanhDeo();
                break;
            case BanhNuong:
                banh =  new BanhNuong();
                break;
            case BanhHinhThu:
                banh= new BanhHinhThu();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return banh;
        
    }
}