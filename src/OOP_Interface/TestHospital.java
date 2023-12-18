package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.ENTServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.gynoServices();
		
		fh.medicalTraining();//individual
		fh.medicalInsurance();//individual
		fh.RnD();//default method 
		
		System.out.println(USMedical.min_fee);//10
		System.out.println(FortisHospital.min_fee);//50
		
		USMedical.billing();//static method 
		
		fh.medicalNewsPublish();//inherited from parent class
		fh.covidVaccination();//inherited from parent interface
		
		//top casting: child class object can be referred by parent interface ref variable
		// in Top casting alllowed only parent and overidden from parent methods 
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();
			
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		
		//down casting: NA
		//FortisHospital fh1 = new USMedical();
		
		
		//
	
		
	}

}
