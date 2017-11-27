package Entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "BangDiem")
public class BangDiem implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDBD")
    private int IDBD;
    @Column(name = "Ten")
    private String Ten;
    @Column(name = "Diem")
    private int Diem;

    public BangDiem() {
    }

    public BangDiem( String Ten, int Diem) {
        this.Ten = Ten;
        this.Diem = Diem;
    }

    public int getIDBD() {
        return IDBD;
    }

    public void setIDBD(int IDBD) {
        this.IDBD = IDBD;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int Diem) {
        this.Diem = Diem;
    }

}
