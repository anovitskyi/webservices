package endpoint;

import ws.SimpleWSImpl;

import javax.xml.ws.Endpoint;

public class SimpleEndpoint
{
    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:8080/", new SimpleWSImpl());
    }
}
