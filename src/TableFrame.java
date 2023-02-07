import javax.print.Doc;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.ArrayList;


public class TableFrame extends JFrame {
    ArrayList<Doctor> doctors = new ArrayList<>();
    public TableFrame(ArrayList<Doctor> doctors) {
        setSize(700, 400);
        setBackground(new Color(0x0F9FE1));
        setLayout(new BorderLayout());
        this.doctors = doctors;

        DoctorsTableModel doctorsTableModel = new DoctorsTableModel();
        DoctorsTable doctorsTable = new DoctorsTable(doctorsTableModel);
        add(new JScrollPane(doctorsTable), BorderLayout.CENTER);
        ;



    }

    public class DoctorsTable extends JTable {
        public DoctorsTable(AbstractTableModel model) {
            super(model);
            setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setRowSorter(new TableRowSorter<>(new DoctorsTableModel()));
            setFont(new Font("Arial", Font.PLAIN, 15));

        }
    }

    public class DoctorsTableModel extends AbstractTableModel {

        String[] columns = {"FIRST NAME", "LAST NAME", "License NO", "SPECILATION","MOBILE NO"};

        Class[] columnClasses = new Class[]{

                String.class,
                String.class,
                Integer.class,
                String.class,
                Integer.class
        };


        @Override
        public int getRowCount() {
            return doctors.size();
        }


        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0 -> {
                    return doctors.get(rowIndex).getFirstName();
                }
                case 1 -> {
                    return doctors.get(rowIndex).getLastName();
                }
                case 2 -> {
                    return doctors.get(rowIndex).getLicence_number();
                }
                case 3 -> {
                    return doctors.get(rowIndex).getThe_specialisation();
                }
                case 4 -> {
                    return doctors.get(rowIndex).getMobileNO();
                }
                default -> {
                    return null;
                }
            }
        }

        @Override
        public String getColumnName(int column) {
            return columns[column];
        }

        /**
         * Returns <code>Object.class</code> regardless of <code>columnIndex</code>.
         *
         * @param columnIndex the column being queried
         * @return the Object. Class
         */
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return columnClasses[columnIndex];
        }
    }
}