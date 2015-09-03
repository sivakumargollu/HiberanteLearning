/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java.hibernate.app.withoutIDE;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import learning.java.hibernate.app.withoutIDE.Employee;

/**
 * pan_card_details
 *
 * @author sivakumar
 */
public class PanCardDetails {

    int id;
    Date issue_date;
    String panNo;
    Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public PanCardDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }
}
