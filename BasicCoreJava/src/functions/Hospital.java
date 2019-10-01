package functions;

public class Hospital {
	public String patientType;
	public String doctorsName;
	public String specality;
	public int numOfBed;
	public int numOfDoctors;
	public String hospitalName;
	public void treatment()
	{
		System.out.println("Patients with the"+patientType+" will be send to the"+ specality+" doctor"+doctorsName);
	}

	public void capacity()
	{
		System.out.println(hospitalName+" hospital has"+numOfBed+" beds and "+numOfDoctors+" doctors");
	}
	// default constructor
	public Hospital()
	{

	}
	public Hospital (String patientType,String doctorsName,String specality,int numOfBed,int numOfdoctors,String hospitalName)
	{
		patientType=this.patientType;
		doctorsName=this.doctorsName;
		specality=this.specality;
		numOfBed=this.numOfBed;
		numOfdoctors=this.numOfDoctors;
		hospitalName=this.hospitalName;
	}
}
