package soldesk.java.work5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Doctor doctor = new Doctor();
			Nurse nurse = new Nurse();
			Patient patient = new Patient();
			
			nurse.sendPaperToPatient(patient);
			patient.writePaper();
			patient.sendPapertoNurse(nurse);
			
			nurse.sendPaperToDoctor(doctor);
			doctor.treatPatient();
			doctor.sayResult();
	}

}
