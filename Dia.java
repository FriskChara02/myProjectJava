package BAI_29;

import java.util.List;

public class Dia extends CuaHangSach implements Gia {

    public Dia(){
        super(1);
    }

    @Override
    public double TongGiaBan(List<CuaHangSach> ds) {
        double sum = 0;
        for (CuaHangSach it : ds) {
            if (it instanceof Dia) {
                sum += it.GiaBan;
            }
        }
        return sum;
    }

    @Override
    public void nhapTT() {
        super.nhapTT(1);
    }

    @Override
    public void xuatTT() {
            super.XuatTT(1);
    }

}
