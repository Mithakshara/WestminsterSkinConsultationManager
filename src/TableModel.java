import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public abstract class TableModel extends AbstractTableModel {

    private String[] Col_Name ={"First Name","Second Name","Date Of Birth","Mobile Number","licence_number"," the specialisation"};
    int col_Name_length = 0;

    @Override
    public int getRowCount() {
        return WestminsterSkinConsultationManager.doctors_array.size();
    }

    @Override
    public int getColumnCount() {
        return Col_Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        if (columnIndex ==0){
            temp =WestminsterSkinConsultationManager.doctors_array.get(rowIndex).getFirstName();

        } else if (columnIndex == 1) {
            temp =WestminsterSkinConsultationManager.doctors_array.get(rowIndex).getLastName();

        } else if (columnIndex == 2) {
            temp =WestminsterSkinConsultationManager.doctors_array.get(rowIndex).getDOB();

        } else if (columnIndex ==3) {
            temp = WestminsterSkinConsultationManager.doctors_array.get(rowIndex).getMobileNO();

        } else if (columnIndex == 4) {
            temp = WestminsterSkinConsultationManager.doctors_array.get(rowIndex).getLicence_number();

        }
        else {
            temp = WestminsterSkinConsultationManager.doctors_array.get(rowIndex).getThe_specialisation();
        }
        return temp;
    }
}
