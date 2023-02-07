public class Patient extends Person{

    int patient_id;

    public Patient(String firstName, String lastName, String DOB,  String mobileNO) {
        super(firstName, lastName, DOB, mobileNO);
        this.patient_id=patient_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }
}
