package BAI_29;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CuaHangSach {
    String Tuade;
    double GiaMua;
    double GiaBan;
    int ThoiGian;
    String NhaSanXuat;
    int SoLuong;
    int SoTrang;

    ArrayList<CuaHangSach> ds = QuanLyCuaHang.ds;
    DecimalFormat decimalFormat = new DecimalFormat("##,###");

    public CuaHangSach() {
        this.Tuade = "";
        this.GiaMua = 0;
        this.NhaSanXuat = "";
        this.SoLuong = 0;
        this.GiaBan = 0;
        this.SoTrang = 0;
        this.ThoiGian = 0;
    }

    public CuaHangSach(int type) {
        this.Tuade = "";
        this.GiaMua = 0;
        this.NhaSanXuat = "";
        this.SoLuong = 0;
        this.GiaBan = 0;
        if (type == 2) {
            this.SoTrang = 0;
        } else {
            this.ThoiGian = 0;
        }
    }

    public void nhapTT(int type) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap Tua de : ");
        this.Tuade = sc.nextLine();
        System.out.print("\nNhap Gia mua : ");
        this.GiaMua = (Double.parseDouble(sc.nextLine()));
        if (type == 2) {
            System.out.print("\nNhap So trang  : ");
            this.SoTrang = (Integer.parseInt(sc.nextLine()));
        } else {
            System.out.print("\nNhap Thoi gian con lai  : ");
            this.ThoiGian = (Integer.parseInt(sc.nextLine()));
        }
        System.out.print("\nNhap nha san xuat : ");
        this.NhaSanXuat = sc.nextLine();
        System.out.print("\nNhap So luong : ");
        this.SoLuong = (Integer.parseInt(sc.nextLine()));
        System.out.print("\nNhap gia ban  : ");
        this.GiaBan = (Double.parseDouble(sc.nextLine()));
    }

    public void XuatTT(int type) {
        String name = getNameFromType(type);
        System.out.println("\nTua de cua " + name + this.Tuade);
        System.out.println("Gia mua cua " + name + decimalFormat.format(this.GiaMua) + " vnd");
        if (type == 2) {
            System.out.println("So trang cua " + name + this.SoTrang + " trang");
        } else {
            System.out.println("Thoi gian con lai cua " + name + this.ThoiGian + " phut");
        }
        System.out.println("Nha san xuat " + name + this.NhaSanXuat);
        System.out.println("So luong con lai cua " + name + this.SoLuong + " cai");
        System.out.println("Gia ban cua " + name + decimalFormat.format(this.GiaBan) + " vnd");
    }

    private String getNameFromType(int type) {
        switch (type) {
            case 0:
                return "Bang : ";
            case 1:
                return "Dia : ";
            case 2:
                return "Sach :";
            default:
                return "Error";
        }
    }

    public void xuatDS(int type) {
        switch (type) {
            case 0:
                for (CuaHangSach it : ds) {
                    if (it instanceof Bang) {
                        ((Bang) it).xuatTT();
                    }
                }
                break;
            case 1:
                for (CuaHangSach it : ds) {
                    if (it instanceof Dia) {
                        ((Dia) it).xuatTT();
                    }
                }
                break;
            case 2:
                for (CuaHangSach it : ds) {
                    if (it instanceof Sach) {
                        ((Sach) it).xuatTT();
                    }
                }
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public void TinhTongGiatriBan(int type) {
        switch (type) {
            case 0:
                Bang b = new Bang();
                System.out.println("Tong gia tri ban cua Bang la : " + decimalFormat.format(b.TongGiaBan(ds)));
                break;
            case 1:
                Dia d = new Dia();
                System.out.println("Tong gia tri ban cua Dia la : " + decimalFormat.format(d.TongGiaBan(ds)));
                break;
            case 2:
                Sach s = new Sach();
                System.out.println("Tong gia tri ban cua Sach la : " + decimalFormat.format(s.TongGiaBan(ds)));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

}
