package dao;

import utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 * @author Portella, Rodolfo <rodolfosportella@gmail.com>
 * @param <T>
 */
public class GenericoDAO<T> {

    private final Object obj;
    private final Session s;

    public GenericoDAO(Object obj) {
        s = HibernateUtil.getSession();
        s.beginTransaction();
        this.obj = obj;
    }

    public String gravar() {
        try {
            s.saveOrUpdate(this.obj);
            s.getTransaction().commit();
            return "Gravado com sucesso!";
        } catch (Exception e) {
            s.getTransaction().rollback();
            System.out.println("Erro ao gravar: " + e.getMessage());
            return "Houve algum problema para gravado!";
        } finally {
            s.close();
        }
    }

    public String excluir() {
        try {
            s.delete(this.obj);
            s.getTransaction().commit();
            return "Excluido com sucesso!";
        } catch (Exception e) {
            s.getTransaction().rollback();
            System.out.println("Erro ao excluir: " + e.getMessage());
            return "Houve algum problema para excluir!";
        } finally {
            s.close();
        }
    }

    public T visualizar(int cod) {
        try {
            return (T) s.createCriteria(this.obj.getClass())
                    .add(Restrictions.eq("codigo", cod))
                    .uniqueResult();
        } catch (Exception e) {
            s.getTransaction().rollback();
            System.out.println("Erro ao visualizar: " + e.getMessage());
            return null;
        } finally {
            s.close();
        }
    }

    public List listar() {
        try {
            return s.createCriteria(this.obj.getClass())
                    .list();
        } catch (Exception e) {
            s.getTransaction().rollback();
            System.out.println("Erro ao listar tudo: " + e.getMessage());
            return null;
        } finally {
            s.close();
        }
    }

    public List Listar(String coluna, String criterio) {
        try {
            return s.createCriteria(this.obj.getClass())
                    .add(Restrictions.like(coluna, "%" + criterio + "%")
                            .ignoreCase()).list();
        } catch (Exception e) {
            s.getTransaction().rollback();
            System.out.println("Erro ao listar composta: " + e.getMessage());
            return null;
        } finally {
            s.close();
        }
    }

    public int ProximoCodigo() {
        try {
            return (int) s.createCriteria(this.obj.getClass())
                    .setProjection(Projections.max("codigo"))
                    .uniqueResult() + 1;
        } catch (Exception e) {
            s.getTransaction().rollback();
            System.out.println("Erro ao listar tudo: " + e.getMessage());
            return 0;
        } finally {
            s.close();
        }
    }

}
