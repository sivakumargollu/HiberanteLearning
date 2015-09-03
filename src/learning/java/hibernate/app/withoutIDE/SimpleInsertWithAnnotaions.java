/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java.hibernate.app.withoutIDE;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import learning.java.hibernate.app.withoutIDE.Employee2;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author sivakumar
 */
public class SimpleInsertWithAnnotaions {

    public static void main(String[] args) {
        Configuration cfg = new AnnotationConfiguration();
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction trs = session.beginTransaction();
        Employee2 emp = new Employee2();
        emp.setId(12);
        emp.setFirstName("Annotaions");
        emp.setLastName("Configuration");
        session.update(emp);
        trs.commit();
        session.close();
        System.out.println("Successfully save!!!!");
    }

}
