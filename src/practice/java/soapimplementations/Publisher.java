/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java.soapimplementations;

import javax.xml.ws.Endpoint;
import practice.java.soapimplementations.ExtranetFeederListenerImpl;

/**
 *
 * @author
 * sivakumar
 */

public class Publisher {

    public static void main(String[] args) {
      //  ExtranetFeederListenerImpl ExtFeederImpl = new ExtranetFeederListenerImpl();
       // EndPoint.p
        Endpoint.publish("http://localhost:9995/ExtranetFeeder2/", new ExtranetFeederListenerImpl());

    }

}
