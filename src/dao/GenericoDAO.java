package dao;

import utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * @author Portella, Rodolfo <rodolfosportella@gmail.com>
 */
public class GenericoDAO {

    public String gravar(Object obj) {
        try {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
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

    public List listar() {
        List resultado = null;

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from Classe");
            resultado = q.list();

        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultado;
    }

}
