package Modelo;

import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class ReportGenerator extends TimerTask {
    
    private Actividad actividad;
    public static final long DIARIO = 86400000L;
    public static final long SEMANUAL = 604800000L;
    public static final long MENSUAL = 2629750000L;
    public static final long ANUAL = 31556900000L;
    
    public ReportGenerator(Actividad a){
        this.actividad = a;
    }
    
    public void run() {
        JOptionPane.showMessageDialog(null, "Actividad: " + actividad.getNombre() + ", Detalle : " + actividad.getDetalle());
    }
    
    public static void comenzar(Actividad a) { //inicia el proceso de ejecucion cada tiempo establecido
        Timer timer = new Timer();
            Calendar date = Calendar.getInstance();
            date.setTime(a.getFecha());
            date.set(Calendar.HOUR, a.getHora().getHours());
            date.set(Calendar.MINUTE, a.getHora().getMinutes());
            date.set(Calendar.SECOND, a.getHora().getSeconds());
            if(a.getTipo() == 0) 
                timer.schedule(new ReportGenerator(a),date.getTime());
            else if(a.getTipo() == 1) 
                timer.schedule(new ReportGenerator(a),date.getTime(),ReportGenerator.DIARIO);
            else if(a.getTipo() == 2) 
                timer.schedule(new ReportGenerator(a),date.getTime(),ReportGenerator.MENSUAL);
            else if(a.getTipo() == 3) 
                timer.schedule(new ReportGenerator(a),date.getTime(),ReportGenerator.ANUAL);
    }
    
    public static void comenzar(List<Actividad> actividades) { //inicia el proceso de ejecucion cada tiempo establecido
        Timer timer = new Timer();
        for(Actividad a: actividades){
            Calendar date = Calendar.getInstance();
            date.setTime(a.getFecha());
            date.set(Calendar.HOUR, a.getHora().getHours());
            date.set(Calendar.MINUTE, a.getHora().getMinutes());
            date.set(Calendar.SECOND, a.getHora().getSeconds());
            if(a.getTipo() == 0) 
                timer.schedule(new ReportGenerator(a),date.getTime());
            else if(a.getTipo() == 1) 
                timer.schedule(new ReportGenerator(a),date.getTime(),ReportGenerator.DIARIO);
            else if(a.getTipo() == 2) 
                timer.schedule(new ReportGenerator(a),date.getTime(),ReportGenerator.MENSUAL);
            else if(a.getTipo() == 3) 
                timer.schedule(new ReportGenerator(a),date.getTime(),ReportGenerator.ANUAL);
        }
    }

}
