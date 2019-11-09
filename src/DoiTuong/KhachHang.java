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
public class KhachHang extends Nguoi{
    private int id;
    private int soLanMuaHang;

    public KhachHang(String id, String name, String ngaySinh, int soDienThoai, String gioiTinh, String diaChi, int soLanMuaHang) {
        super(id, name, ngaySinh, soDienThoai, gioiTinh, diaChi);
        this.soLanMuaHang = soLanMuaHang;
    }


    public int getSoLanMuaHang() {
        return soLanMuaHang;
    }

    public void setSoLanMuaHang(int soLanMuaHang) {
        this.soLanMuaHang = soLanMuaHang;
    }
    
    

    
    
    
    
}
