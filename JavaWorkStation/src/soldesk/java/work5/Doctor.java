package soldesk.java.work5;

public class Doctor {
	Paper paper;

	public void calculate() {
		
		paper.patientStdWeight = (paper.patientHeight - 100) * 0.9;
		paper.patientBimando = (paper.patientWeight / paper.patientStdWeight) * 100;
		paper.result = "저체중";
		if(paper.patientBimando > 120) {
			paper.result = "비만";
		}else if(paper.patientBimando > 80) {
			paper.result = "정상";
		}
		
	}

	public void sayResult() {
		calculate();
		
		System.out.printf("표준체중 : %.1fkg\n", paper.patientStdWeight);
		System.out.printf("비만도 : %.1f%%\n", paper.patientBimando);
		System.out.println(paper.result);
	}

	public void receivePaper(Paper paper) {
		// TODO Auto-generated method stub
		this.paper = paper;
	}

	public void treatPatient() {
		// TODO Auto-generated method stub

	}
}
