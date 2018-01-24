package soldesk.java.work5;

import java.util.Scanner;

public class Patient {
	Scanner pencil = new Scanner(System.in);
	Paper paper;

	public void writePaper() {

		System.out.print("이름 : ");
		paper.patientName = pencil.nextLine();

		System.out.print("키 : ");
		paper.patientHeight = pencil.nextDouble();

		System.out.print("몸무게 : ");
		paper.patientWeight = pencil.nextDouble();

	}

	public void receivePaper(Paper paper) {
		// TODO Auto-generated method stub
		this.paper = paper;
	}

	public void sendPapertoNurse(Nurse nurse) {
		// TODO Auto-generated method stub
		nurse.receivePaper(paper);

	}
}
