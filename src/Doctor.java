public class Doctor extends Person {

    private String licence_number;
    private String the_specialisation;
    public static int doc_count = 0;



    public String getLicence_number() {
        return licence_number;
    }

    public void setLicence_number(String licence_number) {
        this.licence_number = licence_number;

    }

    public String getThe_specialisation() {
        return the_specialisation;
    }

    public void setThe_specialisation(String the_specialisation) {
        this.the_specialisation = the_specialisation;
    }

    public static int getDoc_count() {
        return doc_count;
    }

    public static void setDoc_count(int doc_count) {
        Doctor.doc_count = doc_count;
    }

    public Doctor(String firstName, String lastName, String DOB, String mobileNO, String licence_number, String the_specialisation ) {
        super(firstName, lastName, DOB, mobileNO);
        this.licence_number=licence_number;
        this.the_specialisation=the_specialisation;
        doc_count++;
    }


}
