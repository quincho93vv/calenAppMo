package AppJava;

import Modelo.DAO;
import Vista.Login;
import com.alee.laf.WebLookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class AppJava {
    public static void main(String[] args) {
        try {
          UIManager.setLookAndFeel (WebLookAndFeel.class.getCanonicalName () );
          DAO dao = new DAO();
          Login l = new Login(dao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    } 
}
