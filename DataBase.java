import java.util.ArrayList;
import javax.swing.*;

public class DataBase
{    // Creating an ArrayList of Patients
     static ArrayList<Patient> PatientList = new ArrayList<Patient>();
     
     public int  PatientOption;
     public int option ;
     public String name;
     private String  surname, gender, email, adress, disease;
     private String age, user_ID, phone_number, dayOfRegistration; 
    
     public void Menu()
     {
       JOptionPane.showMessageDialog(null," Welcome to Patient List!\n\n\n\n"+
                         "***********************************************************************\n"+
                          "Read and type  one of the command to do the instruction below :  "+"\n"+
		                   "***********************************************************************\n\n\n"+
                         "   COMMAND                             INSTRUCTION                       \n\n "+
		                   "-->  1                       Add a patient  to the Hospital."+"\n\n"+
		                   "-->  2                       Remove a patient from the Hospital List."+"\n\n"+
		                   "-->  3                       Show  List of Patients."+"\n\n"+ 
                         "-->  4                       Empty the Hospital.\n\n"+
                         "-->  5                       Back to main menu.\n\n"+
                         "-->  0                       Exit hospital registration. \n\n");
                         
		String a=JOptionPane.showInputDialog("--> Enter the command for the instruction that you want : <--");
      if (a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("0")){option=new Integer(a).intValue();}
    else{  JOptionPane.showMessageDialog(null,"The command u typed is out of options ,try again ");
    this.Menu(); }
    }
    public  void addPatient()
    {//this methods creates new patients and an ArrayList grows its size automatically when new elements are added to it.
      name=JOptionPane.showInputDialog("--> Type the  name of the patient: <-- ");
		surname=JOptionPane.showInputDialog("-->  Type the surname of the patient:  <-- ");
		gender=JOptionPane.showInputDialog("--> Type the gender of the patient:  <--");
		age=JOptionPane.showInputDialog("--> Type the age of the patient:  <-- ");
      user_ID=JOptionPane.showInputDialog("--> Type the ID of the patient:  <-- ");
      email=JOptionPane.showInputDialog("--> Type the email of patient:  <-- ");
      adress=JOptionPane.showInputDialog("--> Type the adress of patient: <-- ");
      disease=JOptionPane.showInputDialog("--> Type the disease of patient: <--");
      phone_number=JOptionPane.showInputDialog("--> Type the phone number of  patient: <--");
      dayOfRegistration=JOptionPane.showInputDialog("--> Type the day of registration of  patient: <-- ");
		
		Patient new_Patient=new Patient(name,surname, gender, email, adress, disease,age, user_ID, phone_number, dayOfRegistration);//we call Patient object to keep the informations we add.		
      PatientList.add(new_Patient);//here we add the patient to the ArrayList (PatientList) .
		JOptionPane.showMessageDialog(null,"****************************************************************************"+"\n"
		+                                  " You have successfully added the patient to the patient list!\n"+
		                                   "*****************************************************************************");	
	}
    public void showPatientList()
    {//and here this method tells us how many patients do we have.
		if (PatientList.size() == 0){//If the PatientList is empty,we will tell you by a window and than it goes back to main menu for another option(like adding patient).
			JOptionPane.showMessageDialog(null,"****************************************************************"+"\n"+
			                                        "The Hospital is Emply! Please add a patient first!\n"
			+                                  "*****************************************************************");
			Menu();} 
      else {//and if patient list isn't empty then the list of patients will be displayed and you will see how many patient do you have.					
			   for (int i = 0; i < PatientList.size(); i++)
            { JOptionPane.showMessageDialog(null,"\n**********************************************************\n"
            +                                              "        Patient Index: ["+(i+1)+"]"+"\n"
            +                                      "************************************************************\n"
				+PatientList.get(i).PatientInformations()+"\n");}		
           }			
	  }

     public void removePatient()
     {//method removePatient removes the patient which we want to remove ( we do it by choosing the index of patient).
      
		JOptionPane.showMessageDialog(null,"**********************************************************************************************"+"\n"+
		                                         " Now will be displayed all the patients that are in hospital (patient list): "+"\n"+
		                                   "**********************************************************************************************");
      showPatientList();
		String c=JOptionPane.showInputDialog("\n\n> Choose which patient do you want to remove by writing down it's number(index): ");
		int PatientOption = new Integer(c).intValue()-1;//register patients option
		               
      if( PatientOption >= PatientList.size())
         {JOptionPane.showMessageDialog(null,"You have to type a number of patient that's in the list:");
               this.removePatient();}
     else	if (PatientOption >= 0 && PatientOption < PatientList.size())
             { //so if the patientOption is a nonnegative number and it's less than patientList than we can remove it.
            JOptionPane.showMessageDialog(null,"*************************************************************************\n"+
                                                                   "    Patient  "+(c)+" is deleted.\n"+
                                              "**************************************************************************\n");
            PatientList.remove(PatientOption);
             }
	   }		
	

     public void clearHospital()
     {//this method means that all patients will be deleted so we will have an empty PantientList.
		if (PatientList.size() == 0){//If the PatientList is empty,we will tell you by a window and than it goes back to main menu for another option(like adding patient).
			JOptionPane.showMessageDialog(null,"************************************************************************************"+"\n"+
			                                        "The Hospital is already Emply, it means that you don't have  patients to delete.\n"
			+                                  "*****************************************************************************************");
			Menu();} 

		String b=JOptionPane.showInputDialog("You have selected to delete all patients in the hospital. Type 7 if you still want to delete and type 8 if you don't want:");
		
     if(b.equals("7") && PatientList.size() > 0)
      {PatientList.clear();
       JOptionPane.showMessageDialog(null,"************************************************************************\n"
                                        +      "You have deleted all the patients so the patient list is empty.\n"+
                                          "**************************************************************************");}
      else{if(b.equals("8")){Menu();}}
		} 
 }
	
	





     
