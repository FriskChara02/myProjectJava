package BAI_29;

import java.util.List;

public class Sach extends CuaHangSach implements Gia  {

    public Sach(){
        super(2);
    }

   public double TongGiaBan(List<CuaHangSach> ds) {
    double sum = 0;
    for (CuaHangSach it : ds) {
        sum += it.GiaBan;
    }
    return sum;
}

    @Override
    public void nhapTT() {
       super.nhapTT(2);
    }

    @Override
    public void xuatTT() {
       super.XuatTT(2);
    }
    
}
