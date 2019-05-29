 /*Here I'm going to do Patient class which has all the infromations for patient like : name, surname, age, ID, adress, disease etc.
  We will need these informations at DataBase class, so we will be connected to informations by calling the method PatientInformations(or object Patient) */  
 public class Patient{
  
	 public String name;
   private String  surname, gender, email, adress, disease;
   private String age, user_ID, phone_number, dayOfRegistration;
   
       public Patient(String a,String b,String c,String d,String t,String r,String i,String u,String y,String o)//the constructor where we initialize variables.
   { 
       name=a;
       surname=b;
       gender=c;
       email=d;
       adress=t;
       age=i;
       user_ID=u;
       disease=r;
       phone_number=y;
       dayOfRegistration=o;
		
	}
   

  public String PatientInformations()//method PatientInformations which holds all the informations.
  {
 
		String informations=("\n"+
						"\nName:                             "+name+
						"\nSurname:                          "+surname+
						"\nGender:                           "+gender+
                  "\nAge:                              "+age+
                  "\nID:                               "+user_ID+
                  "\nemail:                            "+email+
                  "\nadress:                           "+adress+
                  "\ndisease:                          "+disease+
                  "\nphoneNumber:                      "+phone_number+
                  "\nDay of registration:              "+dayOfRegistration+
                  
                  
						"\n");
		return informations;	
	}}
 