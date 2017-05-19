package client;

import ws.SimpleWS;
import ws.SimpleWSImpl;

import javax.xml.namespace.QName;

import javax.xml.ws.Service;
import java.net.URL;

public class SimpleWSClient
{
    public static void main(String[] args) throws Exception
    {
        QName qName = new QName("http://ws/", "SimpleWSImplService");
        URL url = new URL("http://localhost:8080/?wsdl");
        Service service = Service.create(url, qName);
        SimpleWS ws = service.getPort(SimpleWS.class);

        System.out.println(ws.getMessage("Hello world"));
    }
}
