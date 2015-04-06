package Vista;

import Modelo.DAO;
import java.awt.Color;
import java.util.Calendar;


public class Vista extends javax.swing.JFrame {

    public Vista(DAO dao) {
        initComponents();  
        setMonth(Calendar.YEAR,Calendar.MONTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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

        btn_mes_plus.setText(">");

        label_mes_anyo.setText("jLabel1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(setModel(),dias));
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(Color.black);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        btn_anyo_less.setText("<<");

        btn_anyo_plus.setText(">>");

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

    
    String[] dias = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
  int[] diasXmes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  String[][] calendario = new String[7][7];

  public String[][] setModel() {
    for (int i = 1; i < 7; ++i)
      for (int j = 0; j < 7; ++j)
        calendario[i][j] = " ";
    
    return calendario;
  }

  public int getFilas() {
    return 7;
  }

  public int getColumnas() {
    return 7;
  }

  public Object getValueAt(int row, int column) {
    return calendario[row][column];
  }

  public void setValueAt(Object value, int row, int column) {
    calendario[row][column] = (String) value;
  }

  public void setMonth(int year, int month) {
    for (int i = 1; i < 7; ++i)
      for (int j = 0; j < 7; ++j)
        calendario[i][j] = " ";
    java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
    cal.set(year, month, 1);
    int offset = cal.get(java.util.GregorianCalendar.DAY_OF_WEEK) - 1;
    offset += 7;
    int num = daysInMonth(year, month);
    for (int i = 0; i < num; ++i) {
      calendario[offset / 7][offset % 7] = Integer.toString(i + 1);
      ++offset;
    }
    jTable1.repaint();
  }

  public boolean isLeapYear(int year) {
    if (year % 4 == 0)
      return true;
    return false;
  }

  public int daysInMonth(int year, int month) {
    int days = diasXmes[month];
    if (month == 1 && isLeapYear(year))
      ++days;
    return days;
  }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anyo_less;
    private javax.swing.JButton btn_anyo_plus;
    private javax.swing.JButton btn_mes_less;
    private javax.swing.JButton btn_mes_plus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_mes_anyo;
    // End of variables declaration//GEN-END:variables
}

