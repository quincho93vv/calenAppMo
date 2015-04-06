package Vista;

import Modelo.DAO;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Vista extends javax.swing.JFrame {

    public Vista(DAO dao) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.combo_recordar.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Diariamente", "Mensualmente", "Anualmente"}));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_mes_less = new javax.swing.JButton();
        btn_mes_plus = new javax.swing.JButton();
        label_mes_anyo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_anyo_less = new javax.swing.JButton();
        btn_anyo_plus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        input_fecha = new javax.swing.JTextField();
        input_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_detalle = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        combo_recordar = new javax.swing.JComboBox();
        btn_agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calendar");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Actividades pendientes", jPanel1);

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
        jTable1.setDragEnabled(false);
        jTable1.setGridColor(Color.black);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mes_less)
                    .addComponent(btn_mes_plus)
                    .addComponent(label_mes_anyo)
                    .addComponent(btn_anyo_less)
                    .addComponent(btn_anyo_plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calendario", jPanel2);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Fecha");

        jLabel3.setText("Detalle");

        input_detalle.setColumns(20);
        input_detalle.setRows(5);
        jScrollPane2.setViewportView(input_detalle);

        jLabel4.setText("Recordar:");

        combo_recordar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_agregar.setText("Agregar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Agregar Actividad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(input_fecha)
                            .addComponent(input_nombre)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(combo_recordar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel5)))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(input_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(combo_recordar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Actividad", jPanel3);

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
        jTable1.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
    }//GEN-LAST:event_btn_mes_plusActionPerformed

    private void btn_anyo_lessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anyo_lessActionPerformed
        // TODO add your handling code here:
        annyo--;
        jTable1.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
    }//GEN-LAST:event_btn_anyo_lessActionPerformed

    private void btn_mes_lessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mes_lessActionPerformed
        // TODO add your handling code here:
        mes--;
        jTable1.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
    }//GEN-LAST:event_btn_mes_lessActionPerformed

    private void btn_anyo_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anyo_plusActionPerformed
        // TODO add your handling code here:
        annyo++;
        jTable1.setModel(new javax.swing.table.DefaultTableModel(setCalendar(mes, annyo),dias));
    }//GEN-LAST:event_btn_anyo_plusActionPerformed

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
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_anyo_less;
    private javax.swing.JButton btn_anyo_plus;
    private javax.swing.JButton btn_mes_less;
    private javax.swing.JButton btn_mes_plus;
    private javax.swing.JComboBox combo_recordar;
    private javax.swing.JTextArea input_detalle;
    private javax.swing.JTextField input_fecha;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_mes_anyo;
    // End of variables declaration//GEN-END:variables
}
