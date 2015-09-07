/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java.hibernate.app.withoutIDE;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Siva
 */
public class EmployeeAdressInsert {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
//        EmployeeAdress emp_add = new EmployeeAdress();
//        emp_add.setAddress("9-9-46/8,Mangapuram colony,Near Kalabharathi,Vizag,530013");
//        emp_add.setEmp_id(1256);
//        session.save(emp_add);
        EmployeeInfo employeeInfo = new EmployeeInfo();
//        employeeInfo.setEmp_address_id(11223);
//        employeeInfo.setEmp_attend_id(5526);
//        employeeInfo.setEmp_id(5268);
//        String sql = "from test.employee_info";
//        Query  sq;
        employeeInfo.setId(100);
        employeeInfo.setEmp_address_id(200000);
        employeeInfo.setEmp_attend_id(50000);
        session.persist(employeeInfo);
        tr.commit();
        System.out.println("Record inserted successfully!!!!!");
        EmployeeInfo emp1 = (EmployeeInfo)session.get(EmployeeInfo.class, new Integer(100));
        System.out.println(""+emp1.getEmp_address_id());

    }

}
