package Modelo;

import java.util.List;
import javax.swing.JOptionPane;

public class Utiles {
    private static String[] head = {"Hora", "Actividad", "Detalle", "Recordatorio", "Contacto"};
    private static String[] horas = {"12:00am", "1:00am", "2:00am", "3:00am", "4:00am", "5:00am", "6:00am", "7:00am",
        "8:00am", "9:00am", "10:00am", "11:00am", "12:00pm", "1:00pm", "2:00pm", "3:00pm",
        "4:00pm", "5:00pm", "6:00pm", "7:00pm", "8:00pm", "9:00pm", "10:00pm", "11:00pm",};
    private static String[] recordatorio = {"Diario", "Mensual", "Anual"};
    
   public static String[][] setModelo(List<Actividad> actividades,boolean c) {
        String[][] activities = new String[actividades.size() * 2][5];

        for (int i = 0; i < (actividades.size() * 2); ++i) {
            for (int j = 0; j < 5; ++j) {
                activities[i][j] = "  ";
            }
        }

        if (!actividades.isEmpty()) {
            for (int i = 0, j = 0; j < actividades.size(); i += 2,j++) {
                Actividad a = actividades.get(j);
                activities[i][0] = getHoras()[a.getHora().getHours()];
                activities[i][1] = a.getNombre();
                activities[i][2] = a.getDetalle();
                activities[i][3] = getRecordatorio()[a.getTipo() - 1];
                activities[i][4] = a.getUser().getNick();
            }
        } else if(c){
            JOptionPane.showMessageDialog(null, "No hay actividades para este dia!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
        return activities;
    }

    public static String[] getHead() {
        return head;
    }

    public static String[] getHoras() {
        return horas;
    }

    public static String[] getRecordatorio() {
        return recordatorio;
    }
    
       /*private void setActividades() {
     String activities = "";
     for (int i = 0; i < actividades.size(); i += 2) {
     Actividad a = actividades.get(i);
     activities += horas[a.getHora().getHours()]+"     ";
     activities += a.getNombre()+"  ";
     activities += a.getDetalle()+"  ";
     activities += recordatorio[a.getTipo()-1]+"  ";
     activities += a.getUser().getNick();
     activities += "\n\n";
     }
     panel_actividades.setText(activities);
     panel_actividades.setEditable(false);
     }*/
}


