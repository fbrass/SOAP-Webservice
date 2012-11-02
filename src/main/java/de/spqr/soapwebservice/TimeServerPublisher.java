/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.soapwebservice;

/**
 *
 * @author said
 */
import javax.xml.ws.Endpoint;

public class TimeServerPublisher {

   public static void main(String[] args) {
        System.out.println("SOAP WS Endpoint listens ...");
        Endpoint.publish("http://127.0.0.1:9876/ts", new TimeServerImpl());
    }
}