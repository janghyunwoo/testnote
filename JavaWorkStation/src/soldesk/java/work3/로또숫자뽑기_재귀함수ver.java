package soldesk.java.work3;

import java.util.Random;

public class 로또숫자뽑기_재귀함수ver {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myLotto = new int[6];
		
		LottoMachine lottoMachine = new LottoMachine(6);

		for (int j = 0; j < myLotto.length; j++) {
			myLotto[j] = lottoMachine.getLottoball(j);
			System.out.print(myLotto[j] + " ");
		}

//		System.out.print(lotto[j] + " ");
	}

}

class LottoMachine{
	int lottoRange;
	int[] lotto = new int[lottoRange];
	Random r = new Random();
	
	public LottoMachine(int lottoRange) {
		// TODO Auto-generated constructor stub
		lotto = new int[lottoRange];
	}

	int getLottoball(int s){
		int numberBall = r.nextInt(6)+1;
		
		for (int a = 0; a < lotto.length; a++) {
			if(numberBall == lotto[a]){
				return getLottoball(s);
			}
		}
		lotto[s]=numberBall;
		
		return numberBall;
		
	}
	
	
	
}

/*			if (lotto[a] == numberBall) {
break;
}
if (a == lotto.length - 1) {
lotto[i] = numberBall;
i++;
}*/













