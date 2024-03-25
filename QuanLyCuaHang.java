package BAI_29;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCuaHang {

    static ArrayList<CuaHangSach> ds = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        CuaHangSach ch = new CuaHangSach();

        do {
            System.out.println("\n0. Thoat chuong trinh quan ly !");
            System.out.println("1. Them 1 mat hang vao cua hang !");
            System.out.println("2. Tim san pham theo loai co trong cua hang !");
            System.out.println("3. Tong gia tri ban cua mat hang co trong cua hang !");
            System.out.println("-- > Moi nhap vao lua chon co trong he thong .... : ");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    System.out.print("\n Loai mat hang ma ban muon them la (0.Bang/1.Dia/2.Sach) : ");
                    int type = sc.nextInt();
                    switch (type) {
                        case 0:
                            ch = new Bang();
                            ch.nhapTT(type);
                            ds.add(ch);
                            break;
                        case 1:
                            CuaHangSach cha = new Dia();
                            cha.nhapTT(type);
                            cha.ds.add(cha);
                            break;
                        case 2:
                            CuaHangSach chb = new Sach();
                            chb.nhapTT(type);
                            chb.ds.add(chb);
                            break;
                        default:
                            System.out.println("Da nhap loi chuong trinh tu dong thoat .... !");
                            break;
                    }
                }
                    break;
                case 2: {
                    System.out.println("Nhap vao loai ma ban muon tim (0.Bang/1.Dia/2.Sach) : ");
                    int type = sc.nextInt();
                    ch.xuatDS(type);
                }
                    break;
                case 3: {
                    System.out.println("Nhap vao loai mat hang ban muon tinh tong gia tri ban (0.Bang/1.Dia/2.Sach) :");
                    int type = sc.nextInt();
                    ch.TinhTongGiatriBan(type);
                }
                    break;
                default:
                    chon = 0;
                    break;
            }
        } while (chon != 0);
    }

}
