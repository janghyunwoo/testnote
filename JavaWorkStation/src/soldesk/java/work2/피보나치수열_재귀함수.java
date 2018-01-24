package soldesk.java.work2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.omg.CORBA.Request;

public class 피보나치수열_재귀함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(compareNumber(10, 20));
		 * System.out.println(hollo(15)); System.out.println(getVAT(20));
		 * System.out.println(calculateSalary(120));
		 */

		Integer[] arr = { 4, 23, 12, 16, 91, 59, 73, 28, 33, 41 };

		
		//Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
			
		}
		System.out.println();
		
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
//		Collections.reverse(list);
		Integer[] arr1 =  list.toArray(new Integer[list.size()]);
	
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j] + " ");
			
		}
		System.out.println();
		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + " ");
			
		}

		int[] arrs = { 5,4,3,2,1,0 };
		
		bubbleSort(arrs);
		System.out.println("\n버블정렬");
		for(int a:arrs){
			System.out.print(a+" ");
		}
		
		
		System.out.println();
		System.out.println(fibo1(5));
		// quickSort(arrs, 0, arrs.length - 1);

		// Arrays.sort();

		// Collections.reverse(list);
		/*
		 * for (int i : arrs) { System.out.print(i + " "); }
		 */

	}
public static int fibo1(int num) {
		

/*		if(num==1)
			return 1;

		if(num==2)
			return 2;
		
		if(num==3)
			return 3;
		
		return fibo1(num-1)*fibo1(num-2)*fibo1(num-3);*/
	
		//간소화
		return (num<=3)? num : fibo1(num-1)*fibo1(num-2)*fibo1(num-3);
		
	}
	
	public static int fibo(int num) {
		
		if(num==1){
			return 1;
		}
		if(num==2)
		{
			return 1;
		}
		
		return fibo(num-1)+fibo(num-2);
		
	}

	public static int factorial(int num) {
		
		if(num==1){
			return 1;
		}
		
		return factorial(num-1)*num;
		
	}

	public static int partition(int arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			// 값을 비교하고 로우와 하이를 이동시키면서 값의 교환이 이루어지는 함수
			int pivotNewIndex = partition(arr, left, right);
			// quick sort의 설명중
			// 자주 나오는 '재귀', '분할' 이라고 설명되어지는 부분이다.
			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}

	}

	public static void bubbleSort(int arr[]) {
		int temp;
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j=1;j<arr.length;j++) {
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				if(j==arr.length-1){
					for (int a:arr) {
						System.out.print(a+" ");
					}
					System.out.println();
				}
			}
		}
		
		
	}

	public static int compareNumber(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static String hollo(int age) {
		if (age >= 10) {
			return "안녕";
		} else if (age >= 20) {
			return "안녕하세요";
		} else if (age >= 30) {
			return "안녕하십니까";
		} else {
			return "아가들은 잠이나 자라";
		}
	}

	public static double getVAT(int price) {
		return price * 0.1;
	}

	public static int calculateSalary(int price) {
		return price * 12;
	}
}
