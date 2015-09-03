/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java.soapimplementations;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author
 * sivakumar
 */
@WebService
@HandlerChain(file = "handler-chain.xml")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ExtranetFeederListener {

    @WebMethod(operationName = "reciveRequest")
    public int reciveRequest(@WebParam(name = "xmlRQ") String xmlRQ);
}
