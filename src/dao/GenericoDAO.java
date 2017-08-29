package dao;

import entitys.Cidade;
import entitys.Pais;
import java.sql.ResultSet;
import java.util.ArrayList;
import utils.HibernateUtil;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.ehcache.search.expression.Between;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

/**
 * @author Portella, Rodolfo <rodolfosportella@gmail.com>
 */
public class GenericoDAO<T> {

    public String gravar(Object obj) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(obj);
            s.getTransaction().commit();
            s.close();
            return "Gravado com sucesso!";
        } catch (Exception e) {
            System.out.println(e);
            return "Houve algum problema para gravado!";
        }
    }

    public String atualizar(Object obj) {
        try {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            s.update(obj);
            s.getTransaction().commit();
            return "Atualizado com sucesso!";
        } catch (Exception e) {
            System.out.println(e);
            return "Houve algum problema para atualizar!";
        }
    }

    public String excluir(Object obj) {
        try {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            s.delete(obj);
            s.getTransaction().commit();
            return "Excluido com sucesso!";
        } catch (Exception e) {
            System.out.println(e);
            return "Houve algum problema para excluir!";
        }
    }

    public Object visualizar(int Cod) {
        return null;
    }

    public ArrayList<T> listar(T obj, String condicao) {
        List resultado = null;

        ArrayList<T> lista = new ArrayList<>();
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            String sql = "from " + obj.getClass().getName()
                    + ((condicao.isEmpty()) ? "" : (" where " + condicao));
            org.hibernate.Query q = s.createQuery(sql);

            resultado = q.list();

            for (Object o : resultado) {
                T object = ((T) ((Object) o));
                lista.add(object);
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return lista;
    }

    public int ProximoCodigo(T obj, String condicao) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            Criteria criteria = s.createCriteria(obj.getClass());

            int maxId
                    = (int) criteria.setProjection(Projections.max("codigo"))
                            .uniqueResult();

            return maxId + 1;

        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return 00;
    }


}
