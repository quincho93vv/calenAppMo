/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AppJava;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

public class Calendar extends JFrame {
  String[] years = { "2008", "2009", "2010" };

  JComboBox comboBox = new JComboBox(years);

  String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
      "September", "October", "November", "December" };

  JList list = new JList(months);

  JScrollPane scrollPane = new JScrollPane(list);

  CalendarModel model = new CalendarModel();

  JTable table = new JTable(model);

  public Calendar() {
    super();
    
    getContentPane().setLayout(null);
    comboBox.setBounds(10, 10, 100, 30);
    comboBox.setSelectedIndex(0);
    comboBox.addItemListener(new ComboHandler());
    scrollPane.setBounds(200, 10, 150, 100);
    list.setSelectedIndex(3);
    list.addListSelectionListener(new ListHandler());
    table.setBounds(10, 150, 550, 200);
    model.setMonth(comboBox.getSelectedIndex() + 1998, list.getSelectedIndex());
    getContentPane().add(comboBox);
    getContentPane().add(scrollPane);
    table.setGridColor(Color.black);
    table.setShowGrid(true);
    getContentPane().add(table);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setSize(500, 500);
    setVisible(true);
  }

  public static void main(String[] args) {
    Calendar app = new Calendar();
  }
  public class ComboHandler implements ItemListener {
    public void itemStateChanged(ItemEvent e) {
      model.setMonth(comboBox.getSelectedIndex() + 1998, list.getSelectedIndex());
      table.repaint();
    }
  }

  public class ListHandler implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent e) {
      model.setMonth(comboBox.getSelectedIndex() + 1998, list.getSelectedIndex());
      table.repaint();
    }
  }
}
class CalendarModel extends AbstractTableModel {
  String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

  int[] numDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  String[][] calendar = new String[7][7];

  public CalendarModel() {
    for (int i = 0; i < days.length; ++i)
      calendar[0][i] = days[i];
    for (int i = 1; i < 7; ++i)
      for (int j = 0; j < 7; ++j)
        calendar[i][j] = " ";
  }

  public int getRowCount() {
    return 7;
  }

  public int getColumnCount() {
    return 7;
  }

  public Object getValueAt(int row, int column) {
    return calendar[row][column];
  }

  public void setValueAt(Object value, int row, int column) {
    calendar[row][column] = (String) value;
  }

  public void setMonth(int year, int month) {
    for (int i = 1; i < 7; ++i)
      for (int j = 0; j < 7; ++j)
        calendar[i][j] = " ";
    java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
    cal.set(year, month, 1);
    int offset = cal.get(java.util.GregorianCalendar.DAY_OF_WEEK) - 1;
    offset += 7;
    int num = daysInMonth(year, month);
    for (int i = 0; i < num; ++i) {
      calendar[offset / 7][offset % 7] = Integer.toString(i + 1);
      ++offset;
    }
  }

  public boolean isLeapYear(int year) {
    if (year % 4 == 0)
      return true;
    return false;
  }

  public int daysInMonth(int year, int month) {
    int days = numDays[month];
    if (month == 1 && isLeapYear(year))
      ++days;
    return days;
  }
}
