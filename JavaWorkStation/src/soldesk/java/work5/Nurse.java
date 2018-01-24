package soldesk.java.work5;

public class Nurse {
	Paper paper;

	public void sendPaperToPatient(Patient patient) {
		// TODO Auto-generated method stub
		paper = new Paper();

		patient.receivePaper(paper);
	}

	public void receivePaper(Paper paper) {
		// TODO Auto-generated method stub
		this.paper = paper;
	}

	public void sendPaperToDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctor.receivePaper(paper);
	}

}
