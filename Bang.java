package BAI_29;

import java.util.List;

public class Bang extends CuaHangSach implements Gia {

    public Bang() {
        super(0);
    }

    @Override
    public double TongGiaBan(List<CuaHangSach> ds) {
        double sum = 0;
        for (CuaHangSach it : ds) {
            if (it instanceof Bang) {
                sum += it.GiaBan;
            }
        }
        return sum;
    }

    @Override
    public void nhapTT() {
        super.nhapTT(0);
    }

    @Override
    public void xuatTT() {
        super.XuatTT(0);
    }

}
