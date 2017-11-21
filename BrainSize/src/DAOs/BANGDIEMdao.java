package DAOs;

import Util.HibernateUtil;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name = "BANGDIEM")
public class BANGDIEMdao {
    @Id
    @Column(name = "IDBD")
    private int IDBD;
    @Column(name = "Ten")
    private String Ten;
    @Column(name = "Diem")
    private int Diem;

    public BANGDIEMdao() {
    }

    public BANGDIEMdao(int IDBD, String Ten, int Diem) {
        this.IDBD = IDBD;
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
    
    // Các phương thức của bảng điểm
    
    public BANGDIEMdao getRank(int top){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        BANGDIEMdao bd = null;
        try {
            tr = session.beginTransaction();
            bd = (BANGDIEMdao) session.createQuery("from BANGDIEMdao order by Diem desc").setFirstResult(top-1).setMaxResults(1).uniqueResult();
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            session.close();
        }
        return bd;
    }
    
}
