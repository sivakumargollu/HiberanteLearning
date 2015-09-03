/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java.hibernate.app.withoutIDE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import learning.java.hibernate.app.withoutIDE.PanCardDetails;

/**
 *
 * @author sivakumar
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private PanCardDetails panCardDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public PanCardDetails getPanCardDetails() {
        return panCardDetails;
    }

    public void setPanCardDetails(PanCardDetails panCardDetails) {
        this.panCardDetails = panCardDetails;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}