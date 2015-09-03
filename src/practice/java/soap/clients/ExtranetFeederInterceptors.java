/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java.soap.clients;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author sivakumar
 */
public class ExtranetFeederInterceptors implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext messageContext) {
        try {
            SOAPMessage msg = messageContext.getMessage();
            System.out.println("Incoming message:");
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            msg.writeTo(stream);

            System.out.println(stream.toString());
            System.out.println("=====================================");

        } catch (SOAPException ex) {
            Logger.getLogger(ExtranetFeederInterceptors.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExtranetFeederInterceptors.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public Set<QName> getHeaders() {
        System.out.println("Into headers");
        return Collections.EMPTY_SET;

    }

    public boolean handleFault(SOAPMessageContext messageContext) {
        System.out.println("Into fault");
        return true;
    }

    public void close(MessageContext context) {
        System.out.println("Into close");
    }
}
