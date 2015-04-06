package Vista;

import Modelo.DAO;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Vista extends javax.swing.JFrame {
    
    private DAO dao=null;
    public Vista(DAO dao) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.dao=dao;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_actividades = new javax.swing.JPanel();
        panel_calendario = new javax.swing.JPanel();
        btn_mes_less = new javax.swing.JButton();
        btn_mes_plus = new javax.swing.JButton();
        label_mes_anyo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_calendar = new javax.swing.JTable();
        btn_anyo_less = new javax.swing.JButton();
        btn_anyo_plus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calendar");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout panel_actividadesLayout = new javax.swing.GroupLayout(panel_actividades);
        panel_actividades.setLayout(panel_actividadesLayout);
        panel_actividadesLayout.setHorizontalGroup(
            panel_actividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        panel_actividadesLayout.setVerticalGroup(
            panel_actividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Actividades pendientes", panel_actividades);

        btn_mes_less.setText("<");
        btn_mes_less.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mes_lessActionPerformed(evt);
            }
        });

        btn_mes_plus.setText(">");
        btn_mes_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mes_plusActionPerformed(evt);
            }
        });

        label_mes_anyo.setText("jLabel1");

        table_calendar.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
        table_calendar.setDragEnabled(false);
        table_calendar.setGridColor(Color.black);
        table_calendar.setShowGrid(true);
        table_calendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_calendarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_calendar);

        btn_anyo_less.setText("<<");
        btn_anyo_less.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anyo_lessActionPerformed(evt);
            }
        });

        btn_anyo_plus.setText(">>");
        btn_anyo_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anyo_plusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_calendarioLayout = new javax.swing.GroupLayout(panel_calendario);
        panel_calendario.setLayout(panel_calendarioLayout);
        panel_calendarioLayout.setHorizontalGroup(
            panel_calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_calendarioLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btn_anyo_less)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mes_less)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_mes_anyo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mes_plus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_anyo_plus)
                .addGap(97, 97, 97))
            .addGroup(panel_calendarioLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        panel_calendarioLayout.setVerticalGroup(
            panel_calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_calendarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mes_less)
                    .addComponent(btn_mes_plus)
                    .addComponent(label_mes_anyo)
                    .addComponent(btn_anyo_less)
                    .addComponent(btn_anyo_plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calendario", panel_calendario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mes_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mes_plusActionPerformed
        // TODO add your handling code here:
        mes++;
        table_calendar.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
    }//GEN-LAST:event_btn_mes_plusActionPerformed

    private void btn_anyo_lessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anyo_lessActionPerformed
        // TODO add your handling code here:
        annyo--;
        table_calendar.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
    }//GEN-LAST:event_btn_anyo_lessActionPerformed

    private void btn_mes_lessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mes_lessActionPerformed
        // TODO add your handling code here:
        mes--;
        table_calendar.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
    }//GEN-LAST:event_btn_mes_lessActionPerformed

    private void btn_anyo_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anyo_plusActionPerformed
        // TODO add your handling code here:
        annyo++;
        table_calendar.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
    }//GEN-LAST:event_btn_anyo_plusActionPerformed

    private void table_calendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_calendarMouseClicked
        // TODO add your handling code here:
        String obj=null;
        if (evt.getClickCount() == 1) {
            final javax.swing.JTable target = (javax.swing.JTable)evt.getSource();
            final int row = target.getSelectedRow();
            final int column = target.getSelectedColumn();
            obj = (String)target.getValueAt(row, column);
        }
        System.out.println("Pressed "+obj);
        String date = obj + " de " + meses[mes] + " de " + annyo;
        ActividadesDia actividades = new ActividadesDia(dao, date);
    }//GEN-LAST:event_table_calendarMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista(new DAO()).setVisible(true);
            }
        });
    }

    String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre", "Octubre", "Noviembre", "Diciemrbre"};
    int[] diasXmes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[][] calendario = new String[6][7];
    Calendar fecha = new GregorianCalendar();
    int annyo = fecha.get(Calendar.YEAR);
    int mes = fecha.get(Calendar.MONTH);

    public int getFilas() {
        return 6;
    }

    public int getColumnas() {
        return 7;
    }

    public Object getValueAt(int fila, int col) {
        return calendario[fila][col];
    }

    public void setValueAt(Object v, int fila, int col) {
        calendario[fila][col] = (String) v;
    }

    public String[][] setCalendar(int mes, int anyo) {
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 7; ++j) {
                calendario[i][j] = "  ";
            }
        }
        java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
        cal.set(anyo, mes, 1);
        int offset = cal.get(java.util.GregorianCalendar.DAY_OF_WEEK) - 1;
        //offset += 7;
        int num = daysInMonth(mes, anyo);
        for (int i = 0; i < num; ++i) {
            calendario[offset / 7][offset % 7] = Integer.toString(i + 1);
            ++offset;
        }
        label_mes_anyo.setText(meses[mes] + " " + annyo);
        return calendario;
    }

    public boolean anyoBisiesto(int anyo) {
        if (anyo % 4 == 0) {
            return true;
        }
        return false;
    }

    public int daysInMonth(int mes, int anyo) {
        int days = diasXmes[mes];
        if (mes == 1 && anyoBisiesto(anyo)) {
            ++days;
        }
        return days;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anyo_less;
    private javax.swing.JButton btn_anyo_plus;
    private javax.swing.JButton btn_mes_less;
    private javax.swing.JButton btn_mes_plus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_mes_anyo;
    private javax.swing.JPanel panel_actividades;
    private javax.swing.JPanel panel_calendario;
    private javax.swing.JTable table_calendar;
    // End of variables declaration//GEN-END:variables
}
