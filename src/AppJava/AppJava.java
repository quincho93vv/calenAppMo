package AppJava;

import Modelo.DAO;
import Vista.Login;

public class AppJava {
    public static void main(String[] args) {
        DAO dao = new DAO();
        Login l = new Login(dao);
    }
    
}
