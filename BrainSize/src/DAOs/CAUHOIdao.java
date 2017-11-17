package DAOs;

import Util.HibernateUtil;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Entity
@Table(name = "CAUHOI")
public class CAUHOIdao {
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
    @Column(name = "MucDo")
    private int MucDo;

    public CAUHOIdao() {
    }

    public CAUHOIdao(int IDCH, String CauHoi, String DapAn1, String DapAn2, String DapAn3, String DapAn4, int MucDo) {
        this.IDCH = IDCH;
        this.CauHoi = CauHoi;
        this.DapAn1 = DapAn1;
        this.DapAn2 = DapAn2;
        this.DapAn3 = DapAn3;
        this.DapAn4 = DapAn4;
        this.MucDo = MucDo;
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

    public ArrayList<CAUHOIdao> getListCH(int mucdo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        ArrayList<CAUHOIdao> lst = null;
        try {
            tr = session.beginTransaction();
            lst = (ArrayList<CAUHOIdao>) session.createQuery("from CAUHOIdao where MucDo= " + mucdo).list();
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return lst;
    }
    //cac phương thức của câu hỏi

}
