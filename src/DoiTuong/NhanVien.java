/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

/**
 *
 * @author Dinh Duc
 */
public class NhanVien extends Nguoi{
    private String chucVu;
    private int CMTND;
    private String path_Anh;

    public NhanVien(String id, String name, String ngaySinh, int soDienThoai, String gioiTinh, String diaChi, String chucVu, int CMTND, String path_Anh) {
        super(id, name, ngaySinh, soDienThoai, gioiTinh, diaChi);
        this.chucVu = chucVu;
        this.CMTND = CMTND;
        this.path_Anh = path_Anh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    
    
}
