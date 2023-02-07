import java.io.Serializable;
import java.time.LocalDateTime;

public class Person implements Serializable {

    //super class


    private String FirstName;
    private String LastName;
    private String DOB;
    private String mobileNO;

    public Person(String firstName, String lastName, String DOB, String mobileNO) {
        FirstName = firstName;
        LastName = lastName;
        this.DOB = DOB;
        this.mobileNO = mobileNO;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }


}
