import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager
{
    static ArrayList<Doctor> doctors_array = new ArrayList<Doctor>(); //create an arraylist
    static ArrayList<Consultation> consultations_array = new ArrayList<Consultation>(); //create an arraylist
    public static void main(String[]args)
    {
        WestminsterSkinConsultationManager manager = new WestminsterSkinConsultationManager();
        Read_file();
        try
        {
            boolean menu_loop = true;
            while (menu_loop)
            {
                Scanner input_data = new Scanner(System.in);
                System.out.println("-----Console Menu-----");
                System.out.println("""
                        Press 1 to Add a new doctor
                        Press 2 to Delete a Doctor
                        Press 3 to Print the list of the Doctor
                        Press 4 to Save in a File
                        Press 5 to start GUI
                        Press 6 to Exit in menu
                        """
                );
                System.out.print("Please Enter the Number :-");
                String number = input_data.next();

                switch (number)
                {
                    case "1":
//                        doctors_array.add(new Doctor("s","d","43rf",666549988,"af2","hg4h35j"));
//                        doctors_array.add(new Doctor("a","a","324",8765,"12e2d","herf34"));
//                        doctors_array.add(new Doctor("b","e","54",23456,"5tre3","hg43r"));
//                        doctors_array.add(new Doctor("t","y","234",9876543,"de4","hg4456y"));
                        if (Doctor.doc_count <= 10){
                        manager.add_Doctor();}
                        else {
                            System.out.println("Max Doctor Count is 10");
                        }
                        break;
                    case "2":
                        manager.remove_doc();
                        break;
                    case "3":
                        manager.print_list();
                        break;
                    case"4":
                        manager.save_file();
                        break;
                    case "5":
                        manager.GUI();
                        break;
                    case "6":
                        menu_loop = false;
                        break;
                }
            }

        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            e.printStackTrace();
        }

    }

    public void add_Doctor(){

        System.out.println("which doctor do you want to add :-");
        System.out.print("Doctors First Name :-");
        Scanner deail = new Scanner(System.in);
        String Fname= deail.next();
        System.out.print("Doctors Second Name :-");
        String Sname= deail.next();
        System.out.print("Date of Birth :-");
        String Dob_doc= deail.next();
        System.out.print("Mobile Number :-");
        String doc_mobile = deail.next();
        System.out.print("licence_number :-");
        String doc_licence_number = deail.next();
        System.out.println("the specialisation :- \n");

        String Doc_Spec;
        while (true)
        {
            try
            {
                System.out.println("""
                Press 1 to cosmetic dermatology
                Press 2 to medical dermatology
                Press 3 to paediatric dermatology
                """);
                System.out.print("which specialisation you need :-");

                int specialisation = deail.nextInt();


                if (specialisation == 1) {
                    Doc_Spec = "cosmetic dermatology";
                    break;
                } else if (specialisation == 2) {
                    Doc_Spec = "medical dermatology";
                    break;
                } else if (specialisation == 3) {
                    Doc_Spec = "paediatric dermatology";
                    break;
                } else {
                    System.out.println("2");
                    continue;
                }

            }
            catch (InputMismatchException e)
            {
                System.out.println("3");
            }

        }
        System.out.println("Doctor Add successfully \n");
        Doctor new_doc = new Doctor(Fname,Sname,Dob_doc,doc_mobile,doc_licence_number,Doc_Spec);
        doctors_array.add(new_doc);
    }
    public void print_list()
    {
        for (int i = 0; i < doctors_array.size(); i++) {
            System.out.println("Doctor" + " "+(i+1)+ " " +"Details" );
            System.out.print("Doctor Name :-");
            System.out.println(doctors_array.get(i).getFirstName() + doctors_array.get(i).getLastName());
            System.out.print("Doctor Birthday is :-");
            System.out.println(doctors_array.get(i).getDOB());
            System.out.print("Doctor Mobile Number :-");
            System.out.println(doctors_array.get(i).getMobileNO());
            System.out.print("Doctor Licence Number :-");
            System.out.println(doctors_array.get(i).getLicence_number());
            System.out.print("Doctor specialisation is :- ");
            System.out.println(doctors_array.get(i).getThe_specialisation() + '\n');
        }
    }

    public void remove_doc(){
        print_list();
        System.out.print("which Doctor Do you want to remove :-");
        Scanner temp =new Scanner(System.in);
        int re_doc = temp.nextInt();

        doctors_array.remove(re_doc - 1);
        Doctor.doc_count--;
        System.out.println("Doctor Removed successfully");
    }

    public static void Read_file(){

        try {
            FileInputStream fileIn = new FileInputStream("Doctor_data.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            doctors_array = (ArrayList<Doctor>) objectIn.readObject();

            System.out.println("Data loaded from file successfully!");
            objectIn.close();
            fileIn.close();
        } catch (Exception ignored) {
//            e.printStackTrace();
        }


    }

     public void save_file() {

        try {
            FileOutputStream fileOut = new FileOutputStream("Doctor_data.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(doctors_array);

            objectOut.close();
            fileOut.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }


    public void GUI(){
        GUI gui = new GUI(doctors_array);
        gui.setVisible(true);
    }

    public static ArrayList<Doctor> getDoctors_array() {
        return doctors_array;
    }

    public static void setDoctors_array(ArrayList<Doctor> doctors_array) {
        WestminsterSkinConsultationManager.doctors_array = doctors_array;
    }
}
