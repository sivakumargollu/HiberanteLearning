/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java.soapimplementations;

//import com.sun.xml.internal.ws.api.ha.StickyFeature;
import javax.jws.WebService;

/**
 *
 * @author
 * sivakumar
 */
@WebService(endpointInterface = "practice.java.soapimplementations.ExtranetFeederListener")
public class ExtranetFeederListenerImpl implements ExtranetFeederListener {

    @Override
    public int reciveRequest(String xmlRQ) {
        System.out.println("xml req"+xmlRQ);
        return 1000;
    }



}
