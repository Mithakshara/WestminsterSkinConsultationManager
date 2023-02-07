import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Patient_Details extends JFrame implements ActionListener {

    private static ArrayList<Patient> patientArray = new ArrayList<Patient>();
    private Container c;
    private JLabel title;
    private JLabel F_NAME;
    private static JTextField tFname;
    private static JLabel S_NAME;
    private static  JTextField tSname;
    private JLabel M_NO;
    private JTextField tM_NO;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;

    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };


    public Patient_Details()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        F_NAME = new JLabel("First Name");
        F_NAME.setFont(new Font("Arial", Font.PLAIN, 20));
        F_NAME.setSize(100, 20);
        F_NAME.setLocation(100, 100);
        c.add(F_NAME);

        tFname = new JTextField();
        tFname.setFont(new Font("Arial", Font.PLAIN, 15));
        tFname.setSize(190, 20);
        tFname.setLocation(200, 100);
        c.add(tFname);

        S_NAME = new JLabel("Second Name");
        S_NAME.setFont(new Font("Arial", Font.PLAIN, 18));
        S_NAME.setSize(100, 20);
        S_NAME.setLocation(100, 150);
        c.add(S_NAME);

        tSname = new JTextField();
        tSname.setFont(new Font("Arial", Font.PLAIN, 15));
        tSname.setSize(190, 20);
        tSname.setLocation(200, 150);
        c.add(tSname);

        M_NO = new JLabel("Mobile");
        M_NO.setFont(new Font("Arial", Font.PLAIN, 20));
        M_NO.setSize(100, 20);
        M_NO.setLocation(100, 200);
        c.add(M_NO);

        tM_NO = new JTextField();
        tM_NO.setFont(new Font("Arial", Font.PLAIN, 15));
        tM_NO.setSize(150, 20);
        tM_NO.setLocation(200, 200);
        c.add(tM_NO);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 250);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 250);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 250);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 300);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 300);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 300);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 300);
        c.add(year);

        add = new JLabel("Note");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 350);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 350);
        tadd.setLineWrap(true);
        c.add(tadd);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {

                String data1;
                String data
                        = "First Name : "
                        + tFname.getText() + "\n"
                        + "Second Name : "
                        + tSname.getText() + "\n"
                        + "Mobile : "
                        + tM_NO.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                        = "DOB : "
                        + (String)date.getSelectedItem()
                        + "/" + (String)month.getSelectedItem()
                        + "/" + (String)year.getSelectedItem()
                        + "\n";

                String data3 = "Note : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");

        }

        else if (e.getSource() == reset)
        {
            String def = "";
            tFname.setText(def);
            tSname.setText(def);
            tadd.setText(def);
            tM_NO.setText(def);
            res.setText(def);
            tout.setText(def);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }

//    public static void get_Details(){
//
//        patientArray.add(new Patient(tname.getText(),))
//        Consultation consultation = new Consultation(,)

////        WestminsterSkinConsultationManager.consultations_array.add(consultation);
//    }
}


