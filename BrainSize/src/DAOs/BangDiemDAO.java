package DAOs;

import Entities.BangDiem;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BangDiemDAO {
    
    public BangDiem getRank(int top){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        BangDiem bd = null;
        try {
            tr = session.beginTransaction();
            bd = (BangDiem) session.createQuery("from BangDiem order by Diem desc").setFirstResult(top-1).setMaxResults(1).uniqueResult();
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            session.close();
        }
        return bd;
    }
    
}
