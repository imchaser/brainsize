package Entities;

import javax.persistence.*;

@Entity
@Table(name = "CauHoi")
public class CauHoi {

    @Id
    @Column(name = "IDCH")
    private int IDCH;
    @Column(name = "CauHoi")
    private String CauHoi;
    @Column(name = "DapAn1")
    private String DapAn1;
    @Column(name = "DapAn2")
    private String DapAn2;
    @Column(name = "DapAn3")
    private String DapAn3;
    @Column(name = "DapAn4")
    private String DapAn4;
    @Column(name = "KetQua")
    private String KetQua;
    @Column(name = "MucDo")
    private int MucDo;

    public CauHoi() {
    }

    public CauHoi(int IDCH, String CauHoi, String DapAn1, String DapAn2, String DapAn3, String DapAn4, String KetQua, int MucDo) {
        this.IDCH = IDCH;
        this.CauHoi = CauHoi;
        this.DapAn1 = DapAn1;
        this.DapAn2 = DapAn2;
        this.DapAn3 = DapAn3;
        this.DapAn4 = DapAn4;
        this.KetQua = KetQua;
        this.MucDo = MucDo;
    }

    public String getKetQua() {
        return KetQua;
    }

    public void setKetQua(String KetQua) {
        this.KetQua = KetQua;
    }

    public int getIDCH() {
        return IDCH;
    }

    public void setIDCH(int IDCH) {
        this.IDCH = IDCH;
    }

    public String getCauHoi() {
        return CauHoi;
    }

    public void setCauHoi(String CauHoi) {
        this.CauHoi = CauHoi;
    }

    public String getDapAn1() {
        return DapAn1;
    }

    public void setDapAn1(String DapAn1) {
        this.DapAn1 = DapAn1;
    }

    public String getDapAn2() {
        return DapAn2;
    }

    public void setDapAn2(String DapAn2) {
        this.DapAn2 = DapAn2;
    }

    public String getDapAn3() {
        return DapAn3;
    }

    public void setDapAn3(String DapAn3) {
        this.DapAn3 = DapAn3;
    }

    public String getDapAn4() {
        return DapAn4;
    }

    public void setDapAn4(String DapAn4) {
        this.DapAn4 = DapAn4;
    }

    public int getMucDo() {
        return MucDo;
    }

    public void setMucDo(int MucDo) {
        this.MucDo = MucDo;
    }
}
