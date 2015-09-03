/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java.hibernate.app.withoutIDE;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import learning.java.hibernate.app.withoutIDE.Employee;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author sivakumar
 */
public class SimpleInsert {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction trs = session.beginTransaction();
        Employee emp = new Employee();
        PanCardDetails panCardDetails = new PanCardDetails();
        panCardDetails.setPanNo("BIXBG2640E");
        emp.setFirstName("TESTTEST");
        emp.setLastName("Configuration");
        emp.setPanCardDetails(panCardDetails);
        panCardDetails.setEmployee(emp);

        session.save(emp);
        trs.commit();
        session.close();
        System.out.println("Successfully save!!!!");
    }
}
