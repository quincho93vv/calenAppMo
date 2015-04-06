package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Usuarios")
public class Usuario {
    @DatabaseField(id = true)
    private String nick;
    @DatabaseField
    private String nombre;
    @DatabaseField
    private String pass;
    
    public Usuario(){
    }
    
    public Usuario(String nombre, String nick, String pass){
        this.nombre = nombre;
        this.nick = nick;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nick=" + nick + ", nombre=" + nombre + ", pass=" + pass + '}';
    }
    
}
