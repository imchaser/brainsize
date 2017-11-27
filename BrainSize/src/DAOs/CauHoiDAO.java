package DAOs;

import Entities.CauHoi;
import Util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CauHoiDAO {

    public ArrayList<CauHoi> getListCH(int mucdo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        ArrayList<CauHoi> lst = null;
        try {
            tr = session.beginTransaction();
            lst = (ArrayList<CauHoi>) session.createQuery("from CauHoi where MucDo= " + mucdo).list();
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return lst;
    }

    public CauHoi getCH(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        CauHoi ch = null;
        try {
            tr = session.beginTransaction();
            ch = (CauHoi) session.createQuery("from CauHoi where IDCH =" + id).uniqueResult();
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return ch;
    }

}
