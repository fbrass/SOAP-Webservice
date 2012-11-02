/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.soapwebservice;

/**
 *
 * @author said
 */
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;



public class TimeClient {
    
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9876/ts?wsdl");
        
        QName qname = new QName("http://soapwebservice.spqr.de/", "TimeServerImplService");
        
        Service service = Service.create(url, qname);
        
        TimeServer eif = service.getPort(TimeServer.class);
        
        System.out.println(eif.getTimeAsString());
        System.out.println(eif.getTimeAsElapsed());
    }
}
