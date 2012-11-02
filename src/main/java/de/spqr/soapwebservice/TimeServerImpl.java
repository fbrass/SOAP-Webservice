/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.soapwebservice;

/**
 *
 * @author said
 */
import java.util.Date;
import javax.jws.WebService;


@WebService(endpointInterface = "de.spqr.soapwebservice.TimeServer")
public class TimeServerImpl implements TimeServer {
    @Override
    public String getTimeAsString() {return new Date().toString(); }
    @Override
    public long getTimeAsElapsed() {return new Date().getTime(); }
}
