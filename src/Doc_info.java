import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Doc_info extends JFrame  {

    JTable info;
    TableModel tableModel;


    Doc_info(ArrayList<Doctor> doctors_array)
    {
        this.setTitle("Westminster Skin Consultation");
        this.setVisible(true);
        this.setBounds(10, 10, 340, 340);



        JPanel Home_panel = new JPanel();


        Home_panel.setBackground(Color.cyan);

        info = new JTable(tableModel);


        JLabel lbl_Hi = new JLabel("Hi");


        this.add(Home_panel);
    }
}
