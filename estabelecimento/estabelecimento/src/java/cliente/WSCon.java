/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cliente;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Elizeu
 */
public class WSCon {
    
    public static String verificaLogin(java.lang.String login, java.lang.String senha) {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/EstWS/EstWS?wsdl");
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        ine5646.EstWS_Service service = new ine5646.EstWS_Service();
        ine5646.EstWS port = service.getEstWSPort();
        return port.verificaLogin(login, senha);
    }
}
