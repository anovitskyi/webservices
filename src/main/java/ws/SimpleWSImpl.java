package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.DateFormat;
import java.util.Date;

@WebService(endpointInterface = "ws.SimpleWS")
public class SimpleWSImpl implements SimpleWS
{
    public String getMessage(String message)
    {
        return "Your message "
                + message
                + "\nDate "
                + DateFormat.getDateInstance().format(new Date());
    }
}
