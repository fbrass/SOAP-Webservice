package de.spqr.soapwebservice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TimeServerPublisher.main(args);
        try{
                    TimeClient.main(args);
        } catch(Exception e){
            System.out.println(e.getCause());
        }
        
    }
}
