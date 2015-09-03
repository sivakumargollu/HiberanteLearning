/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java.soap.clients;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import practice.java.soapimplementations.ExtranetFeederListenerImpl;
import practice.java.soapimplementations.ExtranetFeederListener;

/**
 *
 * @author sivakumar
 */
public class ExtranetFeederClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9995/ExtranetFeeder2/?wsdl");
        QName qname = new QName("http://soapimplementations.java.practice/", "ExtranetFeederListenerImplService");
        Service ser = Service.create(url, qname);
        ExtranetFeederListener impl = ser.getPort(ExtranetFeederListener.class);
        System.out.println(impl.reciveRequest("<test></test>"));

    }
}
