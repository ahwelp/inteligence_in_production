package dao;

import java.util.ArrayList;
import utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * @author Portella, Rodolfo <rodolfosportella@gmail.com>
 */
public abstract class GenericoDAO {

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

    public ArrayList listar(T obj, String condicao) {
        List resultado = null;

        ArrayList<T> lista = new ArrayList<>();
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            String sql = "from " + obj
                    + " where " + condicao;
            System.out.println(sql);
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

    public List listar(String entity) {
        List resultado = null;

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from " + entity);
            resultado = q.list();

        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultado;
    }
//
//    public int ProximoCodigo() {
//
//        return;
//    }

}
