package soldesk.java.work5;

public class Doctor {
	Paper paper;

	public void calculate() {
		
		paper.patientStdWeight = (paper.patientHeight - 100) * 0.9;
		paper.patientBimando = (paper.patientWeight / paper.patientStdWeight) * 100;
		paper.result = "��ü��";
		if(paper.patientBimando > 120) {
			paper.result = "��";
		}else if(paper.patientBimando > 80) {
			paper.result = "����";
		}
		
	}

	public void sayResult() {
		calculate();
		
		System.out.printf("ǥ��ü�� : %.1fkg\n", paper.patientStdWeight);
		System.out.printf("�񸸵� : %.1f%%\n", paper.patientBimando);
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
