import javax.swing.*;
// In this class I'm going to manipulate with options that a user can give, and I'm going to write main method for testing these classes.
public class Hospital
{
      DataBase hospital=new DataBase();

      public void Data()
      {
        hospital.Menu();//Displays the main menu and ask for options.
        while(hospital.option != 0 )
        {
         if(hospital.option==3 && hospital.PatientList.size()==0)
           {JOptionPane.showMessageDialog(null,"The Hospital is Emply! Please add a patient first!");
			   hospital.option=5;}
         if(hospital.option==3 && hospital.PatientList.size()>0)
           {hospital.showPatientList();
			  hospital.option=5;}
                   
		   if(hospital.option==1)
           {hospital.addPatient();
            hospital.option=5;}
               	
		   if(hospital.option==2 )
         {hospital.removePatient();
         if(hospital.PatientList.size() > 0)
            {hospital.Menu();}
				else{JOptionPane.showMessageDialog(null,"The Hospital is Emply! Please add a patient first!\n");
						 hospital.Menu();}}
        			
         if(hospital.option == 4 && hospital.PatientList.size()>0)
           {hospital.clearHospital();	
            hospital.option=5;}
         if(hospital.option==4 && hospital.PatientList.size()==0)
           {JOptionPane.showMessageDialog(null,"The Hospital is already Emply, it means that you don't have  patients to delete.");
            hospital.option=5;}
					
          if(hospital.option == 5)
				{hospital.Menu();}
		
          if(hospital.option == 0)
          {JOptionPane.showMessageDialog(null,"You exited the hospital (Patient List)");
			  return;
		    }
     }
}
 
 public static void main(String[] args)
 {
  Hospital obj= new Hospital();
  obj.Data();
 
	}


}