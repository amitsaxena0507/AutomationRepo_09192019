package functions;

public class Patients {

	public static void main(String[] args) {
		Hospital hospital1=new Hospital();
		hospital1.hospitalName="Noble";
		hospital1.patientType="Bone injury";
		hospital1.specality="Orthopedic";
		hospital1.doctorsName="Dr.Sharma";
		hospital1.numOfBed=100;
		hospital1.numOfDoctors=10;
		hospital1.treatment();
		hospital1.capacity();
		
		Hospital hospital2 = new Hospital();
		hospital2.hospitalName="Columbia Asia";
		hospital2.patientType="Cancer";
		hospital2.specality="Oncologist";
		hospital2.doctorsName="Dr.Batra";
		hospital2.numOfBed=50;
		hospital2.numOfDoctors=5;
		hospital2.treatment();
		hospital2.capacity();
	
		Hospital hospital3 = new Hospital("Tooth Ache","Manohar","Dentist",1000,100,"City Hospital");
		hospital3.treatment();
		hospital3.capacity();
	}

}
