package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

@DatabaseTable(tableName = "Actividades")
public class Actividad {
    @DatabaseField(id = true)
    private String nombre;
    @DatabaseField
    private Date fecha;
    @DatabaseField
    private String detalle;
    @DatabaseField
    private int tipoRepeticion; // esto hay q ver cm se maneja, puede ser un int o nose, yo digo 1 para diario, 2 para semanal, 3 para mensual, etc
    @DatabaseField(canBeNull = false, foreign = true, columnName = "Usuario")
    private Usuario user;
    
    
    public Actividad(){
    }
    
    public Actividad(String nombre, Date fecha, String detalle, int tipo){
        this.nombre = nombre;
        this.fecha = fecha;
        this.detalle = detalle;
        this.tipoRepeticion = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getTipoRepeticion() {
        return tipoRepeticion;
    }

    public void setTipoRepeticion(int tipoRepeticion) {
        this.tipoRepeticion = tipoRepeticion;
    }
    
}
